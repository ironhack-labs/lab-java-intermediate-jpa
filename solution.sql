1. Using advanced database features (like window functions)

Native SQL allows using functions like ROW_NUMBER() or RANK().

Example:

SELECT name, ROW_NUMBER() OVER (ORDER BY name) FROM contacts;

JPQL does not support these kinds of functions because it is designed to be database-independent.

I would use native SQL here because these functions are very useful for ranking and advanced queries, and JPQL cannot handle them.

2. Querying tables that are not mapped as entities

With native SQL, we can query any table in the database.

Example:

SELECT * FROM audit_log;

JPQL only works with entities. If a table is not mapped as an entity class, JPQL cannot access it.

I would use native SQL in this case because it allows direct access to any table without creating extra entity classes.

3. Using UNION to combine results

Native SQL supports combining results from multiple queries using UNION.

Example:

SELECT first_name FROM employees
UNION
SELECT first_name FROM contacts;

JPQL does not support UNION because it focuses on entity-based queries.

I would use native SQL here because it is the easiest way to combine data from different tables.