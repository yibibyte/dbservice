
--- Создание Таблицы
create table tasks (
    id serial primary key,
    task varchar(30),
    state varchar(40),
    description varchar(100)
);

insert into tasks (id, task, state, description) values (1, 'Установить PostgreSQL', 'Сделано', 'Установить все компоненты к Postgre');
insert into tasks (id, task, state, description) values (2, 'Настроить БД', 'Сделано', '');
insert into tasks (id, task, state, description) values (3, 'Проверить БД на подключение', 'Сделано', 'Есть ли подключение к БД');
insert into tasks (id, task, state, description) values (4, 'Обвновить БД', 'В процессе', 'Обновить ПО в базе данных');
insert into tasks (task, state, description) values ('Test task', 'Test state', 'Test description');

select * from tasks order by task desc;

delete from tasks where id = 100;



