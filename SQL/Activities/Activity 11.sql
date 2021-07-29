REM   Script: Activity 11
REM   Activity 11

SELECT * FROM CUSTOMERS;

SELECT * FROM SALESMAN;

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

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

CREATE TABLE salesman ( 
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

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

insert into customers values  
(3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001), 
(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

insert into customers values  
(3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001), 
(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

insert into customers values ( 
(3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001), 
(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005));

insert into customers  
values (3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001);

(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

insert into customers  
values (3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001);

(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

insert into customers  
values (3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001);

(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

insert into customers  
values (3002, 'Nick Rimando', 'New York', 100, 5001);

(3007, 'Brad Davis', 'New York', 200, 5001);

(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

insert into customers  
values (3002, 'Nick Rimando', 'New York', 100, 5001);

INSERT INTO customers  
VALUES (3002, 'Nick Rimando', 'New York', 100, 5001);

INSERT INTO customers  
VALUES (3002, 'Nick Rimando', 'New York', 100, 5001);

(3007, 'Brad Davis', 'New York', 200, 5001);

(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

SELECT * FROM CUSTOMERS;

INSERT INTO customers  
VALUES (3007, 'Brad Davis', 'New York', 200, 5001), 
(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

INSERT INTO customers  
VALUES (3007, 'Brad Davis', 'New York', 200, 5001), 
(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

SELECT * FROM CUSTOMERS;

INSERT INTO customers  
VALUES (3007, 'Brad Davis', 'New York', 200, 5001),(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002),(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

INSERT INTO customers  
VALUES (3007, 'Brad Davis', 'New York', 200, 5001);

(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002),(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

SELECT * FROM CUSTOMERS;

INSERT INTO customers  
VALUES (3005, 'Graham Zusi', 'California', 200, 5002);

INSERT INTO customers  
VALUES (3008, 'Julian Green', 'London', 300, 5002);

, ,(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 


(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

SELECT * FROM CUSTOMERS;

INSERT INTO customers  
VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006);

, ,, (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 


(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

SELECT * FROM CUSTOMERS;

INSERT INTO customers  
VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003);

, ,, , 


(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

SELECT * FROM CUSTOMERS;

INSERT INTO customers  
VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003);

, ,, , 


(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

SELECT * FROM CUSTOMERS;

INSERT INTO customers  
VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007);

, ,, , 


, (3001, 'Brad Guzan', 'London', 300, 5005); 


SELECT * FROM CUSTOMERS;

INSERT INTO customers  
VALUES (3001, 'Brad Guzan', 'London', 300, 5005);

, ,, , 


, ; 


SELECT * FROM CUSTOMERS;

INSERT INTO customers  
VALUES (3001, 'Brad Guzan', 'London', 300, 5005);

, ,, , 


, ; 


SELECT * FROM CUSTOMERS;

INSERT INTO customers  
VALUES (3001, 'Brad Guzan', 'London', 300, 5005);

, ,, , 


, ; 


SELECT * FROM CUSTOMERS;

SELECT * FROM CUSTOMERS;

SELECT * FROM CUSTOMERS;

SELECT * FROM SALESMAN;

SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT * FROM CUSTOMERS;

SELECT * FROM SALESMAN;

SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT * FROM CUSTOMERS;

SELECT * FROM SALESMAN;

SELECT a.customer_name AS "Customer Name", a.city, b.SALESMAN_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT a.customer_name, a.city, a.grade, b.SALESMAN_name AS "Salesman", b.city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

SELECT * FROM CUSTOMERS;

SELECT * FROM SALESMAN;

SELECT a.customer_name AS "Customer Name", a.city, b.SALESMAN_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT a.customer_name, a.city, a.grade, b.SALESMAN_name AS "Salesman", b.city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

SELECT * FROM CUSTOMERS;

SELECT * FROM SALESMAN;

SELECT a.customer_name AS "Customer Name", a.city, b.SALESMAN_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT a.customer_name, a.city, a.grade, b.SALESMAN_name AS "Salesman", b.SALESMAN_city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

SELECT * FROM CUSTOMERS;

SELECT * FROM SALESMAN;

SELECT a.customer_name AS "Customer Name", a.city, b.SALESMAN_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT a.customer_name, a.city, a.grade, b.SALESMAN_name AS "Salesman", b.SALESMAN_city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

SELECT a.customer_name AS "Customer Name", a.city, b.SALESMAN_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id  
WHERE b.commission>12;

SELECT * FROM CUSTOMERS;

SELECT * FROM SALESMAN;

SELECT a.customer_name AS "Customer Name", a.city, b.SALESMAN_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT a.customer_name, a.city, a.grade, b.SALESMAN_name AS "Salesman", b.SALESMAN_city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

SELECT a.customer_name AS "Customer Name", a.city, b.SALESMAN_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id  
WHERE b.commission>12;

SELECT a.order_no, a.order_date, a.purchase_amount, b.customer_name AS "Customer Name", b.grade, c.name AS "Salesman", c.commission FROM orders a  
INNER JOIN customers b ON a.customer_id=b.customer_id  
INNER JOIN salesman c ON a.salesman_id=c.salesman_id;

SELECT a.order_no, a.order_date, a.purchase_amount, b.customer_name AS "Customer Name", b.grade, c.SALESMAN_name AS "Salesman", c.commission FROM orders a  
INNER JOIN customers b ON a.customer_id=b.customer_id  
INNER JOIN salesman c ON a.salesman_id=c.salesman_id;

SELECT * FROM ORDERS 
WHERE SALESMAN_ID=(SELECT DISTINCT SALESMAN_IF FROM ORDERS WHERE CUSTOMER_ID=3007);

SELECT * FROM ORDERS 
WHERE SALESMAN_ID=(SELECT DISTINCT SALESMAN_ID FROM ORDERS WHERE CUSTOMER_ID=3007);

SELECT * FROM CUSTOMERS;

SELECT * FROM SALESMAN;

Write queries for the following: 


Write a query to find all the orders issued against the salesman who may works for customer whose id is 3007. 


SELECT * FROM ORDERS 
WHERE SALESMAN_ID=(SELECT DISTINCT SALESMAN_ID FROM ORDERS WHERE CUSTOMER_ID=3007);

SELECT * FROM orders 
WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3007);

Write a query to find all orders attributed to a salesman in New York. 


Write a query to count the customers with grades above New York's average. 


Write a query to extract the data from the orders table for those salesman who earned the maximum commission


SELECT * FROM orders 
WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3007);

SELECT * FROM orders 
WHERE salesman_id=(SELECT salesman_id FROM orders WHERE customer_id=3007);

SELECT * FROM orders 
WHERE CUSTOMER_ID=(SELECT salesman_id FROM orders WHERE customer_id=3007);

SELECT * FROM ORDERS 
WHERE SALESMAN_ID IN (SELECT DISTINCT SALESMAN_ID FROM ORDERS WHERE CUSTOMER_ID=3007);

SELECT * FROM CUSTOMERS;

SELECT * FROM SALESMAN;

Write queries for the following: 


SELECT * FROM ORDERS 
WHERE SALESMAN_ID IN (SELECT DISTINCT SALESMAN_ID FROM ORDERS WHERE CUSTOMER_ID=3007);

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York');

SELECT * FROM orders WHERE CITY='nEW yORK');

Write a query to count the customers with grades above New York's average. 


Write a query to extract the data from the orders table for those salesman who earned the maximum commission


SELECT * FROM orders WHERE CITY='New York');

SELECT * FROM CUSTOMERS;

SELECT * FROM SALESMAN;

Write queries for the following: 


SELECT * FROM ORDERS 
WHERE SALESMAN_ID IN (SELECT DISTINCT SALESMAN_ID FROM ORDERS WHERE CUSTOMER_ID=3007);

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York');

SELECT * FROM orders WHERE CITY=('New York');

Write a query to count the customers with grades above New York's average. 


Write a query to extract the data from the orders table for those salesman who earned the maximum commission


SELECT * FROM CUSTOMERS;

SELECT * FROM SALESMAN;

Write queries for the following: 


SELECT * FROM ORDERS 
WHERE SALESMAN_ID IN (SELECT DISTINCT SALESMAN_ID FROM ORDERS WHERE CUSTOMER_ID=3007);

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York');

SELECT * FROM orders WHERE CITY='New York';

Write a query to count the customers with grades above New York's average. 


Write a query to extract the data from the orders table for those salesman who earned the maximum commission


SELECT * FROM orders WHERE salesman_CITY='New York';

SELECT * FROM CUSTOMERS;

SELECT * FROM SALESMAN;

Write queries for the following: 


SELECT * FROM ORDERS 
WHERE SALESMAN_ID IN (SELECT DISTINCT SALESMAN_ID FROM ORDERS WHERE CUSTOMER_ID=3007);

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York');

SELECT * FROM orders WHERE salesman_CITY='New York';

Write a query to count the customers with grades above New York's average. 


Write a query to extract the data from the orders table for those salesman who earned the maximum commission


SELECT * FROM CUSTOMERS;

SELECT * FROM SALESMAN;

Write queries for the following: 


SELECT * FROM SALESMAN;

Write queries for the following: 


SELECT * FROM SALESMAN;

Write queries for the following: 


SELECT * FROM SALESMAN;

Write queries for the following: 


SELECT * FROM ORDERS 
WHERE SALESMAN_ID IN (SELECT DISTINCT SALESMAN_ID FROM ORDERS WHERE CUSTOMER_ID=3007);

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York');

SELECT * FROM orders WHERE salesman_CITY='New York';

Write a query to count the customers with grades above New York's average. 


Write a query to extract the data from the orders table for those salesman who earned the maximum commission


SELECT * FROM ORDERS 
WHERE SALESMAN_ID IN (SELECT DISTINCT SALESMAN_ID FROM ORDERS WHERE CUSTOMER_ID=3007);

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York');

SELECT * FROM orders WHERE salesman_CITY='New York';

Write a query to count the customers with grades above New York's average. 


Write a query to extract the data from the orders table for those salesman who earned the maximum commission


SELECT * FROM ORDERS 
WHERE SALESMAN_ID IN (SELECT DISTINCT SALESMAN_ID FROM ORDERS WHERE CUSTOMER_ID=3007);

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York');

SELECT * FROM orders WHERE salesman_CITY='New York';

Write a query to count the customers with grades above New York's average. 


Write a query to extract the data from the orders table for those salesman who earned the maximum commission


SELECT * FROM ORDERS 
WHERE SALESMAN_ID IN (SELECT DISTINCT SALESMAN_ID FROM ORDERS WHERE CUSTOMER_ID=3007);

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York');

SELECT * FROM orders WHERE salesman_CITY='New York';

Write a query to count the customers with grades above New York's average. 


Write a query to extract the data from the orders table for those salesman who earned the maximum commission


SELECT * FROM CUSTOMERS;

SELECT * FROM CUSTOMERS;

SELECT * FROM CUSTOMERS;

SELECT * FROM SALESMAN;

Write queries for the following: 


SELECT * FROM SALESMAN;

Write queries for the following: 


SELECT * FROM SALESMAN;

Write queries for the following: 


SELECT * FROM ORDERS 
WHERE SALESMAN_ID IN (SELECT DISTINCT SALESMAN_ID FROM ORDERS WHERE CUSTOMER_ID=3007);

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York');

SELECT * FROM orders WHERE salesman_CITY='New York';

Write a query to count the customers with grades above New York's average. 


Write a query to extract the data from the orders table for those salesman who earned the maximum commission


SELECT * FROM ORDERS 
WHERE SALESMAN_ID IN (SELECT DISTINCT SALESMAN_ID FROM ORDERS WHERE CUSTOMER_ID=3007);

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York');

SELECT * FROM orders WHERE salesman_CITY='New York';

Write a query to count the customers with grades above New York's average. 


Write a query to extract the data from the orders table for those salesman who earned the maximum commission


SELECT * FROM ORDERS 
WHERE SALESMAN_ID IN (SELECT DISTINCT SALESMAN_ID FROM ORDERS WHERE CUSTOMER_ID=3007);

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York');

SELECT * FROM orders WHERE salesman_CITY='New York';

Write a query to count the customers with grades above New York's average. 


Write a query to extract the data from the orders table for those salesman who earned the maximum commission


SELECT * FROM CUSTOMERS;

SELECT * FROM CUSTOMERS;

SELECT * FROM SALESMAN;

Write queries for the following: 


SELECT * FROM SALESMAN;

Write queries for the following: 


SELECT * FROM ORDERS 
WHERE SALESMAN_ID IN (SELECT DISTINCT SALESMAN_ID FROM ORDERS WHERE CUSTOMER_ID=3007);

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York');

SELECT * FROM orders WHERE salesman_CITY='New York';

Write a query to count the customers with grades above New York's average. 


Write a query to extract the data from the orders table for those salesman who earned the maximum commission


SELECT * FROM ORDERS 
WHERE SALESMAN_ID IN (SELECT DISTINCT SALESMAN_ID FROM ORDERS WHERE CUSTOMER_ID=3007);

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York');

SELECT * FROM orders WHERE salesman_CITY='New York';

Write a query to count the customers with grades above New York's average. 


Write a query to extract the data from the orders table for those salesman who earned the maximum commission


SELECT * FROM CUSTOMERS;

SELECT * FROM SALESMAN;

Write queries for the following: 


SELECT * FROM ORDERS 
WHERE SALESMAN_ID IN (SELECT DISTINCT SALESMAN_ID FROM ORDERS WHERE CUSTOMER_ID=3007);

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York');

SELECT * FROM orders WHERE salesman_CITY='New York';

Write a query to count the customers with grades above New York's average. 


Write a query to extract the data from the orders table for those salesman who earned the maximum commission


SELECT * FROM CUSTOMERS;

SELECT * FROM SALESMAN;

SELECT * FROM orders;

Write queries for the following: 


SELECT * FROM ORDERS 
WHERE SALESMAN_ID IN (SELECT DISTINCT SALESMAN_ID FROM ORDERS WHERE CUSTOMER_ID=3007);

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York');

SELECT * FROM orders WHERE salesman_CITY='New York';

Write a query to count the customers with grades above New York's average. 


Write a query to extract the data from the orders table for those salesman who earned the maximum commission


SELECT * FROM ORDERS 
WHERE SALESMAN_ID IN (SELECT DISTINCT SALESMAN_ID FROM ORDERS WHERE CUSTOMER_ID=3007);

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York');

SELECT * FROM orders WHERE salesman_CITY='New York';

Write a query to count the customers with grades above New York's average. 


Write a query to extract the data from the orders table for those salesman who earned the maximum commission


SELECT * FROM orders;

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York');

SELECT * FROM orders;

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='New York');

SELECT * FROM CUSTOMERS;

SELECT * FROM SALESMAN;

SELECT * FROM orders;

Write queries for the following: 


SELECT * FROM ORDERS 
WHERE SALESMAN_ID IN (SELECT DISTINCT SALESMAN_ID FROM ORDERS WHERE CUSTOMER_ID=3007);

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='New York');

Write a query to count the customers with grades above New York's average. 


Write a query to extract the data from the orders table for those salesman who earned the maximum commission


SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='Paris');

SELECT * FROM CUSTOMERS;

SELECT * FROM SALESMAN;

SELECT * FROM orders;

Write queries for the following: 


SELECT * FROM ORDERS 
WHERE SALESMAN_ID IN (SELECT DISTINCT SALESMAN_ID FROM ORDERS WHERE CUSTOMER_ID=3007);

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='Paris');

Write a query to count the customers with grades above New York's average. 


Write a query to extract the data from the orders table for those salesman who earned the maximum commission


SELECT grade, COUNT(*) FROM customers 
GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');

SELECT order_no, purchase_amount, order_date, salesman_id FROM orders 
WHERE salesman_id IN( SELECT salesman_id FROM salesman 
WHERE commission=( SELECT MAX(commission) FROM salesman));

SELECT customer_id, customer_name FROM customers a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id) 
UNION 
SELECT salesman_id, name FROM salesman a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id) 
ORDER BY customer_name;

SELECT a.salesman_id, name, order_no, 'highest on', order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = b.order_date) 
UNION 
SELECT a.salesman_id, name, order_no, 'lowest on', order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);

