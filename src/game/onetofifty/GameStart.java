package game.onetofifty;

import javafx.event.ActionEvent;
import javafx.scene.Parent;

public interface GameStart {
	public void setRoot(Parent root);
	public void gameStart();
	public void onClick(ActionEvent event);
}
