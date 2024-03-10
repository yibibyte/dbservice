package ru.db.javafx;

import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class View extends Application {

    private AppController controller;
    private TableView<Model> tableView;
    private TextField taskTextField;
    private TextField stateTextField;
    private TextField descriptionTextField;
    private TextField idTextField;
    private TextArea rowTextArea;
    private Button selectButton;
    private Button addButton;
    private Button updateButton;
    private Button deleteButton;

    public View() {
        controller = new AppController();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("CRUD Postgres");

        // TableView
        tableView = new TableView<>();
        tableView.setPrefWidth(600);
        tableView.setPrefHeight(500);

        TableColumn<Model, Integer> idColumn = new TableColumn<>("ID");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Model, String> taskColumn = new TableColumn<>("Task");
        taskColumn.setCellValueFactory(new PropertyValueFactory<>("task"));

        TableColumn<Model, Integer> stateColumn = new TableColumn<>("State");
        stateColumn.setCellValueFactory(new PropertyValueFactory<>("state"));

        TableColumn<Model, Integer> descriptionColumn = new TableColumn<>("Description");
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));

        tableView.getColumns().addAll(idColumn, taskColumn, stateColumn, descriptionColumn);

        // TextFields
        taskTextField = new TextField();
        stateTextField = new TextField();
        descriptionTextField = new TextField();
        idTextField = new TextField();

        // Buttons
        addButton = new Button("Add");
        addButton.setOnAction(e -> add());

        updateButton = new Button("Update");
        updateButton.setOnAction(e -> update());

        deleteButton = new Button("Delete");
        deleteButton.setOnAction(actionEvent -> {
            if (controller.getID(Integer.parseInt(idTextField.getText())) != 0 ) {
                delete();
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "Вы ввели не правильный id");
                alert.setTitle("Ошибка id");
                alert.setHeaderText("Внимание");
                alert.setContentText("Введите id из списка");
                alert.showAndWait();
            }
        });

        // GridPane
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        gridPane.add(tableView, 0, 0, 3, 1);
        gridPane.add(new Label("Task:"), 0, 1);
        gridPane.add(taskTextField, 1, 1);
        gridPane.add(new Label("State:"), 0, 2);
        gridPane.add(stateTextField, 1, 2);
        gridPane.add(new Label("Description:"), 0, 3);
        gridPane.add(descriptionTextField, 1, 3);
        gridPane.add(addButton, 2, 2);
        gridPane.add(updateButton, 0, 4);
        gridPane.add(idTextField, 0, 5);
        gridPane.add(deleteButton, 1, 5);

        // Scene
        Scene scene = new Scene(gridPane);

        // Stage
        stage.setScene(scene);
        stage.show();

        // Load data
        loadData();
    }

    private void loadData() {
        List<Model> models = controller.getAll();
        ObservableList<Model> data = FXCollections.observableArrayList(models);
        tableView.setItems(data);
    }

    private void add() {
        String task = taskTextField.getText();
        String state = stateTextField.getText();
        String description = descriptionTextField.getText();
        controller.add(task, state, description);
        loadData();
    }

    private void update() {
        Model model = tableView.getSelectionModel().getSelectedItem();
        String taskId = idTextField.getText();
        String task = taskTextField.getText();
        String state = stateTextField.getText();
        String description = descriptionTextField.getText();
        controller.update(taskId, task, state, description);
        loadData();
    }

    private void delete() {
        Model model = tableView.getSelectionModel().getSelectedItem();
        controller.delete(Integer.parseInt(idTextField.getText()));
        loadData();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
