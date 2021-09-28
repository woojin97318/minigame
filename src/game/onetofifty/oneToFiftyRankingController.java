package game.onetofifty;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import common.DBClass;
import common.page.Page;
import common.page.PageImpl;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class oneToFiftyRankingController implements Initializable {
	Parent root;
	DBClass db;
	Page page;
	@FXML
	private TableView<RankingDTO> rankTableView;
	@FXML
	private TableColumn<RankingDTO, String> rankColumn;
	@FXML
	private TableColumn<RankingDTO, String> nickColumn;
	@FXML
	private TableColumn<RankingDTO, String> clearTimeColumn;
	
	public void setRoot(Parent root) {
		this.root = root;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		page = new PageImpl();
		rankColumn.setCellValueFactory(new PropertyValueFactory<>("rank"));
		nickColumn.setCellValueFactory(new PropertyValueFactory<>("nickname"));
		clearTimeColumn.setCellValueFactory(new PropertyValueFactory<>("time"));
		rankTableView.setItems(getRank());
	}
	
	public ObservableList<RankingDTO> getRank(){
		ObservableList<RankingDTO> rank = FXCollections.observableArrayList();
		
		try {
			db = new DBClass();
			String sql = "select * from onetofiftyrank order by cleartime asc";
			PreparedStatement ps = db.conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			int i = 1;
	        while(rs.next()) {
	        	rank.add(new RankingDTO(Integer.toString(i), rs.getString("nickname"), rs.getString("cleartime")));
	        	i++;
	        }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rank;
	}
	
	public void reStartBtn(){
		page.setRoot(root);
		page.oneToFiftyPage();
	}
	public void homeBtn(){
		page.setRoot(root);
		page.menuPage();
	}
}
