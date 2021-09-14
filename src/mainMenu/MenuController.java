package mainMenu;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;

public class MenuController implements Initializable{
	Parent root;
	
	@FXML ImageView gameImageView;
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	public void gameStartProc() {
		//리스트에서 선택한 게임시작
	}
	public void rankChartProc() {
		//리스트에서 선택한 게임의 랭크
	}
	
	public void settingProc() {
		//게임전반적인 환경설정
	}
	
	public void exitProc() {
		//게임 종료
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

}
