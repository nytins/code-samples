#Spring MVC UI with REST backend

## Running the example

###Step 1
```
mvn install
```

###Step 2: Run the REST app
```
cd spring-rest-example
mvn tomcat7:run
```

###Step 3: Verify its running
Open browser
```
http://localhost:8080/spring-rest-example/users
```
You should see JSON representation of 2 sample users.

###Step 4: Run the MVC app
```
cd spring-mvc-example
mvn tomcat7:run
```

###Step 5: Open browser
```
http://localhost:8080/spring-mvc-example/users
```
