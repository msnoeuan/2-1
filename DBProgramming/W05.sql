create schema W05 default character set utf8mb4;
use W05;

-- (MySQL) safe mode 해제
-- 0은 해제, 1은 설정
set SQL_SAFE_UPDATES = 0;

-- 테이블 목록 조회
show tables;

-- 테이블 구조 확인
desc emp;
desc dept;
desc 학생;
desc 학과;

-- 테이블 삭제
drop table if exists emp;
drop table if exists dept;
drop table IF EXISTS 학생;
drop table IF EXISTS 학과;

-- ********** dept, emp table **********
-- dept(부서코드, 부수명, 위치)
CREATE TABLE dept (
       부서코드 char(2) NOT NULL ,
       부서명 varchar(20) ,
       위치 varchar(10) ,
       PRIMARY KEY (부서코드)
);

insert into dept values('AA','총무부','서울');
insert into dept values('BB','영업부','대전');
insert into dept values('CC','기획부','서울');

select * from dept;

-- emp(사원번호,사원명, 부서코드)
CREATE TABLE emp (
       사원번호 int NOT NULL ,
       사원명 varchar(20) ,
       부서코드 char(2)      ,
       PRIMARY KEY (사원번호) ,
       FOREIGN KEY(부서코드)
            REFERENCES dept(부서코드)
);

insert into emp values(100,'신재영','BB');
insert into emp values(101,'오주원','AA');
insert into emp values(102,'이대은','BB');

select * from emp;

-- ********** 학과, 학생 table **********
-- 학과(학과코드, 학과명)
create table 학과 (
	학과코드 char(4) not null,
    학과명 varchar(30),
    constraint pk_학과
		primary key(학과코드)
);

insert into 학과 values('1001','컴퓨터학과');
insert into 학과 values('2001','체육학과');

select * from 학과;

-- 학생(학번, 이름, 학과코드)
create table 학생 (
	학번 char(3) not null,
    이름 varchar(10),
    학과코드 char(4),
    primary key(학번),
    foreign key(학과코드)
		references 학과(학과코드)
);

insert into 학생 values('501','박지성','1001');
insert into 학생 values('401','김연아','2001');
insert into 학생 values('402','장미란','2001');
insert into 학생 values('502','추신수','1001');

select * from 학생;

-- 학과코드 2001을 삭제하시오.
delete
from 학과
where 학과코드 = 2001;

-- 학과코드 1001을 A001로 수정하시오.
update 학과
set 학과코드 = 'A001'
where 학과코드 = '1001';