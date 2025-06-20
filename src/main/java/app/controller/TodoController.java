package app.controller;

import app.model.Task;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class TodoController {

    // FXML-Elemente aus der View
    @FXML
    private TextField taskInput;

    @FXML
    private ListView<Task> taskList;

    // Aufgabenliste
    private ObservableList<Task> tasks = FXCollections.observableArrayList();

    // Wird automatisch aufgerufen beim Laden der FXML
    @FXML
    public void initialize() {
        taskList.setItems(tasks);
    }

    // Aufgabe hinzufügen
    @FXML
    public void addTask() {
        String text = taskInput.getText();
        if (text != null && !text.isBlank()) {
            tasks.add(new Task(text));
            taskInput.clear();
        }
    }

    // Aufgabe löschen
    @FXML
    public void deleteTask() {
        Task selected = taskList.getSelectionModel().getSelectedItem();
        if (selected != null) {
            tasks.remove(selected);
        }
    }

    // Aufgabe abhaken / Status umschalten
    @FXML
    public void toggleTask() {
        Task selected = taskList.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.toggleDone();
            taskList.refresh(); // Aktualisiert die Anzeige
        }
    }

    // Liste neu laden (aktualisieren)
    @FXML
    public void refreshList() {
        taskList.refresh();
    }
}