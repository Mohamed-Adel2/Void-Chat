package iti.jets.app.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.rmi.NotBoundException;

public class HelloApplication extends Application {
    @Override


    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("views/user-settings.fxml"));
        stage.setTitle("Chatting App");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
