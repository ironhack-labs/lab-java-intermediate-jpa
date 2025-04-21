CREATE TABLE task_joined (
    task_id int NOT NULL AUTO_INCREMENT,
    title varchar(255) NOT NULL,
    due_date varchar(255) NOT NULL,
    status boolean NOT NULL,
    PRIMARY KEY (task_id)
);

CREATE TABLE billeable_task (
	task_id int PRIMARY KEY,
	hourly_rate varchar(255) NOT NULL,
    FOREIGN KEY (task_id) REFERENCES task_joined(task_id)
);

CREATE TABLE internal_task (
	task_id int PRIMARY KEY,
    FOREIGN KEY (task_id) REFERENCES task_joined(task_id)
);