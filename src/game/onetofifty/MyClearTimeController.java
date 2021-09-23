package game.onetofifty;

import java.net.URL;
import java.util.ResourceBundle;

import common.AlertClass;
import common.Exit;
import common.page.Page;
import common.page.PageImpl;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;

public class MyClearTimeController implements Initializable {
	Parent root;
	String clearTime;
	Label timerLb;
	int success;
	Page page;
	Exit exit;
		
	public void setRoot(Parent root, String clearTime) {
		this.root = root;
		this.clearTime = clearTime;
		
		timerLb = (Label)root.lookup("#timerLb");	// 클리어 시간 페이지에
		timerLb.setText(clearTime);					// 클리어 시간을 라벨에 setText
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		page = new PageImpl();
		exit = new Exit();
	}
	
	public void nickOkBtn() {
		RankInsert ri = new RankInsert();	//DB에
		ri.setRoot(root);					//클리어시간
		success = ri.rankInsert();			//insert 하며 결과를 success에 대입
		
		if(success == 1) {
			AlertClass.alertInfo("랭킹에 등록되었습니다");
			Page page = new PageImpl();
			page.setRoot(root);
			page.rankingPage1to50();
		}
	}
	
}
