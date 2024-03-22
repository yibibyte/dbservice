
--- Create
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    age INTEGER,
    email VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL
);

--- Create Users

INSERT INTO users (name, age, email, password) VALUES ('Александр', 25, 'user1@example.com', 'password1');
INSERT INTO users (name, age, email, password) VALUES ('Екатерина', 30, 'user2@example.com', 'password2');
INSERT INTO users (name, age, email, password) VALUES ('Ольга', 28, 'user3@example.com', 'password3');
INSERT INTO users (name, age, email, password) VALUES ('Иван', 22, 'user4@example.com', 'password4');
INSERT INTO users (name, age, email, password) VALUES ('Анна', 35, 'user5@example.com', 'password5');
INSERT INTO users (name, age, email, password) VALUES ('Дмитрий', 27, 'user6@example.com', 'password6');
INSERT INTO users (name, age, email, password) VALUES ('Наталья', 29, 'user7@example.com', 'password7');
INSERT INTO users (name, age, email, password) VALUES ('Сергей', 26, 'user8@example.com', 'password8');
INSERT INTO users (name, age, email, password) VALUES ('Мария', 31, 'user9@example.com', 'password9');
INSERT INTO users (name, age, email, password) VALUES ('Артем', 33, 'user10@example.com', 'password10');
INSERT INTO users (name, age, email, password) VALUES ('Елена', 11, 'user11@example.com', 'password11');

-- Read запрос
select * from users order by users asc;

--- UPDATE
update users set password = 'password' where id = 11;


-- Delete
delete from users where id = 1;
delete from users where id = 2;
delete from users where id = 3;
delete from users where id = 4;
delete from users where id = 5;
delete from users where id = 6;
delete from users where id = 7;
delete from users where id = 8;
delete from users where id = 9;
delete from users where id = 10;
delete from users where id = 11;



-------------------


select * from users order by id desc

update users set email = 'name' where id = 1;
update users set email = 'name' where id = 1;
update users set email = 'name' where id = 1;


insert into author(name) values('Virginia Woolf');
insert into author(age) values(55);
insert into author(name) values('F. Scott Fitzgerald');
insert into author(name) values('J.R.R. Tolkien');
insert into author(name) values('George Orwell');

insert into user(name, id, password) values
('Mrs. Dalloway',1,1925),
('To the Lighthouse',1,1927),
('To Kill a Mockingbird',2,1960),
('The Great Gatsby',3,1925),
('The Lord of the Rings',4,1955);

insert into book(title, author_id, public_year) values
('1984',(select id from author where name = 'George Orwell'),1949),
('Animal Farm',(select id from author where name = 'George Orwell'),1945);

select title from book where public_year = 1925;

select * from book where id > 3;

update author set name = concat(name, '_updated') where name = 'test author';

delete from author where name like '%_updated';

