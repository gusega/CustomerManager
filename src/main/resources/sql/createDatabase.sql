create database customer_management;
create user customer_management_app password 'test123';

grant all privileges on database customer_management to customer_management_app;

--revoke all privileges on database customer_management from customer_management_app;
--drop user customer_management_app;

--\c postgresql://customer_management_app:test123@localhost/customer_management

-- create only after connecting to database

create table address (
    id integer primary key,
    street varchar(40) not null,
    house_number INTEGER not null,
    city varchar(40) not null,
    zip varchar(6) not null,
    state varchar(20),
    country varchar(20)
);

create table company (
    id integer primary key,
    name varchar(40) NOT NULL ,
    vat varchar(20) NOT NULL ,
    main_address_id integer NOT NULL REFERENCES address,
    billing_address_id integer NOT NULL REFERENCES address
);

drop table customer;

create table customer (
    id integer primary key,
    first_name varchar(40),
    last_name varchar(40),
    age integer not null,
    email_address varchar(40) not null,
    private_address_id integer not null REFERENCES address,
    company_id integer not null REFERENCES company on DELETE CASCADE
);
