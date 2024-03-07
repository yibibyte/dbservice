
--- Create
create table tasks (
    id serial primary key,
    task varchar(30),
    state varchar(40),
    description varchar(100)
);

--- Create
insert into tasks (id, task, state, description) values (1, 'Установить PostgreSQL', 'Сделано', 'Установить все компоненты к Postgre');
insert into tasks (id, task, state, description) values (2, 'Настроить БД', 'Сделано', '');
insert into tasks (id, task, state, description) values (3, 'Проверить БД на подключение', 'Сделано', 'Есть ли подключение к БД');
insert into tasks (id, task, state, description) values (4, 'Обвновить БД', 'В процессе', 'Обновить ПО в базе данных');
insert into tasks (task, state, description) values ('Test task', 'Test state', 'Test description');

-- Read запрос
select * from tasks order by task desc;

--- UPDATE
update task set state = 'В процессе' where id = 1;


-- Delete
delete from tasks where id = 9;
delete from tasks where id = 10;
delete from tasks where id = 11;
delete from tasks where id = 12;
delete from tasks where id = 14;
delete from tasks where id = 15;
delete from tasks where id = 16;
delete from tasks where id = 17;



-------------------


select * from task order by id desc

update task set state = 'В процессе' where id = 1;


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

