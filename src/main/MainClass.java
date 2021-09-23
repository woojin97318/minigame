package main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainClass extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		FXMLLoader loader =
				new FXMLLoader(getClass().getResource("mainView.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);

		MainController ctl = loader.getController();
		ctl.setRoot(root);

//		primaryStage.getIcons().add(new Image("file:resources/icon/icon_youtube_32x32.png"));
		primaryStage.setTitle("Mini Game");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
