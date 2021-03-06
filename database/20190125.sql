SELECT  COUNT(*)                 AS "전체 행의 수", 
        COUNT(HEIGHT)            AS "키 건수", 
        MAX(HEIGHT)              AS 최대키,
        MIN(HEIGHT)              AS 최소키 , 
        ROUND(AVG(HEIGHT), 2)    AS 평균키
FROM    PLAYER;

SELECT  *
FROM    PLAYER;

CREATE TABLE EMP_TEST
AS
SELECT       *
FROM         EMP;

DROP TABLE EMP_TEST;
ROLLBACK;

SELECT  COUNT(*)                  AS "전체 행수", 
        COUNT(HEIGHT)             AS "키 건수", 
        COUNT(*) - COUNT(HEIGHT)  AS "HEIGHT VAL NULL CNT"
FROM    PLAYER;

SELECT  POSITION                AS 포지션, 
        COUNT(*)                AS 인원수, 
        COUNT(HEIGHT)           AS 키대상,
        MAX(HEIGHT)             AS 최대키, 
        MIN(HEIGHT)             AS 최소키, 
        ROUND(AVG(HEIGHT), 2)   AS 평균키
FROM    PLAYER
GROUP BY POSITION;


CREATE TABLE EMP_TEST
AS
SELECT       ENAME, SAL, JOB
FROM         EMP
WHERE        1 = 0;

SELECT  *
FROM    PLAYER;

DESC    EMP_TEST;

SELECT  DEPTNO, AVG(SAL)
FROM    EMP
GROUP BY DEPTNO;

SELECT              DEPTNO, AVG(SAL)
FROM                EMP
GROUP BY            DEPTNO
HAVING              AVG(SAL)>= 2000;

SELECT  *
FROM    EMP;

SELECT          DEPTNO, MAX(SAL), MIN(SAL)
FROM            EMP
GROUP BY        DEPTNO
HAVING          MAX(SAL) >= 2900;



SELECT      POSITION, AVG(HEIGHT)
FROM        PLAYER
GROUP BY    POSITION
HAVING      AVG(HEIGHT) >= 180;

SELECT  *
FROM    TEAM;

--K02, K09

SELECT      TEAM_ID         AS 팀ID, 
            COUNT(*)        AS 인원수
FROM        PLAYER
--WHERE       TEAM_ID = 'K02' OR TEAM_ID = 'K09'
GROUP BY    TEAM_ID
HAVING      TEAM_ID = 'K02' OR TEAM_ID = 'K09';

SELECT      POSITION, ROUND(AVG(HEIGHT), 2)
FROM        PLAYER
GROUP BY    POSITION
HAVING      MAX(HEIGHT) >= 190;

SELECT  *
FROM    EMP;

SELECT   *
FROM     EMP
ORDER BY SAL ASC;

SELECT  *
FROM    EMP
ORDER BY SAL DESC;


SELECT  *
FROM    EMP
ORDER BY HIREDATE ASC;

SELECT  *
FROM    EMP
ORDER BY HIREDATE DESC;

SELECT      EMPNO        AS 사원번호, 
            ENAME        AS 사원명, 
            JOB          AS 직급, 
            HIREDATE     AS 입사일
FROM        EMP
ORDER BY    HIREDATE ASC;

SELECT      EMPNO, ENAME
FROM        EMP
ORDER BY    EMPNO DESC;

SELECT  *
FROM    EMP
ORDER BY SAL DESC, ENAME DESC;

SELECT  *
FROM    EMP
WHERE ROWNUM <= COUNT(*) - 3
GROUP BY ENAME
ORDER BY HIREDATE DESC, SAL ASC;


SELECT  EMPNO            AS 사원번호, 
        HIREDATE         AS 입사일, 
        ENAME            AS 사원명, 
        SAL              AS 급여
FROM    EMP
ORDER BY DEPTNO ASC, HIREDATE DESC;

SELECT   PLAYER_NAME     AS 선수명, 
         POSITION        AS 포지션, 
         BACK_NO         AS 백넘버
FROM     PLAYER
ORDER BY PLAYER_NAME DESC;

SELECT   PLAYER_NAME    AS 선수명, 
         POSITION       AS 포지션, 
         BACK_NO        AS 백넘버,
         HEIGHT         AS 키
FROM     PLAYER
WHERE    HEIGHT IS NOT NULL
ORDER BY HEIGHT DESC, BACK_NO ASC;


SELECT  DEPT.*, DEPTNO*10 AS NEWCOL
FROM    DEPT
ORDER BY DEPTNO DESC, DNAME ASC, LOC DESC;

SELECT  DEPT.*, DEPTNO * 10 AS NEWCOLL
FROM    DEPT
ORDER BY 1 DESC, 2 ASC, 3 DESC;

SELECT  DEPT.*, DEPTNO * 10 NEWCOL
FROM    DEPT
ORDER BY NEWCOL DESC;

SELECT  DEPT.*, DEPTNO * 0 AS NEWCOL
FROM    DEPT
ORDER BY NEWCOL DESC, 1 DESC;


SELECT  EMPNO, ENAME, JOB, SAL, SAL * 12
FROM    EMP;

CREATE VIEW EMP_BOOKS_VIEW
AS
SELECT  ENAME, JOB, SALSAL * 12 YEARSAL
FROM    EMP;


CREATE VIEW     EMP_FIRST_VIEW
AS
SELECT          EMPNO                           AS 사원번호, 
                ENAME                           AS 사원이름, 
                HIREDATE                        AS 입사날짜, 
                TRUNC((TO_DATE('2000-01-01 0:00:00', 'YYYY-MM-DD HH24:MI:SS')
                - HIREDATE) / 365)              AS 경력년수,
                TRUNC((TO_DATE('2000-01-01 0:00:00', 'YYYY-MM-DD HH24:MI:SS')
                - HIREDATE))                    AS 입사일,
                TRUNC((TO_DATE('2000-01-01 0:00:00', 'YYYY-MM-DD HH24:MI:SS')
                - HIREDATE) * (60*24))          AS 입사분,
                TRUNC((TO_DATE('2000-01-01 0:00:00', 'YYYY-MM-DD HH24:MI:SS')
                - HIREDATE) * (60*24*60))       AS 입사초
FROM EMP;

SELECT  *
FROM    EMP, DEPT
WHERE   EMP.DEPTNO = DEPT.DEPTNO; 

SELECT  *
FROM    EMP;

SELECT  *
FROM    USER_CONSTRAINTS
WHERE   TABLE_NAME = 'EMP'
OR      TABLE_NAME = 'DEPT';


SELECT  E.EMPNO, E.ENAME, E.SAL, D.DEPTNO, D.DNAME, D.LOC
FROM    EMP E, DEPT D
WHERE   E.DEPTNO = D.DEPTNO;

SELECT  *
FROM    TEAM;


SELECT  P.PLAYER_NAME   AS 선수명, 
        T.TEAM_NAME     AS 소속팀명
FROM    PLAYER P, TEAM T
WHERE   P.TEAM_ID = T.TEAM_ID;


SELECT  E.ENAME, D.DNAME
FROM    EMP E, DEPT D
WHERE   E.DEPTNO = D.DEPTNO
AND     E.ENAME = 'SMITH';

SELECT  E.ENAME, D.DNAME
FROM    EMP E, DEPT D
WHERE   E.DEPTNO = D.DEPTNO
AND     E.HIREDATE <= SYSDATE;

SELECT  E.ENAME, D.DNAME
FROM    EMP E INNER JOIN DEPT D
ON      E.DEPTNO = D.DEPTNO;

SELECT  E.ENAME, D.DNAME
FROM    EMP E INNER JOIN DEPT D
ON      E.DEPTNO = D.DEPTNO
WHERE   E.ENAME = 'SMITH';

SELECT  *
FROM    DEPT;
SELECT  *
FROM    EMP;


SELECT  E.ENAME, E.SAL
FROM    EMP E INNER JOIN DEPT D
ON      E.DEPTNO = D.DEPTNO
WHERE   D.LOC = 'NEW YORK';

SELECT  E.ENAME, E.SAL
FROM    EMP E, DEPT D
WHERE   E.DEPTNO = D.DEPTNO
AND     D.LOC = 'NEW YORK';

SELECT  E.ENAME, E.HIREDATE
FROM    EMP E INNER JOIN DEPT D
ON      E.DEPTNO = D.DEPTNO
WHERE   D.DNAME = 'ACCOUNTING';

SELECT  E.ENAME, E.HIREDATE
FROM    EMP E, DEPT D
WHERE   E.DEPTNO = D.DEPTNO
AND     D.DNAME = 'ACCOUNTING';

SELECT      E.ENAME, D.DNAME
FROM        EMP E INNER JOIN DEPT D
ON          E.DEPTNO = D.DEPTNO
WHERE       E.JOB = 'MANAGER'
ORDER BY    E.ENAME ASC;

SELECT      E.ENAME, D.DNAME
FROM        EMP E, DEPT D
WHERE       E.DEPTNO = D.DEPTNO
AND         E.JOB = 'MANAGER'
ORDER BY    E.ENAME ASC;

SELECT      E.EMPNO, E.ENAME, E.JOB, E.SAL, D.DNAME
FROM        EMP E, DEPT D
WHERE       E.DEPTNO = D.DEPTNO
AND         E.SAL >= 1000 AND E.SAL <= 3000;