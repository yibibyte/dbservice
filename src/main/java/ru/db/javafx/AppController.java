package ru.db.javafx;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AppController {

    private Connection connection;

    public AppController() {
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        } catch (SQLException e) {
            System.err.println("Ошибка SQL: " + e.getMessage());
        }
    }

    public void add(String task, String state, String description) {
        try {
            String sql = "INSERT INTO tasks(task, state, description) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, task);
            preparedStatement.setString(2, state);
            preparedStatement.setString(3, description);
            preparedStatement.executeUpdate();
            int rowsInserted = preparedStatement.executeUpdate();
            // ADDING ALERT !!!!!!!!!!!!!!!!!!!
            if (rowsInserted > 0) {
                System.out.println("Новая задача успешно добавлена.");
            } else {
                System.out.println("Ошибка при добавлении новой задачи.");
            }
        } catch (SQLException e) {
            System.err.println("Ошибка SQL: " + e.getMessage());
        }
    }

    public List<Model> getAll() {
        List<Model> models = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from tasks order by id asc");
            while (resultSet.next()) {
                models.add(new Model(resultSet.getInt("id"), resultSet.getString("task"), resultSet.getString("state"), resultSet.getString("description")));
            }
        } catch (SQLException e) {
            System.err.println("Ошибка SQL: " + e.getMessage());
        }
        return models;
    }

    public void update(int id, String task, String state, String description) {
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE tasks SET state = ? WHERE id = ?");
            statement.setString(1, task);
            statement.setString(2, state);
            statement.setString(3, description);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Ошибка SQL: " + e.getMessage());
        }
    }

    public void delete(int id) {
        try {
            PreparedStatement statement = connection.prepareStatement("delete from tasks where id = ?;");
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Ошибка SQL: " + e.getMessage());
        }
    }

    public int getID(int id) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from tasks order by id asc");
            while (resultSet.next()) {
                if (resultSet.getInt("id") == id)
                    return id;
            }
        } catch (SQLException e) {
            System.err.println("Ошибка SQL: " + e.getMessage());
        }
        return 0;
    }
}

