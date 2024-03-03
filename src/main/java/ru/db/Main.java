package ru.db;

import javax.swing.*;
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
        Scanner scanner = new Scanner(System.in);
        Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);


        while (true) {
            System.out.println("1. Показать все задачи");
            System.out.println("2. Выполнить задачу");
            System.out.println("3. Создать задачу");
            System.out.println("4. Выйти");
            int command = scanner.nextInt();

            if (command == 1) {
                // Утверждение на отправку в базу данных наш запрос
                Statement statement = connection.createStatement();
                String SELECT_TASK_SQL = "select * from task order by id desc";
                ResultSet resultSet = statement.executeQuery(SELECT_TASK_SQL);
                while (resultSet.next()) {
                    System.out.println(
                            resultSet.getInt("id") +
                            resultSet.getString("task") +
                            resultSet.getString("state"));
                }
            } else if (command == 2) {
                String UPDATE_TASK_SQL = "update task set state = 'Доделывается' where id = ?;";
                PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_TASK_SQL);
                System.out.println("Введите id task");
                int idTask = scanner.nextInt();
                preparedStatement.setInt(1, idTask);
                preparedStatement.executeUpdate();
            } else if (command == 3) {
                String INSERT_TASK_SQL = "insert into task(task, state) values (?, 'Сделано');";
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_TASK_SQL);
                System.out.println("Введите имя task\n");
                String nameTask = scanner.nextLine();
                preparedStatement.setString(1, nameTask);
                preparedStatement.executeUpdate();

            } else if (command == 4) {
                System.exit(0);
            } else {
                System.err.println("Введите число из списка");
            }
        }
    }
}