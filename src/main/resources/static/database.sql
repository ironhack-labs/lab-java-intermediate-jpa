CREATE TABLE tasks (
    task_id int NOT NULL AUTO_INCREMENT,
    title varchar(255) NOT NULL,
    due_date varchar(255) NOT NULL,
    status boolean NOT NULL,
    discri varchar(255) NOT NULL,
    hourly_rate decimal(10,2),
    PRIMARY KEY (task_id)
);