
create database CRUDAPP-DB;

use CRUDAPP-DB;

CREATE TABLE student (
  studentId int(5) NOT NULL AUTO_INCREMENT,
  firstName varchar(25) DEFAULT NULL,
  lastName varchar(25) DEFAULT NULL,
  course varchar(15) DEFAULT NULL,
  year int(2) DEFAULT NULL,
 PRIMARY KEY (studentId));
 
GRANT ALL ON CRUDAPP-DB.* TO <new-user>@<internal IP of DB> IDENTIFIED BY '<new-password>';
