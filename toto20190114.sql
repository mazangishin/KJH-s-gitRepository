--파일명.sql
--
--형식
--
--새로운 테이블을 생성하는 명령어
--
--CREATE TABLE table.name(
--column_name1.date_type,
--column_name2.date_type,
--column_name3.date_type,

--테이블명 : ban
--이름, 성별, 나이

CREATE TABLE BAN(
    stuName varchar2(20),
    sex varchar2(6),
    age number(3)
);

--테이블 내용 조회 방법
--select * from 테이블명;
select *
from ban;

--테이블에 구조를 분석해서 보여준다.
DESC ban;

--테이블에 데이터(내용)을 삽입한다, 입력한다.
insert into ban
(stuName, sex, age)
values(
    '홍길동', '남', 20
);


rollback;

--부서
--부서명         문자열 100
--부서인원수      숫자 1
--부서특활비      숫자 7 (1000000)

CREATE TABLE office_dept
(
    deptName VARCHAR2(100),
    dept_people_count NUMBER(1),
    dept_pocket_money NUMBER(7)
);

DESC office_dept;
