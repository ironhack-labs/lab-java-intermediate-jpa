CREATE TABLE contacts (
    contact_id int NOT NULL AUTO_INCREMENT,
    title varchar(255) NOT NULL,
    company varchar(255) NOT NULL,
    first_name varchar(255) NOT NULL,
    last_name varchar(255) NOT NULL,
    middle_name varchar(255) NOT NULL,
    salutation varchar(255) NOT NULL,
    PRIMARY KEY (contact_id)
);