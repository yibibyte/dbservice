package ru.db.console.models.users;

public class ConfigUsers {
    private static final String USER_NAME = "postgres";
    private static final String PASSWORD = "postgres";
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String DRIVER = "org.postgresql.Driver";

    public static String getUserName() {
        return USER_NAME;
    }
    public static String getPassword() {
        return PASSWORD;
    }
    public static String getUrl() {
        return URL;
    }
    public static String getDriver() {
        return DRIVER;
    }

}
