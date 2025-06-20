package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // FXML laden – Pfad relativ zum resources-Ordner
        Parent root = FXMLLoader.load(getClass().getResource("/app/view/TodoView.fxml"));
        stage.setTitle("Meine ToDo-Liste");
        stage.setScene(new Scene(root, 400, 600));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args); // startet die JavaFX-Anwendung
    }
}