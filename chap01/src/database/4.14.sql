CREATE TABLE t_exam(
	i_exam INT PRIMARY KEY,
	title VARCHAR(100),
	jumin CHAR(13),
	age INT(3) NOT NULL
);

DROP TABLE t_exam;


CREATE DATABASE java;
DROP DATABASE java;

INSERT INTO t_exam(i_exam, title, jumin, age) VALUES(3,"test","980924-171111",18);
-- 주석
#주석
/*
주석
*/
SELECT * FROM t_exam;
/*
<CRUD> - DML 조작어
C - 쓰기 - insert
R - 읽기 - select
U - 수정 - update
D - 삭제 - delete
*/

UPDATE t_exam SET age = 20 WHERE i_exam = 1;

DELETE FROM t_exam
WHERE i_exam = 2;