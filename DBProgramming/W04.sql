create schema W04 default character set utf8mb4;
use W04;

-- 테이블 목록 조회
show tables;

-- 테이블 구조 확인
-- describe tableName; 도 가능
desc dept;
desc emp;
desc 학생_수강;
desc 학생;

-- 테이블 삭제
drop table if exists dept;
drop table if exists emp;
drop table if exists 학생_수강;
drop table if exists 학생;

-- ********** dept, emp table **********
-- dept(부서코드, 부서명, 위치)
create table dept (
	부서코드 char(2),
    부서명 varchar(20),
    위치 varchar(45)
);

alter table dept
	add constraint pk_dept
		primary key(부서코드);
        
insert into dept values('AA','총무부','서울');
insert into dept values('BB','영업부','대전');
insert into dept values('CC','기획부','서울');

select * from dept;

-- emp(사원번호, 사원명, 부서코드)
create table emp (
	사원번호 int,
    사원명 varchar(10),
    부서코드 char(2)
);

alter table emp
	add constraint pk_emp
		primary key(사원번호);
        
alter table emp
	add constraint fk_dept_TO_emp
		foreign key(부서코드)
			references dept(부서코드);
            
insert into emp values(100, '신재영', 'BB');
insert into emp values(101, '오주원', 'AA');
insert into emp values(102, '이대은', 'BB');

select * from emp;

-- ********** 학생, 학생_수강 table **********
-- 학생(학번, 이름, 전공)
create table 학생 (
	학번 int,
    이름 varchar(10),
    전공 varchar(20)
);

alter table 학생
	add constraint pk_학생
		primary key(학번);
        
insert into 학생 values(213068, '홍길동', '컴퓨터공학');
insert into 학생 values(20230880, '유승민', '컴퓨터소프트웨어공학과');

select * from 학생;

-- 학생_수강(학번, 수강과목)
create table 학생_수강 (
	학번 int,
    수강과목 varchar(30),
    primary key(학번, 수강과목),  # 복합키
    key fk_학생_TO_학생_수강_idx (학번),  # 빠른 검색을 위한 인덱스 설정(index fk_학생_TO_학생_수강_idx(학번) 이라고도 작성 가능)
    constraint fk_학생_TO_학생_수강
		foreign key(학번)
			references 학생(학번)
);

insert into 학생_수강 values(213068, 'C언어');
insert into 학생_수강 values(213068, '자료구조');

select * from 학생_수강;