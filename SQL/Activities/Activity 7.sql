REM   Script: Activity 7
REM   Activity 7

select * from salesman;

select * from salesman;

CREATE TABLE salesman( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

CREATE TABLE salesman( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

CREATE TABLE salesman( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

select * from SALESMAN;

SELECT * FROM salesman;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

SELECT * FROM ORDERS;

SELECT SUM(PURCHASE_AMOUNT) FROM ORDERS;

Write an SQL statement to find the average purchase amount of all orders. 


Write an SQL statement to get the maximum purchase amount of all the orders. 


Write an SQL statement to get the minimum purchase amount of all the orders. 


Write an SQL statement to find the number of salesmen listed in the table. 


SELECT SUM(PURCHASE_AMOUNT) FROM ORDERS;

Write an SQL statement to find the average purchase amount of all orders. 


SELECT AVG(PURCAHSE_AMT) FROM ORDERS;

Write an SQL statement to get the maximum purchase amount of all the orders. 


Write an SQL statement to get the minimum purchase amount of all the orders. 


Write an SQL statement to find the number of salesmen listed in the table. 


SELECT SUM(PURCHASE_AMOUNT) FROM ORDERS;

Write an SQL statement to find the average purchase amount of all orders. 


SELECT AVG(PURCAHSE_AMOUNT) FROM ORDERS;

Write an SQL statement to get the maximum purchase amount of all the orders. 


Write an SQL statement to get the minimum purchase amount of all the orders. 


Write an SQL statement to find the number of salesmen listed in the table. 


SELECT SUM(PURCHASE_AMOUNT) FROM ORDERS;

SELECT AVG(PURCAHSE_AMOUNT) FROM ORDERS;

Write an SQL statement to get the maximum purchase amount of all the orders. 


Write an SQL statement to get the minimum purchase amount of all the orders. 


Write an SQL statement to find the number of salesmen listed in the table. 


SELECT SUM(PURCHASE_AMOUNT) FROM ORDERS;

SELECT AVG(PURCHASE_AMOUNT) FROM ORDERS;

Write an SQL statement to get the maximum purchase amount of all the orders. 


Write an SQL statement to get the minimum purchase amount of all the orders. 


Write an SQL statement to find the number of salesmen listed in the table. 


SELECT SUM(PURCHASE_AMOUNT) FROM ORDERS;

SELECT AVG(PURCHASE_AMOUNT) FROM ORDERS;

SELECT MAX(PURCHASE_AMOUNT) FROM ORDERS;

Write an SQL statement to get the minimum purchase amount of all the orders. 


Write an SQL statement to find the number of salesmen listed in the table. 


SELECT SUM(PURCHASE_AMOUNT) FROM ORDERS;

SELECT AVG(PURCHASE_AMOUNT) FROM ORDERS;

SELECT MAX(PURCHASE_AMOUNT) FROM ORDERS;

SELECT * FROM OREDRS;

Write an SQL statement to get the minimum purchase amount of all the orders. 


Write an SQL statement to find the number of salesmen listed in the table. 


SELECT SUM(PURCHASE_AMOUNT) FROM ORDERS;

SELECT AVG(PURCHASE_AMOUNT) FROM ORDERS;

SELECT MAX(PURCHASE_AMOUNT) FROM ORDERS;

SELECT * FROM ORDERS;

Write an SQL statement to get the minimum purchase amount of all the orders. 


Write an SQL statement to find the number of salesmen listed in the table. 


SELECT SUM(PURCHASE_AMOUNT) FROM ORDERS;

SELECT AVG(PURCHASE_AMOUNT) FROM ORDERS;

SELECT MAX(PURCHASE_AMOUNT) FROM ORDERS;

SELECT MIN(PURCHASE_AMOUNT) FROM ORDERS;

Write an SQL statement to find the number of salesmen listed in the table. 


SELECT SUM(PURCHASE_AMOUNT) FROM ORDERS;

SELECT AVG(PURCHASE_AMOUNT) FROM ORDERS;

SELECT MAX(PURCHASE_AMOUNT) FROM ORDERS;

SELECT MIN(PURCHASE_AMOUNT) FROM ORDERS;

SELECT COUNT(PURCHASE_AMOUNT) FROM ORDERS;

SELECT * FROM ORDERS;

SELECT SUM(PURCHASE_AMOUNT) FROM ORDERS;

SELECT AVG(PURCHASE_AMOUNT) FROM ORDERS;

SELECT MAX(PURCHASE_AMOUNT) FROM ORDERS;

SELECT MIN(PURCHASE_AMOUNT) FROM ORDERS;

SELECT COUNT(SALESMAN_ID) FROM ORDERS;

SELECT * FROM ORDERS;

SELECT SUM(PURCHASE_AMOUNT) FROM ORDERS;

SELECT AVG(PURCHASE_AMOUNT) FROM ORDERS;

SELECT MAX(PURCHASE_AMOUNT) FROM ORDERS;

SELECT MIN(PURCHASE_AMOUNT) as "Minimum" FROM ORDERS;

SELECT COUNT(SALESMAN_ID) FROM ORDERS;

SELECT * FROM ORDERS;

SELECT COUNT(SALESMAN_ID) AS "Total count of salesman" FROM ORDERS;

SELECT COUNT(DISTINCT SALESMAN_ID) AS "Total count of distinct salesman" FROM ORDERS;

