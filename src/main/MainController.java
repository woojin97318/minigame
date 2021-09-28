package main;

import java.net.URL;
import java.util.ResourceBundle;

import common.page.Page;
import common.page.PageImpl;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class MainController implements Initializable{
	Parent root;
	Page page;

	public void setRoot(Parent root) {
		this.root = root;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		page = new PageImpl();
	}

	public void gameStartBtn() {
		page.setRoot(root);
		page.menuPage();
	}

}
