SELECT *,
       ROW_NUMBER() OVER (ORDER BY salary DESC) AS rank
FROM employee;

----Native SQL allows the use of advanced SQL functions such as ROW_NUMBER(), RANK(), and DENSE_RANK().


WITH recent_tasks AS (
    SELECT * FROM tasks WHERE due_date > CURRENT_DATE
)
SELECT * FROM recent_tasks;

-----Native SQL supports WITH queries and recursive queries.


SELECT * FROM task_audit_log;

---Native SQL can directly query database views, logs, and audit tables.

