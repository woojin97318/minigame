package game.tictactoe;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import common.AlertClass;
import common.DBClass;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TicTacToeDBImpl implements TicTacToeDB{
	Parent root;
	DBClass db = new DBClass();
	AlertClass alert = new AlertClass();
	Button playerChk;
	TicTacToeDTO dto;
	
	//TextField playerName2;
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	public void nameChk() {
		TextField playerName1 = (TextField)root.lookup("playerName1");
		/* playerName2 = (TextField)root.lookup("playerName2"); */
		playerChk = (Button)root.lookup("#playerChk");
		try {
			String sql = "insert into tictactoerank values(?, 0 ,0 ,0)";
			PreparedStatement ps = db.conn.prepareStatement(sql);
			ps.setString(1, playerName1.getText());		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		alert.alertInfo("입력하신 이름을 앞으로 사용하실 수 있습니다");
	}
	
	public TicTacToeDTO sameChk(TicTacToeDTO dto) {
		TextField playerName1 = (TextField)root.lookup("playerName1");
		
		try {
			String sql = "select * from tictactoerank 박승재";
			PreparedStatement ps = db.conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				//dto.setName((String)rs.next());
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return dto;
	}
}
