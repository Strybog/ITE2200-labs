## Model View Controller Pattern
____

Building a simple Blog Desktop Application with Java implementing MVC pattern.

# BlogApp
This Java project implements the model, your DTOs and DAOs for interacting with the database.

Before you run this project, ensure you have PostgreSQL running and follow the `init.sql` script in this directory:

```sql
# create a database
CREATE DATABASE blog;

# create your table for storing blog posts
CREATE TABLE post (
  id SERIAL PRIMARY KEY,
  title TEXT NOT NULL,
  description TEXT NOT NULL,
  author VARCHAR(100) NOT NULL
);

```


# BlogAppFX
This Java project implements the views and controllers, for interacting with the model in BlogApp project.

### About the dependencies

These are related to running `JavaFX`.
```xml
<dependency>
    <groupId>org.openjfx</groupId>
    <artifactId>javafx-controls</artifactId>
    <version>13</version>
</dependency>
<dependency>
    <groupId>org.openjfx</groupId>
    <artifactId>javafx-fxml</artifactId>
    <version>13</version>
</dependency>
```
___

`Jfoenix` is a JavaFX Material Design Library for adding aesthetics to your views.
```xml
<dependency>
    <groupId>com.jfoenix</groupId>
    <artifactId>jfoenix</artifactId>
    <version>9.0.1</version>
</dependency>
```
___

This is custom for the model developed in the `BlogApp` project, and the only one you would need to configure since it isn't public from the maven repository but we'll make it accessible from your local system.
```xml
<dependency>
    <groupId>ite.blog</groupId>
    <artifactId>BlogApp</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

> To set up this dependency

In the root of your `BlogApp` project, run 
```shell
mvn install
```

Once successful, copy the details on groupId, artifactId and version from the `pom.xml` file in the `BlogApp` to the `BlogAppFX's pom.xml.` 