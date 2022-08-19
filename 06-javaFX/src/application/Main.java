package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	static Stage originalStage = null;
	@Override
	public void start(Stage primaryStage) {
		try {
			//convert fxml to group obj that contains elements.
			Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
			
			originalStage =primaryStage;
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void changeScene(String input_file) throws IOException {
		Parent root = FXMLLoader.load(Main.class.getResource(input_file));
		Scene scene = new Scene(root);
		originalStage.hide();
		originalStage.setScene(scene);
		originalStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
