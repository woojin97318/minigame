package common.page;

import game.onetofity.OneToFityController;
import game.tictactoe.TicTacToeController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.MainController;
import menu.MenuController;

public class PageImpl implements Page{
	Parent root;
	
	public void setRoot(Parent root) {
		this.root = root;
	}

	@Override
	public void mainPage() {
		try {
			FXMLLoader loader =
					new FXMLLoader(getClass().getResource("../../main/mainView.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);

			MainController ctl = loader.getController();
			ctl.setRoot(root);
			
			Stage stage = (Stage)this.root.getScene().getWindow();

			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void menuPage() {
		try {
			FXMLLoader loader =
					new FXMLLoader(getClass().getResource("../../menu/menuView.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);

			MenuController ctl = loader.getController();
			ctl.setRoot(root);
			
			Stage stage = (Stage)this.root.getScene().getWindow();

			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void rankingPage() {
		
	}

	@Override
	public void ticTacToePage() {
		try {
			FXMLLoader loader =
					new FXMLLoader(getClass().getResource("../../game/tictactoe/ticTacToeView.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);

			TicTacToeController ctl = loader.getController();
			ctl.setRoot(root);
			
			Stage stage = (Stage)this.root.getScene().getWindow();

			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void oneToFityPage() {
		try {
			FXMLLoader loader =
					new FXMLLoader(getClass().getResource("../../game/onetofity/oneToFityView.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);

			OneToFityController ctl = loader.getController();
			ctl.setRoot(root);
			
			Stage stage = (Stage)this.root.getScene().getWindow();

			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
