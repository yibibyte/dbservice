package ru.db.stream.optional;

import java.util.Optional;

/**
 * Возвращаемые значения методов
 */
public class UserService {
    public Optional<String> findUserNameById(String userId) {
        // Предположим, что здесь происходит поиск пользователя по идентификатору
        // и метод возвращает имя пользователя или null, если пользователь не найден.
        // Здесь Optional используется для избежания возвращения null.
        String userName = null; // ...;
        //Optional.ofNullable(null);
        return Optional.ofNullable(userName);
    }
    public static void main(String[] args) {
        UserService userService = new UserService();

        String userId = "123";
        Optional<String> userNameOptional = userService.findUserNameById(userId);

        // Если имя пользователя присутствует, выполняем действие
        userNameOptional.ifPresent(name -> System.out.println("User name: " + name));
    }
}
