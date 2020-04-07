## Model View Controller Pattern
____

Building a simple Blog Desktop Application with Java implementing MVC pattern.

### BlogApp
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
