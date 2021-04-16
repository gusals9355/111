SELECT title FROM titles
WHERE emp_no = 10007;

SELECT * FROM titles
WHERE title in (
	SELECT title FROM titles
	WHERE emp_no = 10007
);

SELECT * FROM dept_emp
LIMIT 3;

SELECT * FROM membertbl;

DESC membertbl;

INSERT INTO membertbl VALUES('Kang','강성헌','대구 달서구 용산동');

SELECT * FROM membertbl;

CREATE TABLE testtbl2(
id INT AUTO_INCREMENT, -- 정수형만 가능, pk만 가능
username CHAR(3),
age INT,
PRIMARY KEY(id)
);

INSERT INTO testtbl2 (username, age)
VALUES('지민',25),
('유나',22),
('유경',21);

INSERT INTO testtbl2 VALUES(NULL, 'ㅁㄴ',20);

INSERT INTO testtbl2 (username, age)
SELECT username, 30 FROM testtbl2;

SELECT *, '안녕'FROM testtbl2;

INSERT INTO testtbl2(username, age)
SELECT '홍길동',age FROM testtbl2
LIMIT 2;

SELECT * FROM testtbl2;

UPDATE testtbl2 SET username = '조현민', age =24
WHERE id=3;

DELETE FROM testtbl2
WHERE id = 12;

CREATE TABLE testtbl3
AS
SELECT * FROM testtbl2;

SELECT * FROM testtbl3;

CREATE table testtbl4 ( SELECT * FROM testtbl2);

DELETE FROM testtbl3;
TRUNCATE testtbl4;

SELECT * FROM testtbl4;

DELETE FROM testtbl2;

INSERT IGNORE INTO testtbl2 --ignore 에러가 터지면 에러난 구문만 넘기고 다음 문장을 실행함
VALUES(1,'지민',25);
INSERT IGNORE INTO testtbl2
VALUES(1,'지민',25);
INSERT IGNORE INTO testtbl2
VALUES(3,'유경',25);

SELECT * FROM testtbl2;

SELECT NOW();

SELECT CAST('2020-10-19 12:35:29' AS DATETIME); -- cast 타입 형 변환 할때 사용 as 타입

SELECT CAST('10' AS INT), '10';

SELECT '10'+'10';
SELECT 'a10'+'10';
select CONCAT('10','10');  -- concat 문자열 합치기

SELECT DATE_FORMAT(NOW(), '%y년%m월%d일' "년월일"); -- date format 날짜형식 지정
SELECT DATE_FORMAT(NOW(), '%y년%m월%d일 %h:%i:%s');

SELECT * FROM employees;

SELECT emp_no, gender ,if(gender='M', '남자','여자') FROM employees;

SELECT emp_no, gender ,if(gender='M', '남자', if(gender = 'F','여성','외계인')) FROM employees;

SELECT emp_no, gender ,
	case when gender = 'm'
		  then '남성'
		  ELSE '여성'
	end
FROM employees;

SELECT * FROM salaries
WHERE salary IS NULL; -- is null : null이 있는것들

SELECT *, IFNULL(salary,'널이다!') FROM salaries -- ifnull : 널값이라면 
WHERE salary IS NULL;

SELECT
	case 10
	when 1 then '일'
	when 5 then '오'
	when 10 then '십'
	else '뭐지'
	end as c_case;


SELECT * FROM producttbl;

SELECT company, case company
	when '대우' then '탱크대우'
	when 'LG' then '사랑해요LG'
	when '삼성' then '또 하나의 가족'
	ELSE '바보'
	END 
	FROM producttbl;
	
SELECT *, case
When salary >= 80000 then '최고급인력'
when salary >=70000 then '고급인력'
ELSE '저급인력'
end
FROM salaries;
 
SELECT *, CONCAT(first_name, last_name) FROM employees;

SELECT *, CONCAT_WS(' ',first_name, last_name) FROM employees;

SELECT FORMAT (123456.123456, 4);

SELECT * FROM dept_emp;

SELECT *, INSERT(dept_no, 2, 2, 'i') FROM dept_emp;

SELECT * FROM employees;
SELECT first_name, LEFT(first_name,2) FROM employees;
SELECT first_name, RIGHT(first_name,3) FROM employees;
SELECT MID(birth_date,6,2) FROM employees;

SELECT first_name, UPPER(first_name) FROM employees;
SELECT first_name, LOWEr(first_name) FROM employees;

SELECT TRIM('      안녕      ');
SELECT LTRIM('       안녕     ');
SELECT RTRIM('       안녕     ');

SELECT REPLACE('       안   녕     ',' ' , '!'); -- 공백을 !로 치환

SELECT MID(birth_date,6,2) FROM employees;
SELECT birth_date, CAST( SUBSTRING(birth_date,6 ,2) AS INT) FROM employees;

SELECT CEILING(4.7);
SELECT CEIL(4.7);
SELECT ROUND(10.6);
SELECT ROUND(10.4);
SELECT FLOOR(10.9);

