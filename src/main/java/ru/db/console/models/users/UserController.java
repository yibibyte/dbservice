package ru.db.console.models.users;

import java.sql.SQLException;

public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(String name, int age) throws SQLException {
        User user = new User(0, name, age);
        userRepository.insertUser(user);
    }

    public User getUserById(int id) throws SQLException {
        return userRepository.getUserById(id);
    }

    public void updateUser(int id, String name, int age) throws SQLException {
        User user = new User(id, name, age);
        userRepository.updateUser(user);
    }

    public void deleteUser(int id) throws SQLException {
        userRepository.deleteUser(id);
    }
}
