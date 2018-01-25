CREATE DATABASE DesignProject;
USE DesignProject

CREATE TABLE SyracuseCourses (
	CourseID int NOT NULL PRIMARY KEY,
	Course varchar(6),
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

INSERT INTO SyracuseCourses(CourseID,Course,CourseFullName,CourseDays,CourseTime)
VALUES (1,'ECS101','Intro to Computer Science','MoWe','11:00-12:50');
INSERT INTO SyracuseCourses(CourseID,Course,CourseFullName,CourseDays,CourseTime)
VALUES (2,'CIS453','Software Spec and Design','TuTh','3:45-5:05');
INSERT INTO SyracuseCourses(CourseID,Course,CourseFullName,CourseDays,CourseTime)
VALUES (3,'CIS454','SoftwareImplementation','MoWe','5:15-6:35');
INSERT INTO SyracuseCourses(CourseID,Course,CourseFullName,CourseDays,CourseTime)
VALUES (4,'PHI251','Logic','WeFri','8:00-9:20');
INSERT INTO SyracuseCourses(CourseID,Course,CourseFullName,CourseDays,CourseTime)
VALUES (5,'CSE381','Computer Stuff','TuTh','11:00-12:20');

SELECT * FROM SyracuseCourses