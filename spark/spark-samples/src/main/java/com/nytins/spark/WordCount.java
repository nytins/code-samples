package com.nytins.spark;

import java.util.Arrays;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import scala.Tuple2;

public class WordCount {

	public static void main(String... args) {
		String logFile = "README.md";
		SparkConf conf = new SparkConf().setAppName("WordCount").setMaster("local");

		try(JavaSparkContext sc = new JavaSparkContext(conf)) {
			
			JavaRDD<String> linesRdd = sc.textFile(logFile);
			JavaRDD<String> wordsRdd = linesRdd.flatMap(line -> Arrays.asList(line.split(" ")));
			JavaPairRDD<String, Integer> pairs = wordsRdd.mapToPair(word -> new Tuple2<String, Integer>(word, 1));
			JavaPairRDD<String, Integer> reducedPairs = pairs.reduceByKey((a, b) -> a + b);
			
			System.out.println("Words with count: " + reducedPairs.collectAsMap());
		}
	}
}
