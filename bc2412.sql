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
ALTER TABLE customers ADD CONSTRAINT pk_customer_id PRIMARY KEY (id);
ALTER TABLE orders ADD CONSTRAINT pk_order_id PRIMARY KEY (id);
-- Add FK for Orders
ALTER TABLE orders ADD CONSTRAINT fk_customer_id FOREIGN KEY (customer_id) REFERENCES customers(id);

-- not allowed FK fail.
insert into orders values (7,400.0, current_time(),99);

insert into customers (id, first_name , last_name , email , dob)
values( 9, 'Sharon' , 'Ng' , 'sharon@gmail.com', '1997-12-31');
insert into orders (id, amount , order_date, customer_id) 
values (10, 2000, current_time(),9);

create or replace view vcustomer_orders
as 
select c.id , c.first_name, c.last_name, c.email, o.amount, o.order_date, o.id as order_id
from customers c inner join orders o
on c.id = o.customer_id
;

-- when you select the view 
-- 1. real time execution for the SQL behind the view 
-- 2. when you modify the SQL behind the view, you have to re-compile view to take effective
-- 3. View has its own access right (select) , so that we can manage access right of table across accounts.
select * from vcustomer_orders;

alter table customers add order_count INT;
select * from customers;
select * from orders;

insert into orders (id, amount, order_date, customer_id)
values (8,100.9, current_time(), 1);

drop Trigger update_order_count;

DELIMITER //

CREATE TRIGGER update_order_count
AFTER INSERT ON orders
FOR EACH ROW
BEGIN
    -- TRIGGER CUSTOMER'S TRIGGER
    UPDATE customers
    SET order_count = order_count + 1
    WHERE id = NEW.customer_id;
END;
//

DELIMITER ;

select * from customers;
create table table_logs(
id int primary key,
table_name varchar(50),
column_name varchar(50),
old_value varchar(50),
new_value varchar(50)
);
select * from table_logs;

update 

DELIMITER //
create trigger update_customer_data
after update on customers
for each row 
Begin
if (old.dob <> new.dob ) Then
-- Trigger customer's trigger
insert into table_logs (table_name , column_name, old_value, new_value)
values('customers', 'Dob', Old.dob, new.dob)
end;
//

DELIMITER;
)

Create database bootcamp_exercise1;
use bootcamp_exercise1;
select *
from LOCATIONS;
-- delete all data from table 
delete from REGION;
-- drop table 
 drop table LOCATIONS;
-- ----------------------------------------------------------------

create table LOCATIONS(
location_id int primary key,
id int ,
street_address varchar(50),
postal_code int,
city varchar(50),
state_province varchar (50),
country_id varchar (50)
);
Alter table LOCATIONS add constraint 
fk_location_id foreign key (id) references COUNTRIES (id);

-- -----------------------------------
create table COUNTRIES(
id int primary key,
country_id varchar (50),
country_name varchar(50),
region_id int 
);
Alter table COUNTRIES add constraint 
fk_country_id foreign key (region_id) REFERENCES REGIONS (region_id);
-- -----------------------------------
create table REGIONS(
id int,
region_id int
);
Alter table REGIONS add constraint 
pk_id primary key (region_id) ;
-- -----------------------------------
insert into REGIONS (id ,region_id)
values(1,1);
insert into REGIONS (id, region_id)
values(2,2);
insert into REGIONS (id,region_id)
values(3,3);
insert into COUNTRIES (id, country_id,country_name, region_id)
values(1, 'DE', 'Germany',1);
insert into COUNTRIES (id, country_id,country_name, region_id)
values(2, 'IT', 'Italy',1);
insert into COUNTRIES (id, country_id,country_name, region_id)
values(3, 'US', 'United State',2);
insert into COUNTRIES (id, country_id,country_name, region_id)
values(4, 'JP', 'Japan',3);
insert into LOCATIONS (location_id, id, street_address,postal_code, city,state_province,country_id)
values(1000,2,'1297 Via Cola di Rie',989,'Roma',null, 'IT');
insert into LOCATIONS (location_id, id, street_address,postal_code, city,state_province,country_id)
values(1100,2,'93091 Calle della Te',10934,'Venice',null, 'IT');

insert into LOCATIONS (location_id, id, street_address,postal_code, city,state_province,country_id)
values(1200,4,'2017 Shinjuku-ku',1689,'Tokyo','Tokyo', 'JP');
insert into LOCATIONS (location_id, id, street_address,postal_code, city,state_province,country_id)
values(1400,3,'2014 Jabberwocky Rd',26192,'Southlake','Texas', 'US');

-- ----------------------------------------------------------------
select *
from Departments;
-- delete all data from table 
delete from REGION;
-- drop table 
 drop table JOBS;
 -- ----------------------------------------------------------------
create table DEPARTMENTS (
department_id int primary key,
departmant_name varchar (50),
manager_id int,
location_id int,
foreign key (location_id) references LOCATIONS (location_id)
);


create table JOBS(
id int primary key,
job_id varchar(20),
job_title varchar (35),
min_salary double,
max_salary double
);

create table EMPLOYEES (
id int primary key,
employee_id int,
first_name varchar (25),
last_name varchar (20),
email varchar(20),
phone_number varchar (20),
hire_date date,
job_id varchar (20),
salary double,
commission_pct double,
manager_id int,
department_id int,
foreign key (department_id) references DEPARTMENTS (department_id)
);


create table JOB_HISTORY(
id int,
employee_id int,
start_date date,
end_date date,
job_id varchar (20),
department_id int
);


-- Department------------------------------------------------------
insert into DEPARTMENTS (department_id, departmant_name, manager_id,location_id)
values(10, 'Aministration', 200,1100);
insert into DEPARTMENTS (department_id, departmant_name, manager_id,location_id)
values(20, 'Marketing', 201,1200);
insert into DEPARTMENTS (department_id, departmant_name, manager_id,location_id)
values(30, 'Purchasing', 202,1400);


-- Employees------------------------------------------------------
insert into EMPLOYEES (id, employee_id, first_name,last_name,
email,phone_number,hire_date,job_id,salary,commission_pct,
manager_id,department_id) 
values(1,100,'Steven','King','SKING','515-1234567',
'1987-06-17', 'ST_CLERK', 24000.00,0.00, 109,10);

insert into EMPLOYEES (id, employee_id, first_name,last_name,
email,phone_number,hire_date,job_id,salary,commission_pct,
manager_id,department_id) 
values(2,101,'Neena','Kochhar','NKOCHHAR','515-1234568',
'1987-06-18', 'MK_REP', 17000.00,0.00, 103,20);

insert into EMPLOYEES (id, employee_id, first_name,last_name,
email,phone_number,hire_date,job_id,salary,commission_pct,
manager_id,department_id) 
values(3,102,'Lex','De Haan','LDEHAAN','515-1234569',
'1987-06-19', 'IT_PROG', 17000.00,0.00, 108,30);

insert into EMPLOYEES (id, employee_id, first_name,last_name,
email,phone_number,hire_date,job_id,salary,commission_pct,
manager_id,department_id) 
values(4,103,'Alexander','Hunold','AHUNOLD','590-4234567',
'1987-06-20', 'MK_REP', 9000.00,0.00, 105,20);

-- Job History------------------------------------------------------
insert into JOB_HISTORY(id, employee_id, start_date, end_date, job_id, department_id)
values (1, 102, '1993-01-13', '1998-07-24','IT_PROG', 20);

insert into JOB_HISTORY(id, employee_id, start_date, end_date, job_id, department_id)
values (2, 101, '1993-09-21', '1993-10-27','MK_REP', 10);

insert into JOB_HISTORY(id, employee_id, start_date, end_date, job_id, department_id)
values (3, 101, '1993-10-28', '1997-03-15','MK_REP', 30);

insert into JOB_HISTORY(id, employee_id, start_date, end_date, job_id, department_id)
values (4, 100, '1996-02-17', '1999-12-19','ST_CLERK', 30);

insert into JOB_HISTORY(id, employee_id, start_date, end_date, job_id, department_id)
values (5, 103, '1998-03-24', '1999-12-31','MK_REP', 20)

-- Jobs------------------------------------------------------
insert into JOBS(id, job_id, job_title, min_salary, max_salary)
values (1,'IT_PROG', 'Software Developer', 17000, 30000 );

insert into JOBS(id, job_id, job_title, min_salary, max_salary)
values (2,'ST_CLERK', 'Clerk', 20000, 30000 );

insert into JOBS(id, job_id, job_title, min_salary, max_salary)
values (3,'MK_REP', 'Maketer', 17000, 30000 );

-- Employees------------------------------------------------------
insert into EMPLOYEES (id, employee_id, first_name,last_name,
email,phone_number,hire_date,job_id,salary,commission_pct,
manager_id,department_id) 
values(5,104,'Sharon','Chan','Chan','515-1234555',
'1987-06-16', 'IT_PROG', 24000.00,0.00, 200,30);

insert into EMPLOYEES (id, employee_id, first_name,last_name,
email,phone_number,hire_date,job_id,salary,commission_pct,
manager_id,department_id) 
values(6,105,'Amy','Ng','Ng','515-1234888',
'1987-06-15', 'MK_REP', 24000.00,0.00, 201,20);

insert into EMPLOYEES (id, employee_id, first_name,last_name,
email,phone_number,hire_date,job_id,salary,commission_pct,
manager_id,department_id) 
values(7,106,'Toby','Wong','Wong','516-1234555',
'1987-06-14', 'ST_CLERK', 24000.00,0.00, 202,10);

update EMPLOYEES
set employee_id = 108
where id = 5;

update EMPLOYEES
set employee_id = 109
where id = 7;

insert into EMPLOYEES (id, employee_id, first_name,last_name,
email,phone_number,hire_date,job_id,salary,commission_pct,
manager_id,department_id) 
values(8,200,'Allen','Chan','Allen','516-1238888',
'1987-06-13', 'ST_CLERK', 24000.00,0.00, null ,10);

insert into EMPLOYEES (id, employee_id, first_name,last_name,
email,phone_number,hire_date,job_id,salary,commission_pct,
manager_id,department_id) 
values(9,201,'Vincent','Lau','Vincent','517-1234555',
'1987-06-12', 'MK_REP', 24000.00,0.00, null,20);

insert into EMPLOYEES (id, employee_id, first_name,last_name,
email,phone_number,hire_date,job_id,salary,commission_pct,
manager_id,department_id) 
values(10,202,'Lucas','Lau','Lau','518-1234555',
'1987-06-11', 'IT_PROG', 24000.00,0.00, null ,30);
-- ------------------------------------------------------
create table JOBS(
id int primary key,
job_id varchar(20),
job_title varchar (35),
min_salary double,
max_salary double
);

-- 3.
select location_id, street_address , city , state_province, country_name
from LOCATIONS L 
left join COUNTRIES C 
on L.country_id = C.country_id;
-- 4. 
select first_name , last_name, department_id
from EMPLOYEES;

-- 5.
with location_country as (
select  L.location_id , C.country_name
from LOCATIONS L 
left join COUNTRIES C
on L.country_id = C.country_id
),
department_japan_location as(
select LC.country_name , D.department_id
from DEPARTMENTS D 
inner join location_country LC
on D.location_id = LC.location_id
)
-- employee_in_japan
select E.first_name, E.last_name, E.job_id, E.department_id, DJL.country_name
from EMPLOYEES E 
left join department_japan_location DJL
on E.department_id = DJL.department_id
where DJL.country_name = 'Japan'
;
-- 6 
select e2.employee_id , e2.last_name , e1.last_name as manager_last_name
from EMPLOYEES e1 left join EMPLOYEES e2 
on e1.employee_id = e2.manager_id
where e2.manager_id is not null;


-- 7
select E.first_name, E.last_name, E.hire_date
from EMPLOYEES E
where E.hire_date > '1987-06-19';

-- 8 
select D.departmant_name, count(1)as total_employees
from DEPARTMENTS D
inner join EMPLOYEES E
on D.department_id = E.department_id
group by D.departmant_name, D.department_id
;
-- 9
select *
from JOB_HISTORY 
where end_date between start_date and end_date;

-- 10 
with city_name as (
select l.city , c.country_name , l.location_id
from LOCATIONS l left join COUNTRIES c
on l.country_id = c.country_id
) 
,department_name as (
select d.departmant_name , d.department_id ,cn.city, cn.country_name
from Departments d 
left join city_name cn
on d.location_id = cn.location_id
)
select dn.departmant_name, e1.first_name , e1.last_name , dn.city, dn.country_name 
from EMPLOYEES e1 left join department_name dn 
on e1.department_id = dn.department_id
where e1.manager_id



department_id int primary key,
departmant_name varchar (50),
manager_id int,
location_id int,
foreign key (location_id) references LOCATIONS (location_id)
);

-- 11
select D.departmant_name, avg(E.salary)
from EMPLOYEES E
inner join DEPARTMENTS D
on E.department_id = D.department_id
group by D.departmant_name


