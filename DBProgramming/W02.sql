-- 데이터베이스 생성
create schema W02 default character set utf8mb4;
-- 사용할 데이터베이스 선택
use W02;

drop table if exists 부서;
drop table if exists dept;
drop table if exists emp;
drop table if exists prof;
drop table if exists stu;

-- ********** 부서 table **********
-- 부서(부서코드, 부서명, 위치)
-- 방법1 : 제약조건을 처음에 생성
create table 부서 (
	부서코드 char(2),
    부서명 varchar(20),  # 가변형
    위치 varchar(10),
    primary key(부서코드)  # 기본키
);

-- 방법2 : 제약조건을 나중에 추가
create table 부서 (
	부서코드 char(2),
    부서명 varchar(20), 
    위치 varchar(10)
);

-- 제약조건 추가
alter table 부서
	add constraint pk_부서_부서코드
		primary key(부서코드);

insert into 부서 values('AA', '총무부', '서울');
insert into 부서 values('BB', '영업부', '대전');
insert into 부서 values('CC', '기획부', '서울');
		
select * from 부서;
		
-- ********** dept, emp table **********
-- dept(depno, depname, loc)
create table dept (
	deptno varchar(255) not null,
    deptname varchar(255) null,
    loc varchar(255) null
);

alter table dept
	add constraint pk_dept
		primary key(deptno);
        
insert into dept values('AA', '총무부', '서울');
insert into dept values('BB', '영업부', '대전');
insert into dept values('CC', '기획부', '서울');

select * from dept;

-- emp(empno, empname, deptno)
create table emp(
	empno int,
    empname varchar(10),
    deptno varchar(255)
);

alter table emp
	add constraint pk_emp
		primary key(empno);
        
alter table emp
	add constraint fk_dept_TO_emp
		foreign key(deptno)
			references dept(deptno);
            
insert into emp values(100, '신재영', 'BB');
insert into emp values(101, '오주원', 'AA');
insert into emp values(102, '이대은', 'BB');

select * from emp;

-- ********** prof, stu table **********
-- prof(ID, 이름)
create table prof (
	ID varchar(255),
    이름 varchar(255)
);

alter table prof
	add constraint pk_prof
		primary key(ID);
        
insert into prof values('P001', '한성식');
insert into prof values('P002', '김설훈');
insert into prof values('P003', '박광민');

select * from prof;

-- stu(학번, 이름, 전공, 지도교수)
create table stu (
	학번 varchar(255),
    이름 varchar(255),
    전공 varchar(255),
    지도교수 varchar(255)
);

alter table stu
	add constraint pk_stu
		primary key(학번);
        
alter table stu
	add constraint fk_prof_TO_stu
		foreign key(지도교수)
			references prof(ID);
            
insert into stu values('2003001', '김철수', '국문학', 'P001');
insert into stu values('2003002', '박선하', '국문학', 'P002');
insert into stu values('2003003', '안미희', '컴퓨터공학', 'P001');
insert into stu values('2003004', '유창식', '컴퓨터공학', 'P003');
insert into stu values('2003005', '임한솔', '산업공학', 'P002');

select * from stu;