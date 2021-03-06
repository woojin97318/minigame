package common.page;

import game.onetofifty.MyClearTimeController;
import game.onetofifty.OneToFiftyController;
import game.onetofifty.oneToFiftyRankingController;
import game.tetris.MyScoreController;
import game.tetris.TetrisController;
import game.tetris.TetrisRankingController;
import game.tictactoe.TicTacToeController;
import game.tictactoe.tictactoePvpStart;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.MainController;
import menu.MenuController;

//MiniGame 내 페이지 이동 관련 클래스
public class PageImpl implements Page {
	Parent root;

	@Override
	public void setRoot(Parent root) {
		this.root = root;
	}

	@Override
	public void mainPage() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../../main/mainView.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);

			MainController ctl = loader.getController();
			ctl.setRoot(root);

			Stage stage = (Stage) this.root.getScene().getWindow();

			stage.setTitle("미니게임");
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void menuPage() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../../menu/menuView.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);

			MenuController ctl = loader.getController();
			ctl.setRoot(root);

			Stage stage = (Stage) this.root.getScene().getWindow();

			stage.setTitle("메뉴");
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void oneToFiftyPage() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../../game/onetofifty/oneToFiftyView.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);

			OneToFiftyController ctl = loader.getController();
			ctl.setRoot(root);

			Stage stage = (Stage) this.root.getScene().getWindow();

			stage.setTitle("1to50");
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void rankingInsert(String clearTime) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../../game/onetofifty/myClearTimeView.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);

			MyClearTimeController ctl = loader.getController();
			ctl.setRoot(root, clearTime);

			Stage stage = (Stage) this.root.getScene().getWindow();

			stage.setTitle("1to50");
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void rankingPage1to50() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../../game/onetofifty/rankingView.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);

			oneToFiftyRankingController ctl = loader.getController();
			ctl.setRoot(root);

			Stage stage = (Stage) this.root.getScene().getWindow();

			stage.setTitle("1to50");
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void ticTacToePage() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../../game/tictactoe/ticTacToeView.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);

			TicTacToeController ctl = loader.getController();
			ctl.setRoot(root);

			Stage stage = (Stage) this.root.getScene().getWindow();

			stage.setTitle("틱택토");
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void tictactoePvpPage() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../../game/tictactoe/tictactoePvpStart.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);

			tictactoePvpStart ctl = loader.getController();
			ctl.setRoot(root);

			Stage stage = (Stage) this.root.getScene().getWindow();

			stage.setTitle("틱택토");
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public void tetrisPage() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../../game/tetris/tetrisView.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);

			TetrisController ctl = loader.getController();
			ctl.setRoot(root);

			Stage stage = (Stage) this.root.getScene().getWindow();

			stage.setTitle("테트리스");
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void tetrisRankingInsert(int score) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../../game/tetris/myScoreView.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);

			MyScoreController ctl = loader.getController();
			ctl.setRoot(root, score);

			Stage stage = (Stage) this.root.getScene().getWindow();

			stage.setTitle("테트리스");
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void rankingPageTetris() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../../game/tetris/rankingView.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);

			TetrisRankingController ctl = loader.getController();
			ctl.setRoot(root);

			Stage stage = (Stage) this.root.getScene().getWindow();

			stage.setTitle("테트리스");
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
