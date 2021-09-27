package game.tetris;

import java.sql.PreparedStatement;

import common.AlertClass;
import common.DBClass;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RankingInsert {
	Parent root;
	DBClass db;
	TextField nickTf;
	Label scoreLb;
	
	public void setRoot(Parent root) {
		this.root = root;
		db = new DBClass();
		nickTf = (TextField)root.lookup("#nickTf");
		scoreLb = (Label)root.lookup("#scoreLb");
	}
	
	public int rankInsert() {
		String sql = "insert into tetrisrank values(?, ?)";
		int result = 0;
		try {
			PreparedStatement ps = db.conn.prepareStatement(sql);
			ps.setString(1, nickTf.getText());
			ps.setInt(2, Integer.parseInt(scoreLb.getText()));
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			AlertClass.alertErr("닉네임이 너무 깁니다. 다시 입력하세요.");
		}
		return result;
	}
}
