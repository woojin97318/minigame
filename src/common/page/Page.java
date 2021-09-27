package common.page;

import javafx.scene.Parent;

// MiniGame 내 페이지 이동 관련 인터페이스
public interface Page {
	public void setRoot(Parent root);
	public void mainPage();							// 메인 페이지
	public void menuPage();							// 게임 메뉴 페이지
	// OneToFifty 관련 페이지 이동 메소드
	public void oneToFiftyPage();					// OneToFifty 시작 페이지
	public void rankingInsert(String clearTime);	// OneToFifty 랭킹 등록 페이지
	public void rankingPage1to50();					// OneToFifty 랭킹 리스트 페이지
	// ticTacToe 관련 페이지 이동 메소드
	public void ticTacToePage();					// TicTacToe 시작 페이지
	public void tictactoePvpPage();					// TicTacToe 2인용 페이지
	// Tetris 관련 페이지 이동 메소드
	public void tetrisPage();						// 테트리스 시작 페이지
	public void tetrisRankingInsert(int score);	// 테트리스 랭킹 등록 페이지
	public void rankingPageTetris();				// 테트리스 랭킹 리스트 페이지
}
