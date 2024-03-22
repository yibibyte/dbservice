package ru.db.enums;

enum Color {
    RED("#FF0000"),
    BLUE("#0000FF"),
    GREEN("#00FF00"),
    YELLOW("#FFFF00"),
    BLACK("#000000"),
    WHITE("#FFFFFF"),
    ORANGE("#FFA500"),
    INDIGO("#4B0082"),
    VIOLET("#EE82EE");
    private String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}

public class MainEnumColor {
    public static void main(String[] args) {
        System.out.println(Color.RED.getCode()); // #FF0000
        System.out.println(Color.GREEN.getCode()); // #00FF00
        System.out.println(Color.WHITE.getCode()); // #FFFFFF
        System.out.println(Color.VIOLET.getCode()); // #EE82EE
    }
}
