package ru.db.db2;

import ru.db.console.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private Connection connection;

    public UserRepository() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydatabase", "postgres", "postgres");
    }

    public void insertUser(User user) throws SQLException {
        String sql = "INSERT INTO users (name, age) VALUES (?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, user.getName());
        statement.setInt(2, user.getAge());
        statement.executeUpdate();
    }

    public User getUserById(int id) throws SQLException {
        String sql = "SELECT * FROM users WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            return new User(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getInt("age")
            );
        } else {
            return null;
        }
    }

    public void updateUser(User user) throws SQLException {
        String sql = "UPDATE users SET name = ?, age = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, user.getName());
        statement.setInt(2, user.getAge());
        statement.setInt(3, user.getId());
        statement.executeUpdate();
    }

    public void deleteUser(int id) throws SQLException {
        String sql = "DELETE FROM users WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
    }

    public List<User> getAllUsers() throws SQLException {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            users.add(new User(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getInt("age")
            ));
        }
        return users;
    }

}
