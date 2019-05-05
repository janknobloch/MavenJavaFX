

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainFX extends Application{

	
	@Override
	public void start(Stage stage) throws Exception {
		
		
		Parent root = FXMLLoader.load(getClass().getResource("fxml_example.fxml"));

		    System.out.println(getClass());
	        Scene scene = new Scene(root, 300, 275);
	    
	        stage.setTitle("FXML Welcome");
	        stage.setScene(scene);
	        stage.show();
	}

}
