SHOW INDEX FROM t_score;
SELECT * FROM t_score;

SHOW FULL TABLES
WHERE TABLE_TYPE LIKE 'view';

CREATE INDEX idx_abcd ON 테이블명(컬럼명);

CREATE INDEX idx_abcd1 ON membertbl (memberAddress);
DROP INDEX idx_abcd1 ON membertbl;

SELECT * FROM membertbl;
SHOW INDEX FROM membertbl;

CREATE VIEW view_abcd AS
SELECT *FROM membertbl
WHERE membername LIKE '%이%';

SELECT * FROM view_abcd;

CREATE TABLE t_order(
	o_no INT PRIMARY KEY,
	cus_no INT,
	o_date DATE DEFAULT NOW(),
	o_price INT DEFAULT 0,
	FOREIGN KEY(cus_no) REFERENCES t_customer(cus_no)
);

SELECT * FROM t_order;

CREATE TABLE t_order1(
	o_no INT PRIMARY KEY,
	cus_no INT,
	o_date DATEtime DEFAULT NOW(),
	o_price INT DEFAULT 0,
	FOREIGN KEY(cus_no) REFERENCES t_customer(cus_no)
);


INSERT INTO t_order1(o_no, cus_no, o_price) VALUES(1,3,55000),
(2,5,70000),
(3,3,60000);

SELECT * FROM t_order1;

DESC t_order;

CREATE TABLE t_customer(
	cus_no INT PRIMARY KEY,
	nm CHAR(10) NOT NULL
);


INSERT INTO t_customer VALUES(3,'홍길동'),(5,'이순신');
SELECT * FROM t_customer;

INSERT INTO t_order(o_no, cus_no, o_price) VALUES(1,3,55000),
(2,5,70000),
(3,3,60000);
SELECT o_no, o_price FROM t_order WHERE cus_no = 3;

SELECT * FROM t_order;

UPDATE t_customer SET nm='장보고' WHERE cus_no = 5;

DELETE FROM t_order WHERE o_no = 2;

SHOW TABLES;

SHOW INDEX FROM t_order;

SHOW FULL TABLES
WHERE table_type LIKE 'view';

CREATE INDEX idx_customer_nm ON t_customer(nm);

SHOW INDEX FROM t_customer;

DROP INDEX t_customer;
ALTER TABLE t_customer DROP INDEX idx_customer_nm;

SELECT * FROM t_order;
SELECT * FROM t_customer;


CREATE VIEW view_order_info
as
SELECT a.o_no, a.o_date, a.o_price, b.nm FROM t_order a
INNER JOIN t_customer b
ON a.cus_no = b.cus_no;

SELECT * FROM view_order_info;

DROP VIEW view_order_info;
