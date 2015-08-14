package com.nytins.spark_cassandra;

import java.util.ArrayList;
import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import com.datastax.spark.connector.japi.CassandraJavaUtil;

public class CreateUsers {

	public static void main(String... args) {
		User user = new User(args[0], args[1], args[2], args[3]);

		SparkConf conf = new SparkConf()
			.setMaster("local")
			.setAppName("CreateUsers")
			.set("spark.cassandra.connection.host", "127.0.0.1");

		try(JavaSparkContext context = new JavaSparkContext(conf)) {

			List<User> users = new ArrayList<>();
			users.add(user);

			JavaRDD<User> userRDD = context.parallelize(users);

			CassandraJavaUtil.javaFunctions(userRDD)
				.writerBuilder("sample_keyspace", "users", CassandraJavaUtil.mapToRow(User.class))
				.saveToCassandra();
		}
	}

}