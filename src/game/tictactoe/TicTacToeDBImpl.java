package game.tictactoe;

import common.AlertClass;
import common.DBClass;
import javafx.scene.Parent;

public class TicTacToeDBImpl implements TicTacToeDB{
	Parent root;
	DBClass db = new DBClass();
	AlertClass alert = new AlertClass();
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	public void nameChk() {
		
	}
}
