package game.onetofifty;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class GameStartImpl implements GameStart {
	Parent root;
	Button[] btn = new Button[25];	// 25개의 버튼을 저장할 배열
	int[] num = new int[50];		// 1~50까지의 수가 들어가는 배열
	Button gameStartBtn;			// 게임 시작 버튼
	Label nextNumLb;				// 다음에 선택해야할 숫자 표시라벨
	Label timerLb;					// 타이머 라벨
	int step = 1;					// 게임 진행 시 선택해야할 숫자
	int i = 25;						// 1~25 숫자버튼 클릭 시 다음 26~50숫자를 가져오기 위한 변수

	@Override
	public void setRoot(Parent root) {
		this.root = root;
	}

	@Override
	public void gameStart() {	// 게임 시작 버튼 클릭 메소드
		GameTimer timer = new GameTimer();
		timer.setRoot(root);
		ThreadSharedData tsd = new ThreadSharedData();
		timer.tsd = tsd;
		timer.start(); //타이머 스레드 동작
		timerLb = (Label)root.lookup("#timerLb");

		System.out.println(tsd.getTime());

		gameStartBtn = (Button)root.lookup("#gameStartBtn");
		nextNumLb = (Label)root.lookup("#nextNumLb");
		if(gameStartBtn.getText().equals("다시 시작"))	// 게임을 재시작시 step를 1로 초기화
			step = 1;
		else	// 첫 게임 시작시 시작버튼 클릭시 "다시 시작으로 setText"
			gameStartBtn.setText("다시 시작");

		for (int i = 0; i < 50; i++)
			num[i] = i + 1;	// 1~50 숫자 num배열에 초기화

		shakeNumber();	// num 배열의 숫자를 섞음

		for (int i = 0; i < 25; i++) {        // 1 ~ 25 버튼에
			btn[i] = (Button)root.lookup("#btn" + Integer.toString(i+1));
			btn[i].setText(Integer.toString(num[i])); // num[0~24] 숫자를 입력
		}
		nextNumLb.setText(Integer.toString(step));	// 다음 눌러야할 숫자를 Label에 표시

		timerLb.setText(tsd.getTime());
		timer.timeSleep(1000);
	}
	public void shakeNumber() {	// 1 ~ 50 숫자를 뒤섞는 메소드
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
	public void onClick(ActionEvent event) {	// 게임 진행시 숫자버튼 클릭 메소드
		if(step == Integer.parseInt(((Button)event.getSource()).getText())) {
			if(step > 25) {
				((Button)event.getSource()).setText("");
			}else {
				((Button)event.getSource()).setText(Integer.toString(num[i++]));
			}
			step++;
			nextNumLb.setText(Integer.toString(step));
			if(step == 51) {	// 게임종료 및 타이머 종료

			}
		}
	}
}
