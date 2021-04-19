CREATE TABLE tournament(
	tournament VARCHAR(50),
	yyear INT,
	winnder VARCHAR(20),
	PRIMARY KEY(tournament, yyear)
);

DESC tournament;

CREATE TABLE subject(
	s_id INT,
	s_name VARCHAR(10),
	subject_opted varchar(10),
	PRIMARY KEY(s_id, s_name)
);

DROP TABLE tournament;
DESC subject;

/*
	제1정규화
	1) 반복 그룹이 존재하면 안된다.
	2) 모든 행은 식별자로 완전하게 구분되어야 한다.
	
	제2정규화
	1) key가 아닌 컬럼(속성)은 key 컬럼이에 종속 되어야 한다.
	2) key가 아닌 컬럼(속성)은 key 컬럼에만! 종속 되어야 한다. 그래서
	복합키 일때만! 제 2정규형의 조건이 되는것

	제3정규화
	1) 모든 key가 아닌 컬럼(non-key)은 key 컬럼(속성)에 완전히 종속 되어야 한다.
	2) 모든 non-key 컬럼은 key 컬럼(속성)에만 종속 되어야 한다.

	Foreign Key (FK)
	외래키
	
	제약조건 > 잘 못된 값이 들어가지 않도록 or 맞는
	값만 들어가도록 유도?

*/

CREATE TABLE t_student(
	s_id INT UNSIGNED PRIMARY KEY,
	nm VARCHAR(3) NOT NULL,
	ph CHAR(13)
);

DROP TABLE t_class;

SELECT * FROM t_student;
drop table t_score;

INSERT INTO t_student(s_id, nm) VALUES(1111,'갑');
INSERT INTO t_student VALUES(1112,'을','010-111-1111');
INSERT INTO t_student VALUES(1113,'병','010-222-2222');
INSERT INTO t_student VALUES(1114,'병','010-222-2222');

CREATE TABLE t_class(
	c_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	cls VARCHAR(5) NOT NULL,
	teacher VARCHAR(5) NOT null
);

INSERT INTO t_class(cls, teacher) VALUES('수학','김하나');
INSERT INTO t_class(cls, teacher) VALUES('과학','판테온');
INSERT INTO t_class(cls, teacher) VALUES('국어','오징어');
INSERT INTO t_class(cls, teacher) VALUES('영어','오징어');
SELECT * FROM t_class;


CREATE TABLE t_score(
	s_id INT UNSIGNED,
	c_id INT UNSIGNED,
	score INT,	
	PRIMARY KEY(s_id, c_id),
	FOREIGN KEY(s_id) REFERENCES t_student(s_id),
	FOREIGN KEY(c_id) REFERENCES t_class(c_id)
);

INSERT INTO t_score VALUES(1114,4,100);
(1111,2,90),
(1111,3,80),
(1112,1,70),
(1112,4,100);

DESC t_score;
DELETE FROM t_score;
SELECT * FROM t_score;
SELECT * FROM t_student;

DROP TABLE t_score;


SELECT b.nm, c.cls, a.score FROM t_score a
INNER JOIN t_student b
ON a.s_id = b.s_id
inner JOIN t_class c
ON a.c_id = c.c_id;

DROP TABLE t_board;
CREATE TABLE t_board(
	iboard INT PRIMARY KEY AUTO_INCREMENT,
	title VARCHAR(100) NOT NULL,
	ctnt VARCHAR(500) NOT NULL,
	r_dt DATETIME DEFAULT NOW()
);
DESC t_board;
DROP TABLE t_cmt;
CREATE TABLE t_cmt(
	icmt INT PRIMARY KEY AUTO_INCREMENT,
	iboard INT,
	ctnt VARCHAR(100) NOT NULL,
	r_dt DATETIME DEFAULT NOW()
);
DESC t_cmt;

INSERT INTO t_board(title, ctnt) VALUES('Hi','good');
SELECT * FROM t_board;

INSERT INTO t_cmt(iboard, ctnt) VALUES(1,'저또한 그랬습니다');
select * from t_cmt;

SELECT a.title, a.ctnt, b.ctnt AS '댓글' FROM t_board a
INNER JOIN t_cmt b
ON a.iboard = b.iboard;

SELECT a.title, a.ctnt, IFNULL(b.ctnt, '댓글없음') AS '댓글' FROM t_board a
left JOIN t_cmt b
ON a.iboard = b.iboard;

SELECT a.title, a.ctnt, b.ctnt AS '댓글' FROM t_board a
right JOIN t_cmt b
ON a.iboard = b.iboard;

SELECT a.iboard, a.title, a.ctnt, b.ctnt FROM t_board a
LEFT JOIN t_cmt b
ON a.iboard = b.iboard
WHERE b.icmt IS null;


