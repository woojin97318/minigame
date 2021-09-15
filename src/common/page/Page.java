package common.page;

import javafx.scene.Parent;

public interface Page {
	public void setRoot(Parent root);
	public void mainPage();
	public void menuPage();
	public void rankingPage();
	// 아래는 게임시작버튼
	public void ticTacToePage();
	public void oneToFiftyPage();
}
