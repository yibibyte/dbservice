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
UPDATE tasks SET state = "state_state" SET task = "task_task" SET description = "description_description" WHERE id = 42

--- DELETE
delete from tasks where id = 10;


-- Не корректное отображение руссого яызка, нужно поменять в файл postgres.conf кодировку
lc_messages = 'Russian_Russia.ru-x-icu'			# locale for system error message
					# strings
lc_monetary = 'Russian_Russia.ru-x-icu'			# locale for monetary formatting
lc_numeric = 'Russian_Russia.ru-x-icu'			# locale for number formatting
lc_time = 'Russian_Russia.ru-x-icu'				# locale for time formatting

# default configuration for text search
default_text_search_config = 'pg_catalog.russian'
