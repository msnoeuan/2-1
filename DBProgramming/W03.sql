create schema W03 default character set utf8mb4;
use W03;

drop table if exists club_student;
drop table if exists 학생;
drop table if exists 학과;
DROP TABLE IF EXISTS 학생_수강;
DROP TABLE IF EXISTS 학생02;

-- ********** club_student table **********
-- club_student(sId, club, club_president)
create table club_student (
	sId char(7),
    club varchar(30),
    club_president varchar(20)
);

alter table club_student
	add constraint pk_club_student
		primary key(sId, club);
        
insert into club_student values('2003001', '영어회화반', '강우혁');
insert into club_student values('2003001', '낚시회', '김민우');
insert into club_student values('2003002', '영어회화반', '강우혁');
insert into club_student values('2003003', '한문강독', '박문길');
insert into club_student values('2003004', '해커스', null);
-- insert into club_student(sid, club) values('2003004', '해커스');  # club_president는 null 값으로 들어감

select * from club_student;

select *
from club_student
where club_president is null;

-- ********** 학과, 학생 table **********
-- 학과(학과번호, 학과명)
create table 학과 (
	학과번호 int,
    학과명 varchar(50)
);

alter table 학과
	add constraint pk_학과
		primary key(학과번호);
        
insert into 학과 values(1, '컴퓨터소프트웨어공학과');
insert into 학과 values(2, '컴퓨터정보공학과');
insert into 학과 values(3, '정보통신과');

select * from 학과;

-- 학생(번호, 이름, 학년, 분반, 학과번호)
create table 학생 (
	번호 int,
    이름 varchar(20),
    학년 int,
    분반 char(2),
    학과번호 int
);

alter table 학생
	add constraint pk_학생
		primary key(번호);
        
alter table 학생
	add constraint fk_학과_TO_학생
		foreign key(학과번호)
			references 학과(학과번호);
            
insert into 학생 values(1, '한지혜', 1, 'YB', 1);
insert into 학생 values(2, '이정우', 1, 'YA', 1);
insert into 학생 values(3, '오지영', 2, 'J1', 2);
insert into 학생 values(4, '강재미', 1, 'YB', 1);
insert into 학생 values(5, '박철호', 2, 'J1', 2);

select * from 학생;

-- ********** 학생02, 학생_수강 table **********
-- 학생02(학번, 이름, 전공)
create table 학생02 (
	학번 int,
    이름 varchar(20),
    전공 varchar(30)
);

alter table 학생02
	add constraint pk_학생02
		primary key(학번);
        
insert into 학생02 values(213068, '홍길동', '컴퓨터공학');
insert into 학생02 values(20230880, '유승민', '컴퓨터공학');
        
select * from 학생02;

-- 학생_수강(학번, 수강과목)
create table 학생_수강 (
	학번 int,
    수강과목 varchar(30)
);

alter table 학생_수강
	add constraint pk_학생_수강
		primary key(학번, 수강과목);
        
alter table 학생_수강
	add constraint fk_학생02_TO_학생_수강
		foreign key(학번)
			references 학생02(학번);

insert into 학생_수강 values(213068, 'C언어');
insert into 학생_수강 values(213068, '자료구조');

select * from 학생_수강;            
