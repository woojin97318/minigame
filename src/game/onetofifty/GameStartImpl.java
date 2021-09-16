package game.onetofifty;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Button;

public class GameStartImpl implements GameStart {
	Parent root;
	Button[] btn = new Button[25];
	int[] num = new int[50];
	int step = 1;
	int i = 25;

	@Override
	public void setRoot(Parent root) {
		this.root = root;
	}

	@Override
	public void gameStart() {
		for (int i = 0; i < 50; i++)
			num[i] = i + 1;	// 1~50 숫자 num배열에 초기화
		shakeNumber();	// num 배열의 숫자를 섞음

		for (int i = 0; i < 25; i++) {        // 1 ~ 25 버튼에
			btn[i] = (Button)root.lookup("#btn" + Integer.toString(i+1));
			btn[i].setText(Integer.toString(num[i])); // num[0~24] 숫자를 입력
		}
	}
	public void shakeNumber() {		// 1 ~ 50 숫자를 뒤섞는 메소드
		Random r = new Random();
		int x = 0, y = 0, t = 0;
		for (int i = 0; i < 100; i++) {
			x = r.nextInt(25); // 두개의 버튼을 선택해서
			y = r.nextInt(25);
			t = num[x];         // 두 버튼의 값을
			num[x] = num[y];    // 서로 변경한다.
			num[y] = t;
		}
		for (int i = 0; i < 100; i++) {
			x = r.nextInt(25)+25; // 두개의 버튼을 선택해서
			y = r.nextInt(25)+25;
			t = num[x];         // 두 버튼의 값을
			num[x] = num[y];    // 서로 변경한다.
			num[y] = t;
		}
	}

	@Override
	public void onClick(ActionEvent event) {	// 버튼 클릭시 이벤트 처리
		if(step == Integer.parseInt(((Button)event.getSource()).getText())) {
			if(step > 25) {
				((Button)event.getSource()).setText("");
			}else {
				((Button)event.getSource()).setText(Integer.toString(num[i++]));
			}
			step++;
			if(step == 51) {	// 게임종료 및 타이머 종료
				
			}
		}
	}
}
