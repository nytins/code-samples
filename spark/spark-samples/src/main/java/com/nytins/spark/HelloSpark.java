package com.nytins.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class HelloSpark {

	public static void main(String... args) {
		String logFile = "README.md";
		SparkConf conf = new SparkConf().setAppName("HelloSpark").setMaster("local");

		try(JavaSparkContext sc = new JavaSparkContext(conf)) {
			
			JavaRDD<String> logData = sc.textFile(logFile).cache();

			long countAs = logData
						.filter(line -> line.contains("#"))
						.count();

			System.out.println("Number of lines with '#': " + countAs);
		}
	}
}
