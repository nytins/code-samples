## Prerequisites
Setup and start `Cassandra` on your local machine.
	
## Steps to run
1. Run the below command to setup sample keyspace and table:
```
$CASSANDRA_HOME/bin/cqlsh -f ./src/main/script/cassandra_table_setup.cql
```
2. Run the below command to execute insert code:
```
mvn exec:java -Dexec.arguments=John,Smith,john@smith.com,Miami
```
	
## Cleanup
Run the below command to delete the newly created keyspace and table:
```
$CASSANDRA_HOME/bin/cqlsh -f ./src/main/script/delete_table.cql
```

## Submitting job to `Spark` cluster
```
$SPARK_HOME/bin/spark-submit --class com.nytins.spark_cassandra.CreateUsers --master <master_url> target/spark-cassandra-integration-example-0.0.1-SNAPSHOT.jar John Smith john@smith.com Miami
```