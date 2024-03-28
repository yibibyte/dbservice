package ru.db.anonymousclass;

public class MainButtonClass {
    public static void main(String[] args) {
        ButtonClick button = new ButtonOpen() {
            public void clickOnButton() {
                System.out.println("Открыть файл с помощью класса ButtonClick");
            }

            public void clickOnButtonAndCloseFile() {
                System.out.println("Кликнуть на кнопку и Закрыть файл");
            }
        };
        button.clickOnButton();
        //button.clickOnButtonAndCloseFile();
    }
}

class ButtonClick {
    public void clickOnButton() {
        System.out.println("Кликать на кнопку");
    }
    public void clickOnButtonAndCloseFile() {
        System.out.println("Кликнуть на кнопку и Закрыть файл");
    }
}

class ButtonOpen extends ButtonClick {
    public void openWindow() {
        System.out.println("Открытие окна");
    }
}


