package ru.db.javafx;

import javafx.scene.control.Alert;

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

    public void update(String idTask, String task, String state, String description) {
        try {
            // state = ?, task = ?, description = ?
            PreparedStatement statement = connection.prepareStatement("UPDATE tasks SET state = ?, task = ?, description = ? WHERE id = ?");

            statement.setString(1, state);
            statement.setString(2, task);
            statement.setString(3, description);
            if (idTask.isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.WARNING, "Не корректный id");
                alert.setTitle("Ошибка ID");
                alert.setContentText("Введите id для обновления полей");
                alert.showAndWait();
            } else {
            statement.setInt(4, Integer.parseInt(idTask));
            statement.executeUpdate();
            }
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

