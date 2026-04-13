CREATE DATABASE task_db;
SELECT title, due_date,
       RANK() OVER (ORDER BY due_date) AS task_rank
FROM task;

-- JPQL does not support window functions such as RANK() or the OVER clause. These functions are used for analytical queries like ranking and advanced result processing.

-- Why native SQL?
-- Native SQL is required because it provides access to advanced analytical features that are not available in JPQL.


SELECT *
FROM contact
WHERE LOWER(company) LIKE LOWER('%tech%');


-- JPQL has limited support for database-specific behaviors such as collation and indexing strategies. It cannot fully utilize database-level optimizations for text search.

-- Native SQL allows full control over how searches are executed, including case sensitivity, collation, and performance optimizations.

CALL update_task_status();

-- JPQL is not designed to directly execute stored procedures and has very limited support for such operations. Native SQL is necessary when business logic is implemented at the database level or when performance-critical operations are handled via stored procedures.


-- Native SQL is preferred in these cases because it supports advanced SQL features not available in JPQL and Allows use of database-specific functionality. Also, it provides better performance and flexibility for complex operations