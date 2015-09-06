#Spark Samples

## To run HelloSpark
Step 1
```
mvn package
```
Step 2
```
mvn exec:java -Dexec.mainClass=com.nytins.spark.HelloSpark
```
or
```
$SPARK_HOME/bin/spark-submit --class com.nytins.spark.HelloSpark --master local[4] target/spark-samples-0.0.1-SNAPSHOT.jar
```
