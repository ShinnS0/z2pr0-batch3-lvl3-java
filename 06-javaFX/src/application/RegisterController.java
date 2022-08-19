package application;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

public class RegisterController implements Initializable{

		@FXML
	    private ToggleGroup Toggle;

	    @FXML
	    private ChoiceBox<String> cbo_city;

	    @FXML
	    private CheckBox chk_css;

	    @FXML
	    private CheckBox chk_html;

	    @FXML
	    private CheckBox chk_java;

	    @FXML
	    private CheckBox chk_php;

	    @FXML
	    private TextField txt_Email;

	    @FXML
	    private DatePicker txt_birthday;

	    @FXML
	    private TextArea txt_other;

	    @FXML
	    private TextField txt_psw;

	    @FXML
	    void btn_register_click(ActionEvent event) {
	    	
	    	String email = txt_Email.getText();
	    	String psw = txt_psw.getText();
	    	String city = cbo_city.getSelectionModel().getSelectedItem();
	    	LocalDate dob = txt_birthday.getValue();
	    	String other_Info = txt_other.getText();
	    	RadioButton selectRadio =  (RadioButton) Toggle.getSelectedToggle();
	    	String gender = selectRadio.getText();
	    	String skillset = "";
	    	
	    	if(chk_java.isSelected()) {
	    		skillset += chk_java.getText()+ ",";
	    	}
	    	if(chk_css.isSelected()) {
	    		skillset += chk_css.getText()+ ",";
	    	}
	    	if(chk_html.isSelected()) {
	    		skillset += chk_html.getText()+ ",";
	    	}
	    	if(chk_php.isSelected()) {
	    		skillset += chk_php.getText()+ ",";
	    	}
	    	skillset = skillset.substring(0,skillset.lastIndexOf(","));
	    	
	    	System.out.println("---- Profile Data ----");
	    	System.out.println("Email: " + email);
	    	System.out.println("Psw: " + psw);
	    	System.out.println("City: " + city);
	    	System.out.println("Birthday: " + dob);
	    	System.out.println("Gender: " + gender);
	    	System.out.println("Other Info; " + other_Info);
	    	System.out.println("Skillset: " + skillset);
	    }

	    @FXML
	    void lblLogin_click(MouseEvent event) throws IOException {
	    	Main.changeScene("Sample.fxml");
	    }

	    @FXML
	    void txt_reset_click(ActionEvent event) {

	    }

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			
			List<String> cities = List.of("Yangon", "Mandalay", "Pyin Oo Lwin");
			
			cbo_city.setItems(FXCollections.observableArrayList(cities));
			
		}
}
