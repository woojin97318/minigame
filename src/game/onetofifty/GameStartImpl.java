package game.onetofifty;

import java.util.Random;

import javafx.scene.Parent;
import javafx.scene.control.Button;

public class GameStartImpl implements GameStart{
	Parent root;
	Button[] btn = new Button[25];
	int[] num = new int[50];
	int step = 1;
	int i;

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

//	public void a() {
//		btn[i].setOnAction(e->{
//			if(step == Integer.parseInt(btn[i].getText())) {
//				if(step > 25) {
//					btn[i].setText("");
//					System.out.print("dd");
//				}else {
//					btn[i].setText(Integer.toString(num[i+25]));
//					System.out.print("dd");
//				}
//				step++;
//			}
//		});
//	}

	@Override
	public void onClick() {
		// 버튼 클릭시 이벤트 처리

		if(step > 50) {

		}else {
//			int num = 0;
//			btn[0].setOnAction(e->{
//				if(step == Integer.parseInt(btn[0].getText())) {
//					if(step > 25) {
//						btn[0].setText("");
//					}else {
//						btn[0].setText(Integer.toString(num[25]));
//					}
//					step++;
//				}
//			});
			//			btn[0].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[0].getText())) {
			//					if(step > 25) {
			//						btn[0].setText("");
			//					}else {
			//						btn[0].setText(Integer.toString(num[25]));
			//					}
			//					step++;
			//				}
			//			});
			//			btn[1].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[1].getText())) {
			//					if(step > 25) {
			//						btn[1].setText("");
			//					}else {
			//						btn[1].setText(Integer.toString(num[26]));
			//					}
			//					step++;
			//				}
			//			});
			//			btn[2].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[2].getText())) {
			//					if(step > 25) {
			//						btn[2].setText("");
			//					}else {
			//						btn[2].setText(Integer.toString(num[27]));
			//					}
			//					step++;
			//				}
			//			});
			//			btn[3].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[3].getText())) {
			//					if(step > 25) {
			//						btn[3].setText("");
			//					}else {
			//						btn[3].setText(Integer.toString(num[28]));
			//					}
			//					step++;
			//				}
			//			});
			//			btn[4].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[4].getText())) {
			//					if(step > 25) {
			//						btn[4].setText("");
			//					}else {
			//						btn[4].setText(Integer.toString(num[29]));
			//					}
			//					step++;
			//				}
			//			});
			//			btn[5].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[5].getText())) {
			//					if(step > 25) {
			//						btn[5].setText("");
			//					}else {
			//						btn[5].setText(Integer.toString(num[30]));
			//					}
			//					step++;
			//				}
			//			});
			//			btn[6].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[6].getText())) {
			//					if(step > 25) {
			//						btn[6].setText("");
			//					}else {
			//						btn[6].setText(Integer.toString(num[31]));
			//					}
			//					step++;
			//				}
			//			});
			//			btn[7].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[7].getText())) {
			//					if(step > 25) {
			//						btn[7].setText("");
			//					}else {
			//						btn[7].setText(Integer.toString(num[32]));
			//					}
			//					step++;
			//				}
			//			});
			//			btn[8].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[8].getText())) {
			//					if(step > 25) {
			//						btn[8].setText("");
			//					}else {
			//						btn[8].setText(Integer.toString(num[33]));
			//					}
			//					step++;
			//				}
			//			});
			//			btn[9].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[9].getText())) {
			//					if(step > 25) {
			//						btn[9].setText("");
			//					}else {
			//						btn[9].setText(Integer.toString(num[34]));
			//					}
			//					step++;
			//				}
			//			});
			//			btn[10].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[10].getText())) {
			//					if(step > 25) {
			//						btn[10].setText("");
			//					}else {
			//						btn[10].setText(Integer.toString(num[35]));
			//					}
			//					step++;
			//				}
			//			});
			//			btn[11].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[11].getText())) {
			//					if(step > 25) {
			//						btn[11].setText("");
			//					}else {
			//						btn[11].setText(Integer.toString(num[36]));
			//					}
			//					step++;
			//				}
			//			});
			//			btn[12].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[12].getText())) {
			//					if(step > 25) {
			//						btn[12].setText("");
			//					}else {
			//						btn[12].setText(Integer.toString(num[37]));
			//					}
			//					step++;
			//				}
			//			});
			//			btn[13].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[13].getText())) {
			//					if(step > 25) {
			//						btn[13].setText("");
			//					}else {
			//						btn[13].setText(Integer.toString(num[38]));
			//					}
			//					step++;
			//				}
			//			});
			//			btn[14].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[14].getText())) {
			//					if(step > 25) {
			//						btn[14].setText("");
			//					}else {
			//						btn[14].setText(Integer.toString(num[39]));
			//					}
			//					step++;
			//				}
			//			});
			//			btn[15].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[15].getText())) {
			//					if(step > 25) {
			//						btn[15].setText("");
			//					}else {
			//						btn[15].setText(Integer.toString(num[40]));
			//					}
			//					step++;
			//				}
			//			});
			//			btn[16].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[16].getText())) {
			//					if(step > 25) {
			//						btn[16].setText("");
			//					}else {
			//						btn[16].setText(Integer.toString(num[41]));
			//					}
			//					step++;
			//				}
			//			});
			//			btn[17].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[17].getText())) {
			//					if(step > 25) {
			//						btn[17].setText("");
			//					}else {
			//						btn[17].setText(Integer.toString(num[42]));
			//					}
			//					step++;
			//				}
			//			});
			//			btn[18].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[18].getText())) {
			//					if(step > 25) {
			//						btn[18].setText("");
			//					}else {
			//						btn[18].setText(Integer.toString(num[43]));
			//					}
			//					step++;
			//				}
			//			});
			//			btn[19].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[19].getText())) {
			//					if(step > 25) {
			//						btn[19].setText("");
			//					}else {
			//						btn[19].setText(Integer.toString(num[44]));
			//					}
			//					step++;
			//				}
			//			});
			//			btn[20].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[20].getText())) {
			//					if(step > 25) {
			//						btn[20].setText("");
			//					}else {
			//						btn[20].setText(Integer.toString(num[45]));
			//					}
			//					step++;
			//				}
			//			});
			//			btn[21].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[21].getText())) {
			//					if(step > 25) {
			//						btn[21].setText("");
			//					}else {
			//						btn[21].setText(Integer.toString(num[46]));
			//					}
			//					step++;
			//				}
			//			});
			//			btn[22].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[22].getText())) {
			//					if(step > 25) {
			//						btn[22].setText("");
			//					}else {
			//						btn[22].setText(Integer.toString(num[47]));
			//					}
			//					step++;
			//				}
			//			});
			//			btn[23].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[23].getText())) {
			//					if(step > 25) {
			//						btn[23].setText("");
			//					}else {
			//						btn[23].setText(Integer.toString(num[48]));
			//					}
			//					step++;
			//				}
			//			});
			//			btn[24].setOnAction(e->{
			//				if(step == Integer.parseInt(btn[24].getText())) {
			//					if(step > 25) {
			//						btn[24].setText("");
			//					}else {
			//						btn[24].setText(Integer.toString(num[49]));
			//					}
			//					step++;
			//				}
			//			});
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

}
