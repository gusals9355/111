create TABLE memberTBL(
	memberID CHAR(8) PRIMARY KEY,
	memberName CHAR(5) NOT NULL,
	memberAddress CHAR(20)
);

/*
--varchar(8) vs char(8)
varchar는 넣는 크기에 맞게 들어감
char는 8크기가 고정으로 메모리에 들어감
*/

CREATE TABLE producttbl(
	productname CHAR(4) NOT NULL,
	cost INT NOT NULL,
	MAKEDATE DATE,
	company CHAR(5),
	amount INT NOT NULL
);
	
INSERT INTO membertbl VALUES('Sang','상길이','경기 성남시 분당구');

INSERT INTO producttbl VALUES('냉장고', 5, '2018-09-01','대우',2);

DELETE FROM membertbl WHERE membername ='jo';

SELECT * FROM membertbl;
SELECT * FROM producttbl;
SELECT * FROM producttbl WHERE company = '삼성';
SELECT * FROM membertbl WHERE membername = '지운이';
SELECT cost FROM producttbl WHERE cost >= 10;

DROP TABLE t_exam;

DESC salaries;

CREATE TABLE indextbl(
first_name VARCHAR(14),
last_name varchar(16),
hire_date DATE
);

DESC indextbl;

INSERT INTO indextbl(first_name, last_name, hire_date)
SELECT first_name, last_name, hire_date FROM employees.employees LIMIT 1000;


EXPLAIN SELECT * FROM indextbl WHERE first_name = 'Mary';
SELECT * FROM indextbl;

CREATE INDEX idx_indextbl_firstname
ON indextbl(FIRST_name);

SELECT DISTINCT 컬럼명 FROM 테이블명
WHERE 조건식
GROUP BY 컬럼명
HAVING 그룹바이의 조건식
ORDER BY 정렬
LIMIT 레코드 수 조정;

SHOW DATABASES;
USE employees;
SHOW TABLES;
SHOW TABLE STATUS;

SELECT FIRST_name "fname" FROM indextbl;

DESC titles;
SELECT * FROM titles
WHERE emp_no >= 10600;



SELECT * FROM titles
WHERE emp_no >= 10600 and title = 'staff';

SELECT * FROM titles
WHERE emp_no >= 10000 and emp_no <=20000;

SELECT * FROM titles
WHERE emp_no BETWEEN 10000 AND 20000;

SELECT * FROM titles
WHERE title = 'engineer' OR title = 'staff';

SELECT * FROM titles
WHERE title IN('engineer','staff');

SELECT * FROM employees
WHERE first_name like 'g%';

SELECT * FROM employees
WHERE last_name LIKE '%m';

SELECT * FROM employees
WHERE last_name LIKE '%ma%';

SELECT * FROM employees
WHERE last_name LIKE '_ma%';

SELECT * FROM employees
WHERE gender = (SELECT gender FROM employees
WHERE emp_no = 10066);

SELECT * FROM salaries
ORDER BY salary;

SELECT * FROM salaries
ORDER BY salary DESC;

SELECT * FROM salaries
ORDER BY emp_no desc, salary DESC;

SELECT * FROM dept_emp
order BY dept_no DESC, emp_no;

SELECT distinct dept_no FROM dept_emp;

SELECT * FROM salaries
ORDER BY salary desc
LIMIT 5;

SELECT * FROM dept_emp
ORDER BY emp_no;

SELECT * FROM dept_emp
ORDER BY emp_no
LIMIT 0, 5;/* 0번째부터 5번째까지 */

SELECT * FROM dept_emp
ORDER BY emp_no
LIMIT 5, 10; /* 5번째부터 10번째까지 */

SELECT COUNT(*) FROM salaries;

SELECT COUNT(emp_no) from salaries;

SELECT MAX(salary) FROM salaries;
SELECT min(salary) FROM salaries;
SELECT sum(salary) FROM salaries;
SELECT SUM(salary)/COUNT(salary) FROM salaries;
SELECT AVG(salary) FROM salaries;

SELECT emp_no, AVG(salary), MAX(salary), MIN(salary), SUM(salary), COUNT(salary) FROM salaries
GROUP BY emp_no
order BY AVG(salary) desc;

SELECT * FROM salaries;

SELECT avg(salary), COUNT(salary) FROM salaries
GROUP BY emp_no
order BY COUNT(salary) DESC, AVG(salary) DESC;

SELECT avg(salary), COUNT(salary) "평균개월" FROM salaries
GROUP BY emp_no
HAVING 평균개월 = 10
order BY COUNT(salary) DESC, AVG(salary) DESC;

SELECT * FROM salaries;

SELECT emp_no, AVG(salary) "평균급여" FROM salaries
GROUP BY emp_no
HAVING 평균급여 >= 90000
ORDER BY 평균급여;

SELECT * FROM titles;
#가장 많은 인원이 있는 title이 무엇인지 표시 레코드 하나만 나오면됨
SELECT max(count(emp_no)) FROM titles
GROUP BY title
order BY COUNT(emp_no);

SELECT title FROM titles
GROUP BY title
order BY COUNT(emp_no) DESC
LIMIT 1;

SELECT title FROM titles
GROUP BY title
HAVING COUNT(title) = (SELECT MAX(COUNT(title)) FROM titles
GROUP BY title;

SELECT * FROM employees
WHERE 



