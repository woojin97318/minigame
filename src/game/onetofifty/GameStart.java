package game.onetofifty;

import javafx.event.ActionEvent;
import javafx.scene.Parent;

public interface GameStart {
	public void setRoot(Parent root);
	public void gameStart();				//게임 시작 버튼 클릭 메소드
	public void shakeNumber();				//숫자(1~25, 26~50)를 섞는 메소드
	public void onClick(ActionEvent event);	//게임 진행 중 숫자버튼 클릭 메소드
	public void timerThread();				//타이머 기능 스레드
}
