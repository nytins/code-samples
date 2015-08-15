package com.nytins.spark_cassandra;

import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import static com.datastax.spark.connector.japi.CassandraJavaUtil.*;

public class ReadUsers {

	public static void main(String... args) {

		SparkConf conf = new SparkConf()
			.setMaster("local")
			.setAppName("ReadUsers")
			.set("spark.cassandra.connection.host", "127.0.0.1");

		try(JavaSparkContext context = new JavaSparkContext(conf)) {

			JavaRDD<User> userRDD = javaFunctions(context)
				.cassandraTable("sample_keyspace", "users", mapRowTo(User.class));
			
			List<User> users = userRDD.collect();
			for(User user : users) 
				System.out.println(user);
		}
	}
}