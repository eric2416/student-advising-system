CREATE DATABASE DesignProject;
USE DesignProject

CREATE TABLE SyracuseCourses (
	CourseID int NOT NULL PRIMARY KEY,
	Course varchar(5),
	CourseFullName varchar(200),
	CourseDays varchar(6),
	CourseTime varchar(12)
);

CREATE TABLE SyracuseAccounts (
	AccountNumber int NOT NULL PRIMARY KEY,
	AccountUserName varchar(50),
	AccoutFirstName varchar(30),
	AccountLastName varchar(30),
	AccountPassword varchar(30),
	AccountRole varchar(30)
);

--INSERT INTO SyracuseCourses(CourseID,Course,CourseFullName,CourseDays,CourseTime)
--VALUES (1,'ECS101','Intro to Computer Science','MoWe','11:00-12:50');
