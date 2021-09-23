package common.page;

import game.onetofifty.MyClearTimeController;
import game.onetofifty.OneToFiftyController;
import game.onetofifty.RankingController;
import game.tictactoe.TicTacToeController;
import game.tictactoe.TictactoeStartController;
import game.tictactoe.tictactoePvpStart;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.MainController;
import menu.MenuController;

//MiniGame 내 페이지 이동 관련 클래스
public class PageImpl implements Page{
	Parent root;

	@Override
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
	public void oneToFiftyPage() {
		try {
			FXMLLoader loader =
					new FXMLLoader(getClass().getResource("../../game/onetofifty/oneToFiftyView.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);

			OneToFiftyController ctl = loader.getController();
			ctl.setRoot(root);

			Stage stage = (Stage)this.root.getScene().getWindow();

			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void rankingInsert(String clearTime) {
		try {
			FXMLLoader loader =
					new FXMLLoader(getClass().getResource("../../game/onetofifty/myClearTimeView.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);

			MyClearTimeController ctl = loader.getController();
			ctl.setRoot(root, clearTime);

			Stage stage = (Stage)this.root.getScene().getWindow();

			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void rankingPage1to50() {
		try {
			FXMLLoader loader =
					new FXMLLoader(getClass().getResource("../../game/onetofifty/rankingView.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);

			RankingController ctl = loader.getController();
			ctl.setRoot(root);

			Stage stage = (Stage)this.root.getScene().getWindow();

			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
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
	public void tictactoePvpPage() {
		try {
			FXMLLoader loader =
					new FXMLLoader(getClass().getResource("../../game/tictactoe/tictactoePvpStart.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);

			tictactoePvpStart ctl = loader.getController();
			ctl.setRoot(root);

			Stage stage = (Stage)this.root.getScene().getWindow();

			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void tictactoePvcPage() {
		try {
			FXMLLoader loader =
					new FXMLLoader(getClass().getResource("../../game/tictactoe/tictactoeStart.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);

			TictactoeStartController ctl = loader.getController();
			ctl.setRoot(root);

			Stage stage = (Stage)this.root.getScene().getWindow();

			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}