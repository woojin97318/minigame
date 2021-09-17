package game.tictactoe.rule;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TictactoeGameRule {
	Parent root;



	Button[] gameBtn = new Button[10];
	Button playerChk;
	Button gameStartBtn;
	String pTurn = null; //다음사람의 턴
	int turnCnt = 0;//턴 수 
	String whoTurn = null;//현재 턴의 입력  (추후 이미지로 변환예정 - 디자인시 시작)
	String p1, p2, winner = null;
	public void setPTurn(String s) {
		this.pTurn = s;
	}

	//playerName 받아오기
	public void getPlayerName() {
		TextField playerName1 = (TextField)root.lookup("#playerName1");
		TextField playerName2 = (TextField)root.lookup("#playerName2");
		playerChk = (Button)root.lookup("#playerChk");
		p1 = playerName1.getText();
		p2 = playerName2.getText();

		if(p1.equals(p2)) {
			System.out.println("두 플레이어의 이름이 같습니다");
		}else {
			System.out.println("p1 : "+ p1);
			System.out.println("p2 : "+ p2);
			setPTurn(p1);
			setPTurn(p2);
			gameStartBtn = (Button)root.lookup("#gamestartBtn");
			gameStartBtn.setDisable(false);
			playerChk.setDisable(true);
			
		}

	}


	//턴계산 메소드
	public void changeTurn() {
		if(turnCnt %2 == 0) {
			pTurn = p1;
			whoTurn = "X";
			winner = p2;
			turnCnt++;
		}else {
			pTurn = p2;
			whoTurn = "O";
			winner = p1;
			turnCnt++;

		}
	}

	public void gameFinished() {
		for(int i = 1; i <= 9; i++) {
			gameBtn[i] = (Button)root.lookup("#gameBtn" + i);
			gameBtn[i].setDisable(true);
		}
		playerChk.setDisable(false);
	}


	public void setRoot(Parent root) {	
		this.root = root;		
	}

	public void gameStart() {
		gameStartBtn.setDisable(true);
		Label lblStatus = (Label)root.lookup("#lblStatus");
		turnCnt = 0;	
		changeTurn();
		lblStatus.setText(pTurn+"의 차례입니다.");

		for(int i = 1; i <= 9; i++) {
			gameBtn[i] = (Button)root.lookup("#gameBtn" + i);
			System.out.println(i);
			gameBtn[i].setText(" ");	
			gameBtn[i].setDisable(false);
		}

	}
	public void btnProc(Button btn) {
		changeTurn();
		btn.setText(whoTurn);
		Label lblStatus = (Label)root.lookup("#lblStatus");
		System.out.println("");
		lblStatus.setText(pTurn+" 님의 차례입니다.");
		if(isWon() == true) {
			lblStatus.setText(winner+"가 승리했습니다");
			gameFinished();
		}
		else if(isFull() ==true) {
			lblStatus.setText("무승부입니다");
			gameFinished();
		}
	}

	//승리조건
	public boolean isWon() {
		//가로줄 조건
		if(gameBtn[1].getText() == whoTurn
				&&gameBtn[2].getText() == whoTurn
				&&gameBtn[3].getText() == whoTurn) {
			return true;
		}
		if(gameBtn[4].getText() == whoTurn
				&&gameBtn[5].getText() == whoTurn
				&&gameBtn[6].getText() == whoTurn) {
			return true;
		}
		if(gameBtn[7].getText() == whoTurn
				&&gameBtn[8].getText() == whoTurn
				&&gameBtn[9].getText() == whoTurn) {
			return true;
		}
		//세로줄조건
		if(gameBtn[1].getText() == whoTurn
				&&gameBtn[4].getText() == whoTurn
				&&gameBtn[7].getText() == whoTurn) {
			return true;
		}
		if(gameBtn[2].getText() == whoTurn
				&&gameBtn[5].getText() == whoTurn
				&&gameBtn[8].getText() == whoTurn) {
			return true;
		}
		if(gameBtn[3].getText() == whoTurn
				&&gameBtn[6].getText() == whoTurn
				&&gameBtn[9].getText() == whoTurn) {
			return true;
		}
		//대각선 조건
		if(gameBtn[1].getText() == whoTurn
				&&gameBtn[5].getText() == whoTurn
				&&gameBtn[9].getText() == whoTurn) {
			return true;
		}

		if(gameBtn[3].getText() == whoTurn
				&&gameBtn[5].getText() == whoTurn
				&&gameBtn[7].getText() == whoTurn) {
			return true;
		}		
		return false;
	}


	//무승부 미완성
	public boolean isFull() {
		Label lblStatus = (Label)root.lookup("#lblStatus");
		if(turnCnt == 10 && isWon() ==false) {
			return true;
		}
		return false;
	}
}
