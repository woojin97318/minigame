package game.tetris;

import java.net.URL;
import java.util.ResourceBundle;

import common.page.Page;
import common.page.PageImpl;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class TetrisController implements Initializable{
	Parent root;
	Page page;
	Tetris tetris;
	
	public void setRoot(Parent root) {
		this.root = root;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		page = new PageImpl();
		tetris = new Tetris();
	}
	
	public void gameStart() {
		tetris.setRoot(root);
		tetris.tetrisStart();
	}
	
	public void exit() {
		page.setRoot(root);
		page.menuPage();
		Tetris.task.cancel();
		Tetris.timer.cancel();
	}

}