package game.tictactoe.rule;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TictactoeGameRule {
	Parent root;


	Button[] gameBtn = new Button[10];
	String pTurn = null; //다음사람의 턴
	int turnCnt = 0;//턴 수 
	String whoTurn = null;//현재 턴의 입력 

	public void changeTurn() {
		if(turnCnt %2 == 0) {
			pTurn = "O";
			whoTurn = "X";
			turnCnt++;
		}else {
			pTurn = "X";
			whoTurn = "O";
			turnCnt++;
		}

	}


	public void setRoot(Parent root) {	
		this.root = root;		
	}

	public void gameStart() {
		Label lblStatus = (Label)root.lookup("#lblStatus");
		turnCnt = 0;	
		changeTurn();
		lblStatus.setText(pTurn+"의 차례입니다.");

		for(int i = 1; i <= 9; i++) {
			gameBtn[i] = (Button)root.lookup("#gameBtn" + i);
			System.out.println(i);
			gameBtn[i].setText(" ");			
		}
	}
	public void btnProc(Button btn) {
		changeTurn();
		btn.setText(whoTurn);
		Label lblStatus = (Label)root.lookup("#lblStatus");
		lblStatus.setText(pTurn+"의 차례입니다.");
		if(isWon() == true) {
			lblStatus.setText(whoTurn+"이 승리했습니다");
			/*	for(int j = 1; j <= 9; j++) {
				gameBtn[j] = (Button)root.lookup("#gameBtn" + j);
				System.out.println(j);
				gameBtn[j].setDisable(true);
			}*/
		}
		/*if(isFull() == true) {
			lblStatus.setText("무승부입니다.");
				for(int k = 1; k <= 9; k++) {
				gameBtn[k] = (Button)root.lookup("#gameBtn" + k);
				System.out.println(k);
				gameBtn[k].setDisable(true);
			}
		}*/

	}

	//승리조건
	public boolean isWon() {
		//가로줄 조건
		for(int i = 0; i<=9; i++)
			if(gameBtn[1].getText() == whoTurn
			&&gameBtn[2].getText() == whoTurn
			&&gameBtn[3].getText() == whoTurn) {
				return true;
			}
		for(int i = 0; i<=9; i++)
			if(gameBtn[4].getText() == whoTurn
			&&gameBtn[5].getText() == whoTurn
			&&gameBtn[6].getText() == whoTurn) {
				return true;
			}
		for(int i = 0; i<=9; i++)
			if(gameBtn[7].getText() == whoTurn
			&&gameBtn[8].getText() == whoTurn
			&&gameBtn[9].getText() == whoTurn) {
				return true;
			}
		//세로줄조건
		for(int i = 0; i<=9; i++)
			if(gameBtn[1].getText() == whoTurn
			&&gameBtn[4].getText() == whoTurn
			&&gameBtn[7].getText() == whoTurn) {
				return true;
			}
		for(int i = 0; i<=9; i++)
			if(gameBtn[2].getText() == whoTurn
			&&gameBtn[5].getText() == whoTurn
			&&gameBtn[8].getText() == whoTurn) {
				return true;
			}
		for(int i = 0; i<=9; i++)
			if(gameBtn[3].getText() == whoTurn
			&&gameBtn[6].getText() == whoTurn
			&&gameBtn[9].getText() == whoTurn) {
				return true;
			}
		//대각선 조건
		for(int i = 0; i<=9; i++)
			if(gameBtn[1].getText() == whoTurn
			&&gameBtn[5].getText() == whoTurn
			&&gameBtn[9].getText() == whoTurn) {
				return true;
			}
		for(int i = 0; i<=9; i++)
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
		for(int i = 0; i <=9; i++) {
			if(gameBtn[1].getText()!=null &&
					gameBtn[2].getText()!=null &&
					gameBtn[3].getText()!=null &&
					gameBtn[4].getText()!=null &&
					gameBtn[5].getText()!=null &&
					gameBtn[6].getText()!=null &&
					gameBtn[7].getText()!=null &&
					gameBtn[8].getText()!=null &&
					gameBtn[9].getText()!=null
					) {
				return true;
			}
		}
		return false;
	}
}
