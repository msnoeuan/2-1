create schema W10 default character set utf8mb4;
use W10;

drop table if exists 질병;
drop table if exists 환자;

create table 질병 (
	질병코드 char(3) not null,
    질병명 varchar(20 ) not null,
    증상 varchar(20),
    primary key(질병코드)
);

insert into 질병 values('A01', '뇌졸증', '어지럼증');
insert into 질병 values('A02', '콜레라', '설사');
insert into 질병 values('A03', '기관지염', '발열');
insert into 질병 values('A04', '장티푸스', '발열');

select * from 질병;

create table 환자 (
	환자번호 char(5) not null,
    이름 varchar(30) not null,
    질병코드 char(3),
    나이 int,
    primary key(환자번호)
);

insert into 환자 values('P1001', '김철수', 'A01', 30);
insert into 환자 values('P1002', '양길현', 'A03', 29);
insert into 환자 values('P1003', '임영수', 'A01', 50);
insert into 환자 values('Q1001', '박한나', '', 40);

select * from 환자;

-- 1) 증상이 발열인 질병코드와 질병명, 증상을 조회하라
select *
from 질병
where 증상 = '발열';


-- 2) 양길현의 이름과 환자번호, 나이를 조회하라
select *
from 환자
where 이름 = '양길현';

-- 3) 나이가 30 이하인 환자번호와 이름, 나이를 조회하라
select *
from 환자
where 나이 <= 30;

-- 4) 환자 김철수의 환자 이름, 질병명, 증상을 조회하라
select *
from 환자
where 이름 = '김철수';

-- 5) 각 환자의 이름과 질병명을 환자 이름의 오름차순으로 조회하라
select 이름,질병명
from 환자, 질병
where 환자.질병코드 = 질병.질병코드
order by 이름;

select 이름, 질병명
from 환자 inner join 질병
on 환자.질병코드 = 질병.질병코드;

-- 5-1) 박한나의 null값까지 조회하고 싶다면
select 이름, 질병명
from 환자 left outer join 질병
on 환자.질병코드 = 질병.질병코드;

-- 6 질병의 종류 중 현재 환자테이블에 있는 환자가 걸리지 않은 질병을 조회하라
select *
from 질병
where not exists (
	select *
    from 환자
    where 환자.질병코드 = 질병.질병코드
);
