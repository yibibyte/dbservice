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
        try (Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD)) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println(" 1. Показать все задачи ");
                System.out.println(" 2. Обновить задачу ");
                System.out.println(" 3. Создать задачу ");
                System.out.println(" 4. Удалить задачу ");
                System.out.println(" 5. Выйти ");
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
                                        resultSet.getInt("id") + " " +
                                                resultSet.getString("task") + " " +
                                                resultSet.getString("state"));
                            }
                            System.out.println();
                        } catch (PSQLException e) {
                            System.err.println("Ошибка SQL: " + e.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            System.out.print("Введите ID задачи: ");
                            int taskId = scanner.nextInt();

                            System.out.print("Введите новый статус задачи: ");
                            String newStatus = scanner.next();

                            String sql = "UPDATE tasks SET state = ? WHERE id = ?";
                            PreparedStatement preparedStatement = connection.prepareStatement(sql);
                            preparedStatement.setString(1, newStatus);
                            preparedStatement.setInt(2, taskId);

                            int rowsUpdated = preparedStatement.executeUpdate();
                            if (rowsUpdated > 0) {
                                System.out.println("Запись успешно обновлена.");
                            } else {
                                System.out.println("Ошибка при обновлении записи или запись с указанным ID не найдена.");
                            }
                        } catch (PSQLException e) {
                            System.err.println("Ошибка SQL: " + e.getMessage());
                        }
                        break;
                    case 3:
                        try {
                            System.out.print("Введите название задачи (task): ");
                            String taskName = scanner.nextLine();

                            System.out.print("Введите статус задачи (state): ");
                            String taskStatus = scanner.nextLine();

                            System.out.print("Введите описание задачи (description): ");
                            String taskDescription = scanner.nextLine();

                            String sql = "INSERT INTO tasks(task, state, description) VALUES (?, ?, ?)";
                            PreparedStatement preparedStatement = connection.prepareStatement(sql);
                            preparedStatement.setString(1, taskName);
                            preparedStatement.setString(2, taskStatus);
                            preparedStatement.setString(3, taskDescription);

                            int rowsInserted = preparedStatement.executeUpdate();
                            if (rowsInserted > 0) {
                                System.out.println("Новая задача успешно добавлена.");
                            } else {
                                System.out.println("Ошибка при добавлении новой задачи.");
                            }
                        } catch (PSQLException e) {
                            System.err.println("Ошибка SQL: " + e.getMessage());
                        }
                        break;

                    case 4:
                        try {
                            System.out.print("Введите ID задачи для удаления: ");
                            int taskId = scanner.nextInt();
                            String DELETE_TASK_SQL = "delete from tasks where id = ?;";
                            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_TASK_SQL);
                            preparedStatement.setInt(1, taskId);

                            int rowsDeleted = preparedStatement.executeUpdate();
                            if (rowsDeleted > 0) {
                                System.out.println("Запись успешно удалена.");
                            } else {
                                System.out.println("Запись с указанным ID не найдена.");
                            }
                        } catch (PSQLException e) {
                            System.err.println("Ошибка SQL: " + e.getMessage());
                        }
                        break;
                    case 5:
                        System.exit(0);
                        scanner.close();
                    default:
                        System.err.println("Введите число из списка");
                }
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}