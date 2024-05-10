package com.example.hh;

import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class validController {

    @FXML
    private Button logout;
    public void handleSubmition(ActionEvent actionEvent) throws IOException {

        try {
            // Load the FXML file for the second interface
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent secondInterfaceRoot = loader.load();
            Scene secondInterfaceScene = new Scene(secondInterfaceRoot);
            Stage currentStage = (Stage) logout.getScene().getWindow();
            currentStage.close();
            currentStage.setScene(secondInterfaceScene);
            currentStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
