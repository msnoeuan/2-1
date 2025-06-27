drop database if exists sampledbW13;
create database sampledbW13;
use sampledbW13;

drop table if exists student;
create table student(
	id varchar(20) primary key,
    name varchar(20),
    dept varchar(20)
);

-- 입력
insert into student value('2024001', '김철수', '컴퓨터시스템');
insert into student value('2024002', '이영희', '컴퓨터시스템');
insert into student value('2024003', '아이유' ,'실용음악과');
insert into student value('2024005', '김제니', '무용학과');
insert into student value('2023006', '유승민', '컴퓨터소프트웨어');


-- 제니의 학과를 컴퓨터공학으로 변경
update student set dept = '컴퓨터공학' where name = '제니';

-- 조회
select * from student;