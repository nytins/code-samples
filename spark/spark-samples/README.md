#Spark Samples

## To run HelloSpark
```
mvn package
$SPARK_HOME/bin/spark-submit --class com.nytins.spark.HelloSpark --master local[4] target/spark-samples-0.0.1-SNAPSHOT.jar
```
