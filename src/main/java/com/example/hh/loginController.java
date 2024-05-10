package com.example.hh;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class loginController implements Initializable {
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private Label message;
    @FXML
    private Button submit;

    @FXML
    public void handleSubmition(ActionEvent actionEvent) throws IOException {

        if ("admin".equals(username.getText()) && "admin".equals(password.getText())) {
            message.setText("Login successful !!");
            message.setTextFill(Color.GREEN);

            try {
                // Load the FXML file for the second interface
                FXMLLoader loader = new FXMLLoader(getClass().getResource("valid-view.fxml"));
                Parent secondInterfaceRoot = loader.load();
                Scene secondInterfaceScene = new Scene(secondInterfaceRoot);
                Stage currentStage = (Stage) submit.getScene().getWindow();
                currentStage.close();
                currentStage.setScene(secondInterfaceScene);
                currentStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            message.setText("Login unsuccessful !!");
            message.setTextFill(Color.RED);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        message.setText("");
        username.setText("");
        password.setText("");
    }
}
