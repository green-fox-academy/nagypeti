## :books: Exam requirements on database: :truck:


### 1. ORM

ORM - Object Relational Mapping - a programming technique for converting data between incompatible type systems (Java -> MySQL) example tools (frameworks) for ORM: Hibarnate, iBatis, TopLink, etc.

ORM - is a technique to use CRUD (Create Read Update Delete) operations from an OOP in a relational database - we using data layer, its going to convert our commands of CRUD as a database query

In programming: an entity(model) represents a table in the database, and its fields/properties are the columns

JPA - Java Persistence API - makes ORM more consistent. It is a standard what implemented in more ORM tools.

### 2. CRUD (create, read, update, and delete)

Within computer programming, the acronym CRUD stands for create, read, update and delete. These are the four basic functions of persistent storage.

| Operation	| SQL	| HTTP	| RESTful WS	| DDS |
| --- | | --- | --- | --- | --- |
|Create |	INSERT |	PUT / POST |	POST |	write  |
|Read (Retrieve) |	SELECT |	GET	 | GET	| read / take  |
|Update (Modify) |	UPDATE |	PUT / POST / PATCH | PUT |	write  |
|Delete (Destroy)|	DELETE |	DELETE |	DELETE |	dispose  |


### 3. foreign key

**Definition:**
A foreign key is a field in a table that matches another field of another table. A foreign key places constraints on data in the related tables, which enables MySQL to maintain referential integrity.

**We have two tables: customers and orders.** Each customer has zero or more orders and each order belongs to only one customer. The relationship between customers table and orders table is one-to-many, and it is established by a foreign key in the orders table specified by the customerNumber field. The customerNumber field in the orders table relates to the customerNumber primary key field in the customers table.

The customers table is called parent table or referenced table, and the orders table is known as child table or referencing table.

A foreign key can be a column or a set of columns. The columns in the child table often refer to the primary key columns in the parent table.

A table may have more than one foreign key, and each foreign key in the child table may refer to a different parent table.

### 4. SQL syntax

**SQL database statements**

Create a database
```SQL
CREATE DATABASE database_name;
```
Delete a database and its content
```SQL
DROP DATABASE database_name;
```
```SQL
USE database_name;
```

**SQL SELECT query usage**

Select columns from a table.
```SQL
SELECT column1, column2....columnN
FROM   table_name;
```
Select only distinct elements (removes duplicates) from table
```SQL
SELECT DISTINCT column1, column2....columnN
FROM   table_name;
```
Filter data using WHERE with one condition
```SQL
SELECT column1, column2....columnN
FROM   table_name
WHERE  CONDITION;
```
Filter data using WHERE with more conditions given
```SQL
SELECT column1, column2....columnN
FROM   table_name
WHERE  CONDITION-1 {AND|OR} CONDITION-2;
```
The IN operator allows you to specify multiple values in a WHERE clause.
The IN operator is a shorthand for multiple OR conditions.
```SQL
SELECT column1, column2....columnN
FROM   table_name
WHERE  column_name IN (val-1, val-2,...val-N);
```
The BETWEEN operator selects values within a given range. The values can be numbers, text, or dates. The BETWEEN operator is inclusive: begin and end values are included.
```SQL
SELECT column1, column2....columnN
FROM   table_name
WHERE  column_name BETWEEN val-1 AND val-2;
```
The LIKE operator is used in a WHERE clause to search for a specified pattern in a column.
There are two wildcards often used in conjunction with the LIKE operator:
- % - The percent sign represents zero, one, or multiple characters
- _ - The underscore represents a single character

```SQL
SELECT column1, column2....columnN
FROM   table_name
WHERE  column_name LIKE { PATTERN };
```
The ORDER BY keyword is used to sort the result-set in ascending or descending order. By default its ascending.
```SQL
SELECT column1, column2....columnN
FROM   table_name
WHERE  CONDITION
ORDER BY column_name {ASC|DESC};
```
The SUM() function returns the total sum of a numeric column.
```SQL
SELECT SUM(column_name)
FROM   table_name
WHERE  CONDITION
GROUP BY column_name;
```
The COUNT() function returns the number of rows that matches a specified criteria.
```SQL
SELECT COUNT(column_name)
FROM   table_name
WHERE  CONDITION;
```
The AVG() function returns the average value of a numeric column.
```SQL
SELECT AVG(column_name)
FROM table_name
WHERE CONDITION;
```

### 5. JOIN

A relational database consists of multiple related tables linking together using common columns which are known as foreign key columns.

The join condition is the rule for matching rows in the main table with the rows in the other tables

Typically, we join tables that have foreign key relationships.

MySQL supports the following types of joins:

**CROSS JOIN** (FULL JOIN): The result set will include all rows from both tables, where each row in the result set is the combination of the row in the first table with the row in the second table.
- We give the two tables to "merge", if we use WHERE condition after and the two tables has a relationship, it works like INNER JOIN
```SQL
SELECT
    *
FROM
    T1
        CROSS JOIN
    T2;
```

**INNER JOIN** : matches rows in one table with rows in other tables and allows you to query rows that contain columns from both tables.
- After the FORM the table we want to join the other tables to.
- After the INNER JOIN the table that we want to join with the main table
- After ON the join condition appears
- We can join more tables and add WHERE condition
```SQL
SELECT
    productCode,
    productName,
    textDescription
FROM
    products
        INNER JOIN
    productlines USING (productline);
```

**LEFT JOIN** : Return all records from the left table, and the matched records from the right table. NULL will appear in columns from the right table for the rows that have no match in the left table.

For example: We want to select all orders that belong to each customer:
- First we select the tables we want to see in the result (in the order we want to see them)
- Select the main table
- After LEFT JOIN we pass the table we want to join to the main table
- After ON we define on which column we want to join the two tables (its have to be a column which is represented in both tables)
```SQL
SELECT
 c.customerNumber,
 c.customerName,
 orderNumber,
 o.status
FROM
 customers c
LEFT JOIN orders o ON c.customerNumber = o.customerNumber;
```
Because we used the same column name ( customerNumber) for joining two tables, we can make the query shorter by it the following syntax:
```SQL
LEFT JOIN orders USING (customerNumber);
```

**RIGHT JOIN** : Return all records from the right table, and the matched records from the left table
- It is important to emphasize that RIGHT JOIN and LEFT JOIN clauses are functionally equivalent and they can replace each other as long as the table order is switched
```SQL
SELECT
    *
FROM t1
    RIGHT JOIN t2 ON join_predicate;
```


if the common columns of the two table have the same name, you can use the **USING (common_column);** syntax:

_The following describes how the RIGHT JOIN clause works:_
All rows from the t2 table (right table) will appear at least once in the result set.
Based on the join_predicate, if no matching row from the t1 table (left table) exists, NULL will appear in columns from the left (t1) table for the rows that have no match in the right (t2) table.


**SQL JOIN clause visualisation:**

![sql joins](https://4.bp.blogspot.com/-_HsHikmChBI/VmQGJjLKgyI/AAAAAAAAEPw/JaLnV0bsbEo/s1600/sql%2Bjoins%2Bguide%2Band%2Bsyntax.jpg)

### Examples:

**New specific query from database**

**Creating one-to-many, many-to-many connections**

_One-to-many_ - One customer can have many order, but one order can have only on customer. </br>
_Many-to-many_ - One book can have many author and one author can have many books.

**Basic SQL commands in terminal**

**Cascading deletion for connected records**


### + SQL statements:

Create user on the given host with password.
```SQL
CREATE USER 'user'@'localhost' IDENTIFIED BY 'password';
```
Grant privileges (all is enabling all operations n database to user) to user. We can use database.* if we want to grant access to the whole database.
```SQL
GRANT ALL PRIVILEGES ON database.table TO 'user'@'localhost';
```
Granting access (currently all priv.) to a table of the database to given user. </br>
If the user does not exist, then it gets created.

```SQL
GRANT ALL PRIVILEGES ON database.table TO 'post_user'@'localhost' IDENTIFIED BY 'randompass';
```
Delete user
```SQL
DROP USER 'user'@'localhost'
```
