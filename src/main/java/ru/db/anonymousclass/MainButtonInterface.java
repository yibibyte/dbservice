package ru.db.anonymousclass;

public class MainButtonInterface {
    public static void main(String[] args) {
        ClickButton button = new ClickButton(new EventHandler() {
            @Override
            public void toExecute() {
                System.out.println("Кликать на кнопку с помощью интерфейса");
            }
        });
        button.clickOnButton();
        //button.clickOnButtonAndCloseFile();
        button.open();
    }
}

class ClickButton {
    EventHandler eventHandler;
    ClickButton(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    public void clickOnButton() {
        eventHandler.toExecute();
    }
    public void open() {
        System.out.println(" Open File");
    }
}
