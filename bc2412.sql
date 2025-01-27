-- this is a comment line
-- MyQSLWorkbench is a client side, ->connect (ip/port/ password) -> MySQL Server (7x24)

-- MySQL DBMS case insensitive (Customer == CUSTOMER)

create database bootcamp_2412;

-- use database
use bootcamp_2412;

-- MySQL Server may conatins many database, one database may contains tables 
-- varchar == String
create table customers(
	id integer,
    first_name varchar(20),
    last_name varchar(20),
    email varchar (50),
    dob date
    
);

-- * means all columns
select *
from customers;

insert into customers (id, first_name , last_name , email , dob)
values( 1, 'Vincent' , 'Lau' , 'vincentlau@gmail.com', '1999-12-31');

insert into customers (id, first_name , last_name , email , dob)
values( 2, 'Sharon' , 'Chan' , 'sharonchan@gmail.com', '1997-11-10');

insert into customers (id, first_name , last_name , email , dob)
values( 3, 'Lucas' , 'Lu' , 'lucaslu@gmail.com', '1999-12-31');

insert into customers (id, first_name , last_name , email , dob)
values( 4, 'Oscar' , 'Wong' , 'oscarchan@gmail.com', '1996-11-10');

-- delete all data from table 
delete from customers;

-- delete data by criteria
delete from customers where last_name = 'Wong';

-- select specific to columns
-- select is to choose columns
select id, first_name, dob from customers;

-- where is to control rows
select id, first_name, dob from customers where dob < '2000-01-01';

-- SELECT doesn't change the data in harddisk. SQL is just using a program to retrieve the data in harddisk
-- insert , delete change the data in harddisk

-- More than one criteria
select * from customers where last_name = 'Lau' and dob > '1999-12-01';
select * from customers where last_name = 'Lau' or first_name = 'Sally';

-- and has a higher priority to execute
select * from customers where last_name = 'Lau' or first_name = 'Sally' and dob > '2000-01-01';
select * from customers where (last_name = 'Lau' or first_name = 'Sally') and dob > '2000-01-01';

-- not equals to  <> --> not equals (!= also OK, but not use in SQL left it in Java)
select * from customers where last_name <> 'Wong';

-- order by (default asc)
select * from customers order by first_name;
-- order by asc
select * from customers order by first_name asc ;
-- order by desc 
select * from customers order by first_name desc ;
-- 1 ms = 0.001 sec 

select * from customers where dob > '2000-01-01' order by id desc; -- stream.filter().sorted()


-- table: orders
-- id , amount , order_date, customer_id
create table orders (
	id integer,
    amount decimal (13, 2), -- 11 is for integer digit, 2 for deimacal plasces 
    order_date datetime, 
    customer_id integer
);
 -- drop table 
 drop table  orders;
 
select * from orders;

insert into orders (id, amount , order_date, customer_id)
 values (1, 100.9, STR_TO_DATE('2020-12-31 23:10:59', '%Y-%m-%d %H:%i:%s'), 1);

insert into orders (id, amount , order_date, customer_id) 
values (2, 999.9, current_time(),3);

insert into orders (id, amount , order_date, customer_id) 
values (3, 1999.2, current_time(), 3);

insert into orders values (4, 9999.9, current_time() , 3);

insert into orders values 
(5, 12000, current_time(), 3),
(6, 15000, current_time() , 3);

-- sum() , avg(), min(), max(), count() --> aggregate function -> result data structure changed
select sum(amount) from orders;
select avg(amount) from orders;
select min(amount) from orders;
select max(amount) from orders;
select count(amount) from orders;

-- NOT OK! as sum() already change the data structure, and there no id you can select. 
select sum(amount) , id from orders; 

-- OK , same data structure. 
select sum(amount) as total_amt, round(avg(amount),2) as avg_amt
, min(amount) as lowest_amt , max(amount) as highest_amt, 
count(amount) as order_count 
, 1
, 'hello' -- add 1, and 'hello'

from orders
where amount > 1000; -- affect min/max/sum them -> filter the columns that small than 1000.

-- SQL sequence 
-- 1. From
-- 2. Where
-- 3. Group By(Having)
-- 4. Order by
-- 5. select columns

-- Math
select floor (o.amount), o.* from orders o ; -- down to nearest intefer
select ceil (o.amount), o.* from orders o ; -- up to nearest integer
select abs(-4), abs(4) from dual;

-- String 
select concat(c.first_name, ' ' , c.last_name) as full_name, 
length(c.last_name) as length_of_lastname
, upper(c.first_name) as uppercase_firstname
, lower (c.first_name) as lowercase_firstname
, replace (c.email , '@', '$') as new_email
,substring (c.first_name , 1,1)as first_name_initial
, left (c.first_name, 2) as left_first_name
,right (c.first_name,2) as rigth
,instr(c.first_name , 'V') as firstname_contains_cap_letter
,instr(c.first_name , 'v') as firstname_contains_small_letter
 -- start from 1 NOT 'zero'
, c. * from customers c;

select * from customers;

-- Like 
-- % means any character 
select * from customers 
where first_name like 'V%';


select * 
from customers 
where first_name like '%V%T';

-- DATE
select o.*, date_add(o.order_date, interval 3 month) as follow_up_date
from orders o;

select * from orders; 
delete from orders where amount < '1000';

select o.* , date_sub(o.order_date, interval 3 day) as follow_up_date;

-- Separate the data into groups, by a column (customer_id)
-- After group by, you can only select the column that you used for "Group"
select customer_id, count(amount) as order_count , avg(amount) as aveerage_order_amount, max(amount), min(amount)
from orders
group by customer_id;

-- 3 5
-- 1 1

select count(1)
from orders o;

-- from --> where --> group by --> select 
select customer_id, sum(amount) as total_order_amt, count(1) as order_count
from orders
where amount < 5000
group by customer_id;



-- data type: Relational DB( Structure -> schema , its row * column)  
-- INNER JOIN ******* (customer x orders) 
-- 1. Find orders count by customers, show customer ID, first_name , last_name , order count 

select c.first_name, c.last_name, o.id
from customers inner join orders
group by c.id;

-- 3 customer x 6 orders
select * 
from customers c inner join orders o on c.id = o.customer_id;


select c.first_name , c.last_name, o.amount, o.id as order_id , c.id as customer_id
from customers c inner join orders o 
on o.customer_id = c.id;
-- Lucas (5), Vincent (1)


-- on vs where 
-- 1. 
select c.id , c.first_name, c.last_name, count(1) as order_count
from customers c, orders o 
where c.id = o.customer_id
and  o.amount < 5000
group by c.id, c.first_name, c.last_name;


select customer_id, count(1) as order_count, c.first_name , c.last_name
from customers c inner join orders o  on o.customer_id = c.id -- "on" -> before join
where o.amount < 5000 -- filter, "where" after join , but before group 
group by customer_id , c.first_name , c.last_name;

-- group by  + having ********** must together
select c.first_name , c.last_name, o.amount, o.id as order_id , c.id as customer_id
from customers c inner join orders o
on o.customer_id = c.id  
where o.amount < 5000 -- filter record (rows)
group by c.id , c.first_name, c.last_name 
having count(1) > 1 -- after filter group --> filter group 
order by c.id ;

-- distinct
-- Distinct column shouyld exist in "group by" 
-- select distinct id 
-- forom customers
-- group by last_name , frist_name

select distinct customer_id -- no matter how many 1 and 3 id, it only count 1 and 3.
from orders;

select distinct last_name
from customers;

insert into customers (id, first_name , last_name, email , dob) 
values (4, 'Vincent', 'Lau', 'vincentlau@gmail.com' , '1999-11-10');

select distinct last_name , first_name
from customers;


select distinct last_name , first_name
from customers
group by last_name, first_name;


-- LEFT JOIN ******
-- Show all records of the left table (customers) is major
-- it will show all customers data, order can be missing  (even no orders)
-- Find all customer with his orders
-- 'many' side must having the data --> e.g: orders address must belong to customers 
-- e.g: orders must belong to customers 

select c.* , o.*
from customers c left join orders o on c.id = o.customer_id;

select o.* , c.*
from orders o left join customers c on c.id = o.customer_id;

-- Right join (same result as Left join)
select o.* , c.*
from orders o right join customers c on c.id = o.customer_id;
select c.* , o.*
from customers c right join orders o on c.id = o.customer_id;

-- Find the customer who did'n place orders
-- left join
-- where
select c.* , o.* 
from customers c left join orders o on c.id = o.customer_id
where o.amount is  null ; -- null is using 'is' 
-- if find having order --> 'is not null'

-- join / group by
-- join -> inner join / left join? 
-- group by -> work with where, having , agg function 


-- 584 where ifnull(c.referee_id, 'x') <> 2;


select *
from orders;

-- Add PK for customers , order
ALTER TABLE Products ADD CONSTRAINT pk_customer_id PRIMARY KEY (id);
ALTER TABLE orders ADD CONSTRAINT pk_order_id PRIMARY KEY (id);
-- Add FK for Orders
ALTER TABLE orders ADD CONSTRAINT fk_customer_id FOREIGN KEY (customer_id) REFERENCES customers(id);

-- not allowed FK fail.
insert into orders values (7,400.0, current_time(),99);

