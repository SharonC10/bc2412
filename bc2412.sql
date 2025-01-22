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
create database orders;





















