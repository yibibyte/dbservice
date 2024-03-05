package ru.db;

import org.postgresql.util.PSQLException;

import java.sql.*;
import java.util.Scanner;

/**
 * Logic Connection to DB
 */
public class Main {
    private static final String USER_NAME = "postgres";
    private static final String PASSWORD = "postgres";
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";

    /*
    jdbc:postgresql:database
    jdbc:postgresql:/
    jdbc:postgresql://host/database
    jdbc:postgresql://host/
    jdbc:postgresql://host:port/database
    jdbc:postgresql://host:port/
    */

    public static void main(String[] args) throws Exception {
        try {

            Scanner scanner = new Scanner(System.in);
            Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);


            while (true) {
                System.out.println("1. Показать все задачи");
                System.out.println("2. Выполнить задачу");
                System.out.println("3. Создать задачу");
                System.out.println("4. Выйти");
                int command = scanner.nextInt();

                switch (command) {
                    case 1:
                        try {
                            // Утверждение на отправку в базу данных наш запрос
                            Statement statement = connection.createStatement();
                            String SELECT_TASK_SQL = "select * from tasks order by id asc";
                            ResultSet resultSet = statement.executeQuery(SELECT_TASK_SQL);
                            while (resultSet.next()) {
                                System.out.println(
                                        resultSet.getInt("id") +
                                                resultSet.getString("task") +
                                                resultSet.getString("state"));
                            }
                        } catch (PSQLException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            String UPDATE_TASK_SQL = "update tasks set state = 'В процессе' where id = ?;";
                            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_TASK_SQL);
                            System.out.println("Введите id задачи");
                            int idTask = scanner.nextInt();
                            preparedStatement.setInt(1, idTask);
                            preparedStatement.executeUpdate();
                        } catch (PSQLException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        try {
                            //String taskName = scanner.nextLine();
//                            String INSERT_TASK_SQL = "insert into tasks(task, state, description) values ('" + taskName + "', 'В процессе', '');";

                            System.out.println("Введите имя задачи\n");
                            String nameTask = scanner.nextLine();
                            String INSERT_TASK_SQL = "insert into tasks(task, state, description) values (?, 'В процессе', '');";
                            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_TASK_SQL);

                            preparedStatement.setString(1, nameTask);
                            preparedStatement.executeUpdate();
                        } catch (PSQLException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4:
                        System.exit(0);
                        scanner.close();
                    default:
                        System.err.println("Введите число из списка");
                }
                //delete from название_таблицы where id = значение;
/*
                    case 5:
                        try {
                            int taskName = scanner.nextInt();
                            String DELETE_TASK_SQL = "delete from tasks where id = " + taskName + ";";
                            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_TASK_SQL);
                            System.out.println("Введите id задачи \n");
                            String nameTask = scanner.nextLine();
                            preparedStatement.setString(1, nameTask);
                            preparedStatement.executeUpdate();
                        } catch (PSQLException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
* */
            }
        } catch (RuntimeException e) {
            throw new RuntimeException();
        }
    }
}