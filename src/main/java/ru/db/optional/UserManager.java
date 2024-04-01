package ru.db.optional;
/**
 * Параметры методов
 */

import java.util.Optional;
public class UserManager {
    public void processUser(Optional<String> userName) {
        // Если имя пользователя присутствует, выполняем действие
        userName.ifPresent(name -> System.out.println("Processing user: " + name));
    }
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        // Пример с передачей Optional в качестве параметра метода
        Optional<String> user1 = Optional.of("John");
        userManager.processUser(user1);

        // Пример с передачей пустого Optional
        Optional<String> user2 = Optional.empty();
        userManager.processUser(user2);
    }
}
