create schema W06 default character set utf8mb4;
use W06;

-- (MySQL) safe mode 해제
set SQL_SAFE_UPDATES = 0;

-- 테이블 목록 조회
show tables;

-- 테이블 삭제
drop table if exists 환자;
drop table if exists 질병;
drop table if exists 신체정보;
drop table if exists 학생;

-- ********** 질병, 환자 table **********
-- 질병(질병코드, 질병명, 증상)
create table 질병 (
	질병코드 char(3),
    질병명 varchar(15),
    증상 varchar(20)
);

alter table 질병
	add constraint pk_질병
		primary key(질병코드);
        
insert into 질병 values('A01', '뇌졸증', '어지럼증');
insert into 질병 values('A02', '콜레라', '설사');
insert into 질병 values('A03', '기관지염', '발열');
insert into 질병 values('A04', '장티푸스', '발열');

select * from 질병;
        
-- 환자(환자번호, 이름, 질병코드, 나이)
create table 환자 (
	환자번호 char(5),
    이름 varchar(10),
    질병코드 char(3),
    나이 int
);

alter table 환자
	add constraint pk_환자
		primary key(환자번호);
        
alter table 환자
	add constraint fk_질병_TO_환자
		foreign key(질병코드)
			references 질병(질병코드);

insert into 환자 values('P1001', '김철수', 'A01', 30);
insert into 환자 values('P1002', '양길현', 'A03', 29);
insert into 환자 values('P1003', '임영수', 'A01', 50);
insert into 환자 values('Q1001', '박한나', 'A04', 40);

select * from 환자;

-- ********** 학생, 신체정보 table **********
-- 학생(학번, 이름, 주소, 전공)
create table 학생 (
	학번 char(5),
    이름 varchar(10),
    주소 varchar(15),
    전공 varchar(10)
);

alter table 학생
	add constraint pk_학생
		primary key(학번);
        
insert into 학생 values('21001', '김철수', '서울', '영문학');
insert into 학생 values('21002', '양길현', '인천', '컴퓨터');
insert into 학생 values('21003', '임영수', '광주', '화학');
insert into 학생 values('21004', '박한나', '부산', '수학');

select * from 학생;

-- 신체정보(학번, 키, 몸무게, 혈액형)
create table 신체정보 (
	학번 char(5),
    키 int,
    몸무게 int,
    혈액형 varchar(5)
);

alter table 신체정보
	add constraint pk_신체정보
		primary key(학번);
        
alter table 신체정보
	add constraint fk_학생_TO_신체정보
		foreign key(학번)
			references 학생(학번);
            
insert into 신체정보 values('21001', 175, 70, 'A');
insert into 신체정보 values('21002', 169, 65, 'B');
insert into 신체정보 values('21003', 180, 60, 'O');
insert into 신체정보 values('21004', 170, 85, 'B');

select * from 신체정보;

