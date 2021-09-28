package game.tictactoe;

import java.net.URL;
import java.util.ResourceBundle;

import common.page.Page;
import common.page.PageImpl;
import game.tictactoe.rule.TictactoeGameRule;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;

public class tictactoePvpStart implements Initializable{
	Parent root;
	Page pg;
	TictactoeGameRule gRule;

	public void setRoot(Parent root) {
		this.root = root;
	}

	/*
	 * public void playerCommit() { System.out.println("닉네임 입력 완료.");
	 * gRule.setRoot(root); }
	 */
	public void startProc() {
		gRule.setRoot(root);
		gRule.gameStart();
	}


	public void abstentionProc() {

	}

	public void goMainProc() {
		pg.setRoot(root);
		pg.menuPage();
	}
	
	public void btnClicked(ActionEvent e) {
		System.out.println(e.getSource());
		System.out.println((Button)e.getSource());
		Button btn = (Button)e.getSource();
		gRule.setRoot(root);
		gRule.btnProc(btn);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		pg = new PageImpl();
		gRule= new TictactoeGameRule();
	}

}
