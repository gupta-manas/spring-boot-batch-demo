drop table people if exists;

CREATE SEQUENCE seq_people
MINVALUE 1
START WITH 1
INCREMENT BY 1
CACHE 10;

CREATE TABLE PEOPLE (
	person_id int NOT NULL,
	first_name varchar(20),
	last_name varchar(20),
	PRIMARY KEY(person_id)
);