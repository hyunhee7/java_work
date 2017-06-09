SELECT EMP_NAME AS 이름,
	   SALARY*12 AS "1년 급여",
	   ( SALARY+(SALARY*BONUS_PCT))*12 AS 총소득 
FROM   EMPLOYEE;

SELECT EMP_ID,
       EMP_NAME,
       '재직' AS 근무여부
FROM   EMPLOYEE; 

SELECT DISTINCT DEPT_ID
FROM EMPLOYEE;

SELECT DISTINCT JOB_ID, DEPT_ID
FROM EMPLOYEE;

SELECT EMP_NAME AS 이름,
	   DEPT_ID AS 부서
FROM EMPLOYEE
WHERE DEPT_ID='90';

SELECT EMP_NAME AS 이름,
	   SALARY AS 급여
FROM EMPLOYEE
WHERE SALARY > 4000000;

SELECT EMP_NAME AS 이름,
	   DEPT_ID AS 부서,
	   SALARY AS 급여
FROM EMPLOYEE
WHERE DEPT_ID = '90'
AND SALARY > 2000000;

SELECT EMP_NAME AS 이름,
	   DEPT_ID AS 부서,
	   SALARY AS 급여
FROM EMPLOYEE
WHERE DEPT_ID='90'
OR DEPT_ID='20';

SELECT EMP_ID||EMP_NAME||SALARY
FROM EMPLOYEE;

SELECT EMP_NAME||'의 월급은 '||SALARY||'원 입니다'
FROM EMPLOYEE;

SELECT EMP_NAME,
	   SALARY
FROM   EMPLOYEE
WHERE SALARY BETWEEN 3500000 AND 5500000;

SELECT EMP_NAME,
       SALARY
FROM EMPLOYEE
WHERE SALARY >= 3500000
AND SALARY <= 5500000;

SELECT EMP_NAME, SALARY
FROM EMPLOYEE
WHERE EMP_NAME LIKE '김%';

SELECT EMP_NAME, PHONE
FROM EMPLOYEE
WHERE PHONE LIKE '___9_______';

SELECT EMP_NAME,
	   EMAIL
FROM EMPLOYEE
WHERE EMAIL LIKE '___\_%' ESCAPE '\';

SELECT EMP_NAME,
	   EMAIL
FROM EMPLOYEE
WHERE EMAIL LIKE '___#_%' ESCAPE '#';

SELECT * FROM JOB;
SELECT * FROM EMPLOYEE;

SELECT EMP_NAME, MGR_ID, DEPT_ID
FROM EMPLOYEE
WHERE MGR_ID IS NULL
AND DEPT_ID IS NULL;

SELECT EMP_NAME, DEPT_ID, BONUS_PCT
FROM EMPLOYEE
WHERE DEPT_ID IS NULL
AND BONUS_PCT IS NOT NULL;

SELECT EMP_NAME, DEPT_ID, SALARY
FROM EMPLOYEE
WHERE DEPT_ID IN ('60', '90');

SELECT EMP_NAME, DEPT_ID, SALARY
FROM EMPLOYEE
WHERE DEPT_ID=60
OR DEPT_ID=90;

SELECT EMP_NAME, SALARY, DEPT_ID
FROM EMPLOYEE
WHERE (DEPT_ID = '20'
OR DEPT_ID='90')
AND SALARY > 3000000;

SELECT DEPARTMENT_NAME AS "학과 명", 
	   CATEGORY AS 계열
FROM TB_DEPARTMENT;

SELECT DEPARTMENT_NAME||'의 정원은 '||CAPACITY||'명 입니다'
	   AS "학과별 정원"
FROM TB_DEPARTMENT;

SELECT STUDENT_NO, STUDENT_SSN
FROM TB_STUDENT;

SELECT DEPARTMENT_NO, DEPARTMENT_NAME
FROM TB_DEPARTMENT;

SELECT STUDENT_NAME
FROM TB_STUDENT
WHERE ABSENCE_YN='Y'
AND DEPARTMENT_NO='001'
AND STUDENT_SSN LIKE '______-2%';

SELECT STUDENT_NAME
FROM TB_STUDENT
WHERE STUDENT_NO IN ('A513079','A513090','A513091','A513110','A513119');

SELECT DEPARTMENT_NAME, CATEGORY
FROM TB_DEPARTMENT
WHERE CAPACITY>=20 AND CAPACITY<=30;

SELECT PROFESSOR_NAME
FROM TB_PROFESSOR
WHERE DEPARTMENT_NO IS NULL;

SELECT STUDENT_NAME
FROM TB_STUDENT
WHERE DEPARTMENT_NO IS NULL;

SELECT CLASS_NO
FROM TB_CLASS
WHERE PREATTENDING_CLASS_NO IS NOT NULL;

SELECT DISTINCT CATEGORY
FROM TB_DEPARTMENT;

SELECT STUDENT_ADDRESS
FROM TB_STUDENT;

SELECT STUDENT_NO, STUDENT_NAME, STUDENT_SSN
FROM TB_STUDENT
WHERE ABSENCE_YN='N'
AND ENTRANCE_DATE LIKE '02%'
AND STUDENT_ADDRESS LIKE '%전주%';

SELECT LENGTH(CHARTYPE),
	   LENGTH(VARCHARTYPE)
FROM COLUMN_LENGTH;

SELECT EMAIL,
	   INSTR( EMAIL,'c',-1,2) 위치
FROM EMPLOYEE;

SELECT EMAIL,
	   INSTR(EMAIL, 'c', INSTR(EMAIL,'.')-1) 위치
FROM EMPLOYEE;

SELECT EMAIL AS 원본데이터,
	   LENGTH(EMAIL) AS 원본길이,
	   LPAD(EMAIL, 20, '.') AS 적용결과,
	   LENGTH(LPAD(EMAIL,20,'.')) AS 결과길이
FROM EMPLOYEE;	   

SELECT LTRIM('   tech') FROM DUAL;
SELECT LTRIM('   tech',' ') FROM DUAL;
SELECT LTRIM('000123','0') FROM DUAL;
SELECT LTRIM('123123Tech','123') FROM DUAL;
SELECT LTRIM('123123Tech123','123')FROM DUAL;
SELECT LTRIM('xyxzyyyTech','xyz') FROM DUAL;
SELECT LTRIM('6372Tech','0123456789') FROM DUAL;

SELECT TRIM ('  Tech  ') FROM DUAL;
SELECT TRIM ('a' FROM 'aatechaaa') FROM DUAL;
SELECT TRIM (LEADING '0' FROM '000123') FROM DUAL;
SELECT TRIM (TRAILING '1' FROM 'Tech1') FROM DUAL;
SELECT TRIM (BOTH '1' FROM '123Tech111') FROM DUAL;
SELECT TRIM (LEADING FROM '  Tech  ') FROM DUAL;

SELECT SUBSTR ('This is a test', 6, 2) FROM DUAL;
SELECT SUBSTR ('This is a test', 6) FROM DUAL;
SELECT SUBSTR ('이것은 연습입니다', 3, 4) FROM DUAL;
SELECT SUBSTR ('TechOnTheNet', 1, 4) FROM DUAL;
SELECT SUBSTR ('TechOnTheNet', -3, 3) FROM DUAL;
SELECT SUBSTR ('TechOnTheNet', -6, 3) FROM DUAL;
SELECT SUBSTR ('TechOnTheNet', -8, 2) FROM DUAL;

SELECT EMP_NAME AS 이름,
	   SUBSTR(HIRE_DATE,1,2)||'년 '||
	   SUBSTR(HIRE_DATE,4,2)||'월 '||
	   SUBSTR(HIRE_DATE,7,2)||'일 ' AS 입사일
	   FROM EMPLOYEE
	   WHERE JOB_ID='J7';
	   

SELECT ROUND(125.315) FROM DUAL;
SELECT ROUND(125.315, 0) FROM DUAL;
SELECT ROUND(125.315, 1) FROM DUAL;
SELECT ROUND(125.315, -1) FROM DUAL;
SELECT ROUND(125.315, 3) FROM DUAL;
SELECT ROUND(-125.315, 2) FROM DUAL;

SELECT TRUNC (125.315) FROM DUAL;
SELECT TRUNC (125.315, 0) FROM DUAL;
SELECT TRUNC (125.315, 1) FROM DUAL;
SELECT TRUNC (125.315, -1) FROM DUAL;
SELECT TRUNC (125.315, 3) FROM DUAL;
SELECT TRUNC (-125.315, -3) FROM DUAL;

SELECT EMP_NAME,
	   HIRE_DATE,
	   ADD_MONTHS(HIRE_DATE, 240)
FROM EMPLOYEE;

SELECT EMP_NAME,
	   HIRE_DATE,
	   MONTHS_BETWEEN(SYSDATE,HIRE_DATE)/12 AS 근무년수
FROM EMPLOYEE
WHERE MONTHS_BETWEEN(SYSDATE,HIRE_DATE) > 120;

SELECT TO_CHAR(1234, '99999') FROM DUAL;
SELECT TO_CHAR(1234, 'L99999') FROM DUAL;

SELECT TO_CHAR( SYSDATE, 'PM HH24:MI:SS') FROM DUAL;
SELECT TO_CHAR( SYSDATE, 'AM HH:MI:SS') FROM DUAL;

SELECT TO_CHAR( SYSDATE, 'MON DY, YYYY') FROM DUAL;
SELECT TO_CHAR( SYSDATE, 'YYYY-fmMM-DD DAY') FROM DUAL;
SELECT TO_CHAR( SYSDATE, 'YYYY-MM-fmDD DAY') FROM DUAL;

SELECT EMP_NAME AS 이름,
	   TO_CHAR(HIRE_DATE, 'YYYY-MM-DD') AS 입사일
FROM EMPLOYEE
WHERE JOB_ID = 'J7';

SELECT EMP_NAME AS 이름,
	   TO_CHAR(HIRE_DATE, 'YYYY"년" MM"월" DD"일"') AS 입사일
FROM EMPLOYEE
WHERE JOB_ID = 'J7';

SELECT TO_DATE('20100101','YYYYMMDD') FROM DUAL;
SELECT TO_CHAR('20100101','YYYY, MON') FROM DUAL;
SELECT TO_CHAR( TO_DATE('20100101', 'YYYYMMDD'),'YYYY, MON') FROM DUAL;
SELECT TO_DATE('041030 143000','YYMMDD HH24MISS') FROM DUAL;
SELECT TO_CHAR(TO_DATE('041030 143000','YYMMDD HH24MISS'),'DD-MON-YY HH:MI:SS PM') FROM DUAL;
SELECT TO_DATE('980630', 'YYMMDD') FROM DUAL;
SELECT TO_CHAR(TO_DATE('980630','RRMMDD'),'YYYY.MM.DD')FROM DUAL;
SELECT TO_CHAR(TO_DATE('980630','YYMMDD'),'YYYY.MM.DD')FROM DUAL;

SELECT EMP_NAME, EMP_NO,
	   SUBSTR(EMP_NO, 1, 6) AS 앞부분,
	   SUBSTR(EMP_NO, 8) AS 뒷부분,
	   TO_NUMBER(SUBSTR(EMP_NO,1,6))+TO_NUMBER(SUBSTR(EMP_NO,8)) AS 결과
FROM EMPLOYEE
WHERE EMP_ID = '101';

SELECT EMP_NAME, SALARY, NVL(BONUS_PCT,0)
FROM EMPLOYEE
WHERE SALARY > 3500000;

SELECT EMP_NAME, (SALARY*12)+((SALARY*12)*BONUS_PCT)
FROM EMPLOYEE
WHERE SALARY > 3500000;


SELECT EMP_NAME, (SALARY*12)+((SALARY*12)*NVL(BONUS_PCT,0))
FROM EMPLOYEE
WHERE SALARY > 3500000;

SELECT EMP_NAME, DECODE(SUBSTR(EMP_NO,8,1),'1','남','2','여','3','남','4','여') AS 성별
FROM EMPLOYEE
WHERE DEPT_ID='50';

SELECT EMP_NAME, DECODE(SUBSTR(EMP_NO,8,1), '1','남','3','남','여')AS 성별
FROM EMPLOYEE
WHERE DEPT_ID='50';

SELECT EMP_ID, EMP_NAME,
	   DECODE(MGR_ID, NULL, '없음', MGR_ID) AS 관리자
FROM EMPLOYEE
WHERE JOB_ID = 'J4';

SELECT EMP_ID, EMP_NAME, NVL(MGR_ID, '없음') AS 관리자
FROM EMPLOYEE
WHERE JOB_ID = 'J4';

SELECT EMP_NAME, 
	   JOB_ID, 
	   SALARY, 
	   DECODE(JOB_ID,
			  'J7', SALARY*1.1,
			  'J6', SALARY*1.15,
			  'J5', SALARY*1.2,
			  SALARY*1.05) AS 인상급여
FROM EMPLOYEE;

SELECT EMP_NAME, 
	   JOB_ID, 
	   SALARY, 
	   CASE JOB_ID WHEN 'J7' THEN TO_CHAR(SALARY*1.1)
	   			   WHEN 'J6' THEN TO_CHAR(SALARY*1.15)
	   			   WHEN 'J7' THEN TO_CHAR(SALARY*1.2)
	   			   ELSE TO_CHAR(SALARY*1.05) END
	   			   AS 인상급여
FROM EMPLOYEE;

SELECT EMP_ID,
	   EMP_NAME,
	   SALARY,
	   CASE WHEN SALARY <= 3000000 THEN '초급'
	        WHEN SALARY <= 4000000 THEN '중급'
	        ELSE '고급' END AS 구분
FROM EMPLOYEE;

SELECT AVG(BONUS_PCT) AS 기본평균,
	   AVG(DISTINCT BONUS_PCT) AS 중복제거평균,
	   AVG(NVL(BONUS_PCT,0)) AS NULL포함평균
FROM EMPLOYEE
WHERE DEPT_ID IN ('50','90')
OR DEPT_ID IS NULL;

SELECT * FROM EMPLOYEE WHERE DEPT_ID='50' OR DEPT_ID IS NULL;

SELECT COUNT(*),
	   COUNT(JOB_ID),
	   COUNT(DISTINCT JOB_ID)
FROM EMPLOYEE
WHERE DEPT_ID = '50'
OR DEPT_ID IS NULL;

SELECT EMP_NAME, HIRE_DATE, DEPT_ID
FROM EMPLOYEE
WHERE HIRE_DATE > TO_DATE('20030101','YYYYMMDD')
ORDER BY DEPT_ID DESC, HIRE_DATE, EMP_NAME;

SELECT EMP_NAME AS 이름,
	   HIRE_DATE AS 입사일,
	   DEPT_ID AS 부서코드
FROM EMPLOYEE
WHERE HIRE_DATE > TO_DATE('20030101','YYYYMMDD')
ORDER BY 3 DESC, 2, 1;

SELECT EMP_NAME AS 이름,
	   HIRE_DATE AS 입사일,
	   DEPT_ID AS 부서코드
FROM EMPLOYEE
WHERE HIRE_DATE > TO_DATE('20030101','YYYYMMDD')
ORDER BY 부서코드 DESC, 입사일, 이름;

SELECT DEPT_ID AS 부서,
	   ROUND(AVG(SALARY),-4) AS 평균급여
FROM EMPLOYEE
GROUP BY DEPT_ID
ORDER BY 1;

SELECT DECODE(SUBSTR(EMP_NO,8,1), '1','남','3','남','여') AS 성별,
	   ROUND(AVG(SALARY),-4) AS 평균급여
FROM EMPLOYEE
GROUP BY DECODE(SUBSTR(EMP_NO,8,1),'1','남','3','남','여')
ORDER BY 2;

SELECT DEPT_ID, COUNT(*)
FROM EMPLOYEE
GROUP BY DEPT_ID
ORDER BY 1;

SELECT DEPT_ID, MAX(SUM(SALARY))
FROM EMPLOYEE
GROUP BY DEPT_ID;

SELECT MAX(SUM(SALARY))
FROM EMPLOYEE
GROUP BY DEPT_ID;


SELECT DEPT_ID, SUM(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_ID
HAVING SUM(SALARY) > 9000000;

SELECT DEPT_ID, SUM(SALARY)
FROM EMPLOYEE
WHERE SUM(SALARY) > 9000000
GROUP BY DEPT_ID;

SELECT DEPT_ID,
	   SUM(SALARY)
FROM EMPLOYEE
WHERE DEPT_ID IS NOT NULL
GROUP BY ROLLUP(DEPT_ID);

SELECT DEPT_ID,
	   JOB_ID,
	   SUM(SALARY)
FROM EMPLOYEE
WHERE DEPT_ID IS NOT NULL
AND JOB_ID IS NOT NULL
GROUP BY ROLLUP(DEPT_ID, JOB_ID)
ORDER BY DEPT_ID, JOB_ID;

1.
SELECT STUDENT_NO AS 학번, 
	   STUDENT_NAME AS 이름, 
	   TO_CHAR(ENTRANCE_DATE, 'YYYY-MM-DD') AS 입학년도
FROM TB_STUDENT
WHERE DEPARTMENT_NO = '002'
ORDER BY ENTRANCE_DATE ASC;


SELECT EMP_NAME, EMP_NO,
	   SUBSTR(EMP_NO, 1, 6) AS 앞부분,
	   SUBSTR(EMP_NO, 8) AS 뒷부분,
	   TO_NUMBER(SUBSTR(EMP_NO,1,6))+TO_NUMBER(SUBSTR(EMP_NO,8)) AS 결과
FROM EMPLOYEE
WHERE EMP_ID = '101';

2. 
SELECT PROFESSOR_NAME, PROFESSOR_SSN
FROM TB_PROFESSOR
WHERE TO_NUMBER(SUBSTR(PROFESSOR_NAME,1)) !=3;