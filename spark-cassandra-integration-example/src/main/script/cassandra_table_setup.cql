CREATE KEYSPACE sample_keyspace WITH REPLICATION = {'class':'SimpleStrategy', 'replication_factor':1};
USE sample_keyspace;
CREATE TABLE users (
	first_name text,
	last_name text,
	city text,
	email text,
	PRIMARY KEY (email)
);