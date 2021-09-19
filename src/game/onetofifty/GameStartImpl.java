package game.onetofifty;

import java.util.Random;

import common.page.Page;
import common.page.PageImpl;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class GameStartImpl implements GameStart {
	Parent root;
	Button[] btn = new Button[25];	// 25개의 버튼을 저장할 배열
	int[] num = new int[50];		// 1~50까지의 수가 들어가는 배열
	Button gameStartBtn;			// 게임 시작 버튼
	Label nextNumLb;				// 다음에 선택해야할 숫자 표시 라벨
	Label timerLb;					// 타이머 라벨
	int step = 0;					// 게임 진행 시 선택해야할 숫자
	int i = 25;						// 1~25 숫자버튼 클릭 시 다음 숫자인 26~50을 가져오기 위한 변수
	String clearTime;				// 클리어 시간을 담을 변수
	Thread thread;					// 타이머 기능을 담을 변수
	Page page = new PageImpl();

	@Override
	public void setRoot(Parent root) {
		this.root = root;
	}

	@Override
	public void gameStart() {	//게임 시작 버튼 클릭 메소드
		gameStartBtn = (Button)root.lookup("#gameStartBtn");//게임 시작 버튼
		nextNumLb = (Label)root.lookup("#nextNumLb");		//다음 숫자 표시 라벨
		timerLb = (Label)root.lookup("#timerLb");			//타이머 라벨

		for (int i = 0; i < 50; i++)	//1~50 숫자를
			num[i] = i + 1;				//num[] 배열에 대입

		shakeNumber();	// num[] 배열의 숫자(1~25, 26~50)를 섞는 메소드

		for (int i = 0; i < 25; i++) {	// btn1 ~ btn25 버튼
			btn[i] = (Button)root.lookup("#btn" + Integer.toString(i+1));	//초기화
			btn[i].setText(Integer.toString(num[i]));	//num[0~24] 숫자를 버튼에 setText()
		}

		if (step > 0 && step < 51) {
										//첫 게임 시작시 step는 0의 값으로 진입하여 해당이 안된다.
			thread.interrupt();			//하지만 게임시작 후 step는 1로 초기화 되어 게임 도중 재시작을 했을 때
										//타이머의 중복실행을 막기 위해 스레드를 인터럽트 시킨 후 다시 재 시작한다.
			timerLb.setText("00:00:00");//게임 재시작시 타이머 라벨 초기화
		}
		step = 1;	//첫 게임 시작시 step는 1로 초기화

		gameStartBtn.setText("다시 시작");	//첫 게임 시작시 "게임 시작"버튼을 "다시 시작"으로 setText()

		nextNumLb.setText(Integer.toString(step));	// 다음 눌러야할 숫자를 Label에 표시

		timerThread();	//게임을 시작할 때 마다 스레드 객체를 새로 생성하여
		thread.start();	//게임 시작
	}

	@Override
	public void shakeNumber() {	// 숫자(1~25, 26~50)를 섞는 메소드
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
	public void onClick(ActionEvent event) {	// 게임 진행 중 숫자버튼 클릭 메소드
		if(step == Integer.parseInt(((Button)event.getSource()).getText())) {
			if(step > 25) {
				((Button)event.getSource()).setText("");
			}else {
				((Button)event.getSource()).setText(Integer.toString(num[i++]));
			}
			step++;
			nextNumLb.setText(Integer.toString(step));

			if(step == 51) {	// 게임종료 및 타이머 종료
				nextNumLb.setText("게임 클리어");	//다음 숫자 텍스트 "게임 클리어"로 setText
				thread.interrupt();				//타이머 작동 스탑
				clearTime = timerLb.getText(); 	//클리어 시간 저장

				page.setRoot(root);				//게임 클리어시
				page.rankingInsert(clearTime);	//랭킹 등록 페이지로 이동
			}
		}
	}

	@Override
	public void timerThread() {
		thread = new Thread() {
			@Override
			public void run() {
				timerLb = (Label)root.lookup("#timerLb");
				int mSec = 0, sec = 0, min = 0, time = 0;

				while(true) {
					mSec = time % 100;
					sec = (time / 100) % 60;
					min = (time / 100) / 60;
					String timerResult = String.format("%02d:%02d:%02d", min, sec, mSec);
					Platform.runLater(() -> {	// javafx에서 UI 변경을 위한 메소드
						timerLb.setText(timerResult);
					});
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						return;	// 인터럽트를 받을 경우 종료
					}
					time++;
				}
			}
		};
	}

}
