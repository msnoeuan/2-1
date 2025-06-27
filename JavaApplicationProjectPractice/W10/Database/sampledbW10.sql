drop database if exists sampledbW10;
create database sampledbW10;
use sampledbW10;

drop table if exists student;
create table student(
	id varchar(10) primary key,
    name varchar(10),
    dept varchar(10)
);

select * from student;

