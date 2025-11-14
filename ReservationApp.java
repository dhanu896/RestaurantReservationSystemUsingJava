package restaurant.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import restaurant.db.DatabaseConnector;

public class ReservationApp extends Application {
    @Override
    public void start(Stage stage) {
        TextField nameField = new TextField();
        TextField phoneField = new TextField();
        Button reserveBtn = new Button("Reserve Table");

        reserveBtn.setOnAction(e -> {
            DatabaseConnector.saveReservation(nameField.getText(), phoneField.getText());
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Reservation Successful!");
            alert.show();
        });

        VBox root = new VBox(10, new Label("Name:"), nameField, new Label("Phone:"), phoneField, reserveBtn);
        stage.setScene(new Scene(root, 300, 200));
        stage.setTitle("Restaurant Reservation System");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
