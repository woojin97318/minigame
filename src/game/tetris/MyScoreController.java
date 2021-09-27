package game.tetris;

import java.net.URL;
import java.util.ResourceBundle;

import common.AlertClass;
import common.page.Page;
import common.page.PageImpl;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;

public class MyScoreController implements Initializable{
	Parent root;
	int score;
	Label scoreLb;
	int success;
	Page page;
	
	public void setRoot(Parent root, int score) {
		this.root = root;
		this.score = score;
		
		scoreLb = (Label)root.lookup("#scoreLb");	// 나의 점수 페이지에
		scoreLb.setText(Integer.toString(score));						// 점수를 라벨에 setText
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		page = new PageImpl();
	}
	
	public void nickOkBtn() {
		RankingInsert ri = new RankingInsert();		// DB에
		ri.setRoot(root);							// 점수를
		success = ri.rankInsert();					// insert 하며 결과를 success에 대입
		
		if(success == 1) {
			AlertClass.alertInfo("랭킹에 등록되었습니다");
			Page page = new PageImpl();
			page.setRoot(root);
			page.rankingPageTetris();
		}
	}

}
