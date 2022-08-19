package application;

import java.awt.event.MouseEvent;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class SampleController {

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtpsw;

    @FXML
    void btnClear(ActionEvent event) {
    	txtEmail.setText("");
    	txtpsw.setText(null);
    }

    @FXML
    void btnLogin(ActionEvent event) {

    	String Email = txtEmail.getText();
    	String Password = txtpsw.getText();

    	if(Email.equals("admin@gmail.com")&& Password.equals("admin")) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setContentText("Login success");
    		alert.setHeaderText("Message");
    		alert.show();
    	}
    	else {
    		Alert alert = new Alert(AlertType.ERROR);
    		alert.setContentText("Incorrect Email or Password!");
    		alert.setHeaderText("Message");
    		alert.show();
    	}
    }

    @FXML
    void iblRegister_click() throws IOException {
    	Main.changeScene("register.fxml");
    }
}

