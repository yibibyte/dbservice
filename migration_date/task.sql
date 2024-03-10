--- Операции CRUD

--- CREATE -- Создание Таблицы с задачами
create table tasks (
    id serial primary key,
    task varchar(30),
    state varchar(40),
    description varchar(100)
);

--- CREATE
insert into tasks (id, task, state, description) values (1, 'Установить PostgreSQL', 'Сделано', 'Установить все компоненты к Postgre');
insert into tasks (id, task, state, description) values (2, 'Настроить БД', 'Сделано', '');
insert into tasks (id, task, state, description) values (3, 'Проверить БД на подключение', 'Сделано', 'Есть ли подключение к БД');
insert into tasks (id, task, state, description) values (4, 'Обвновить БД', 'В процессе', 'Обновить ПО в базе данных');
insert into tasks (task, state, description) values ('Test task', 'Test state', 'Test description');

-- READ запрос
select * from tasks order by id asc ;


--- UPDATE
update task set state = 'В процессе' where id = 10;

--- DELETE
delete from tasks where id = 10;



