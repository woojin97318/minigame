package game.onetofifty;

import java.net.URL;
import java.util.ResourceBundle;

import common.page.Page;
import common.page.PageImpl;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class OneToFiftyController implements Initializable{
	Parent root;
	GameStart gs;
	Page page;
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		page = new PageImpl();
		gs = new GameStartImpl();
	}
	
	public void gameStart() {
		gs.setRoot(root);
		gs.gameStart();
	}
	public void exit() {
		page.setRoot(root);
		page.menuPage();
	}
	public void onClick(ActionEvent event) {
		gs.onClick(event);
	}

}
