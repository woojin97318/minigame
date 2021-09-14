package mainMenu;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMenuView {

	public void mainMenuView() {
		try {
			Stage primaryStage = new Stage();
			System.out.println("새창 띄움");

			FXMLLoader loader =
					new FXMLLoader(getClass().getResource("../main/signupView.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);

			MenuController ctl = loader.getController();
			ctl.setRoot(root);

			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
