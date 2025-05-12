create schema W07 default character set utf8mb4;
use W07;
set SQL_SAFE_UPDATES = 0;

drop table if exists R;
drop table if exists 급여;
drop table if exists 부서;

-- ********** R table **********
-- R(NAME pk, SALARY)
create table R (
    NAME VARCHAR(20) Primary key,
    SALARY INTEGER Check(SALARY <= 4000) default 1000
);

insert into R values('KIM', 1000);
insert into R values('LEE', 2000);
insert into R values('PARK', 3000);

# default 설정 안 할 시
insert into R(name) values('JUNG');  # salary는 NULL

# default 설정 시
insert into R(name) values('JUNG');  # salary는 default값으로 설정
insert into R(name, salary) values('JUNG', NULL);  # 이 경우는 내가 넣는 값 우선(salary == NULL)

/*
이 릴레이션 R에 대하여 아래의 순서로 SQL문을 수행하였다.
이들 중에서 일부는 릴레이션에 정의된 제약조건 때문에 거절될 수 있다.
*/ 

insert into R values('CHOI', 1200);  # 가능 

update R
set SALARY = 5000
where NAME = 'PARK';  # 불가능 : salary는 4000원 이하여야 하기 때문(도메인 제약 조건)

insert into R values('KIM', 1300);  # 불가능 : 기본키는 중복 불가(기본키 제약 조건)

delete from R where NAME = 'LEE';  # 가능

select sum(SALARY) from R;

-- 릴레이션 R에 들어있는 모든 투플들의 SALARY의 합은 얼마인가? : 6200

-- ********** 부서, 급여 table **********
-- 부서(부서코드, 부서명)
CREATE TABLE 부서 (
      부서코드     char(2)          NOT NULL ,
      부서명        varchar(30) ,
      PRIMARY KEY(부서코드)
);


insert into 부서 values('AA','총무부');
insert into 부서 values('BB','영업부');
insert into 부서 values('CC','기획부');

select * from 부서;

-- 급여(사원번호, 사원명, 주민등록번호, 소속부서, 직급, 성별, 기본급, 수당)
CREATE TABLE 급여 (
      사원번호         char(4)        NOT NULL ,
      사원명            varchar(30) ,
      주민등록번호  	char(14) ,
      소속부서         char(2)                DEFAULT 'AA' ,  # 기본값 설정
      직급               char(6) ,
      성별               char(3) ,
      기본급            int              NOT  NULL ,
      수당               int ,
      PRIMARY KEY(사원번호) ,
      FOREIGN KEY(소속부서) REFERENCES 부서(부서코드) ,
      CONSTRAINT ck_급여_성별 CHECK (성별 IN ('남', '여'))
 );

insert into 급여 values('1111','홍길동','801211-1111111','AA','과장','남',2000000,100000);
insert into 급여 values('2222','임꺽정','850505-2222222','AA','사원','여',1200000,300000);
insert into 급여 values('6666','송종국','730301-1444444','BB','부장','남',2500000,50000);
insert into 급여 values('5555','차두리','821004-1333333','AA','사원','남',1150000,300000);

/* 수당이 NULL 인 데이터 입력 */
insert into 급여 values('3333','이병진','830301-1555555','CC','사원','남',1200000,NULL);
insert into 급여 values('4444','우현정','891004-2666666','CC','사원','여',1150000,NULL);

select * from 급여;



