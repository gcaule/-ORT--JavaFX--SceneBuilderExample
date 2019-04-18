package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MyFirstSceneBuilder extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//On charge le fichier FXML pour l'utiliser comme scène
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("mainGUI.fxml"));
		AnchorPane root = (AnchorPane) loader.load();
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
        
    }
	
	public static void main(String args[]) {
		launch(args);
	}


}
