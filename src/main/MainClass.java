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
		primaryStage.setOnCloseRequest(event -> {System.exit(0);}); //창 닫으면 모두 종료
		primaryStage.setResizable(false); //창크기 고정

		primaryStage.getIcons().add(new Image("file:source/images/game_icon.png")); //게임 아이콘 이미지
		primaryStage.setTitle("미니게임");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
