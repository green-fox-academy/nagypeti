CREATE DATABASE todo_db;

USE todo_db;

CREATE TABLE Users (
userID INT AUTO_INCREMENT PRIMARY KEY,
firstName VARCHAR(30) NOT NULL,
lastName VARCHAR(30) NOT NULL
);

CREATE TABLE Tasks (
ownerID INT NOT NULL,
taskID INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(30) NOT NULL,
description BLOB,
isCompleted BOOLEAN DEFAULT false NOT NULL,
deadline DATE NOT NULL,
FOREIGN KEY (ownerID) REFERENCES Users (userID)
);

INSERT INTO Users (firstName, lastName) VALUES 
("Derek", "Banas"), 
("Mihaly", "Barczi"), 
("Peter", "Nagy"), 
("Viktor", "Orban");

INSERT INTO Tasks (name, description, deadline, ownerID) VALUES
("Walk the dog", NULL, 2018-12-24, 1)
("Buy milk", "", 2018-12-11, 2)
("Do homework", "", 2018-12-11, 3)
("Ruin a country", "", 2020-04-14, 4);