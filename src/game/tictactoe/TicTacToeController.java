package game.tictactoe;

import java.net.URL;
import java.util.ResourceBundle;

import common.page.Page;
import common.page.PageImpl;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class TicTacToeController implements Initializable{
	Parent root;
	Page pg;
	public void setRoot(Parent root) {
		this.root = root;
	}

	public void pvpProc() {
		pg.setRoot(root);
		pg.tictactoePvpPage();
	}

	public void pvcProc() {
		pg.setRoot(root);
		pg.tictactoePvcPage();
	}

	public void goMainProc() {
		pg.setRoot(root);
		pg.menuPage();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		pg = new PageImpl();

	}

}
