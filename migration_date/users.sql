
--- Create
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    age INTEGER,
    email VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL
);

--- Create Users

INSERT INTO users (name, age, email, password) VALUES ('User1', 25, 'user1@example.com', 'password1');
INSERT INTO users (name, age, email, password) VALUES ('User2', 30, 'user2@example.com', 'password2');
INSERT INTO users (name, age, email, password) VALUES ('User3', 28, 'user3@example.com', 'password3');
INSERT INTO users (name, age, email, password) VALUES ('User4', 22, 'user4@example.com', 'password4');
INSERT INTO users (name, age, email, password) VALUES ('User5', 35, 'user5@example.com', 'password5');
INSERT INTO users (name, age, email, password) VALUES ('User6', 27, 'user6@example.com', 'password6');
INSERT INTO users (name, age, email, password) VALUES ('User7', 29, 'user7@example.com', 'password7');
INSERT INTO users (name, age, email, password) VALUES ('User8', 26, 'user8@example.com', 'password8');
INSERT INTO users (name, age, email, password) VALUES ('User9', 31, 'user9@example.com', 'password9');
INSERT INTO users (name, age, email, password) VALUES ('User10', 33, 'user10@example.com', 'password10');

-- Read запрос
select * from users order by users asc;

--- UPDATE
update users set state = 'В процессе' where id = 1;


-- Delete
delete from users where id = 9;
delete from users where id = 10;
delete from users where id = 11;
delete from users where id = 12;
delete from users where id = 14;
delete from users where id = 15;
delete from users where id = 16;
delete from users where id = 17;



-------------------


select * from users order by id desc

update users set state = 'В процессе' where id = 1;


insert into author(name) values('Virginia Woolf');
insert into author(name) values('Harper Lee');
insert into author(name) values('F. Scott Fitzgerald');
insert into author(name) values('J.R.R. Tolkien');
insert into author(name) values('George Orwell');

insert into user(title, author_id, public_year) values
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

