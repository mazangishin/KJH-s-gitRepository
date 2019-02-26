CREATE TABLE BANK (
    ACCOUNT VARCHAR2(100), --소유자명
    MONEY   NUMBER         --소유자의돈
);

CREATE TABLE BANK_USER (
    NAME    VARCHAR2(100),
    MONEY   NUMBER          --소지금
);
    

INSERT INTO BANK VALUES('aa', 100000);

select  *

from    bank;

select  *
from    bank_user;

insert into bank values('aa', 0);
select *
from bank;

SELECT *
FROM DEPT;

CREATE TABLE DEPT02     --테이블복제
AS
SELECT *
FROM DEPT;

SELECT *
FROM DEPT02;

DROP TABLE BANK;
DROP TABLE BANK_USER;
DROP TABLE DEPT;
DROP TABLE SAM;
DROP TABLE STAFF_LIST;
DROP TABLE TEST;
DROP TABLE DEPT02;

 
 
