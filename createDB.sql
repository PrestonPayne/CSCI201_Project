DROP DATABASE if EXISTS finalproject;
CREATE DATABASE finalproject;
Use finalproject;

CREATE TABLE User_ (
	user_id INT(11) PRIMARY KEY AUTO_INCREMENT,
    user_name VARCHAR(45) NOT NULL UNIQUE,
    user_pw VARCHAR(45) NOT NULL,
    user_email VARCHAR(45) NOT NULL UNIQUE, 
    user_age INT(3) NOT NULL,
    user_gender BOOLEAN NOT NULL,
    user_lat DOUBLE NOT NULL,
    user_lng DOUBLE NOT NULL
);

CREATE TABLE Event_ (
	event_id INT(11) PRIMARY KEY AUTO_INCREMENT,
    event_time TIME NOT NULL,
    event_date DATE NOT NULL,
    event_title VARCHAR(100) NOT NULL,
    event_des VARCHAR(200) NOT NULL,
    event_lat DOUBLE NOT NULL,
    event_lng DOUBLE NOT NULL,
    user_id INT(11) NOT NULL,
    FOREIGN KEY fk1(user_id) REFERENCES User_(user_id)
);

CREATE TABLE Event_Member (
	event_id INT(11),
    user_id INT(11),
    FOREIGN KEY fk4(event_id) REFERENCES Event_(event_id),
    FOREIGN KEY fk5user_user_(user_id) REFERENCES User_(user_id),
    PRIMARY KEY(event_id, user_id)
);
