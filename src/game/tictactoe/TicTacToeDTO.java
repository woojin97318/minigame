package game.tictactoe;

public class TicTacToeDTO {
	private String name;
	private int winCnt;
	private int loseCnt;
	private int drawCnt;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWinCnt() {
		return winCnt;
	}
	public void setWinCnt(int winCnt) {
		this.winCnt = winCnt;
	}
	public int getLoseCnt() {
		return loseCnt;
	}
	public void setLoseCnt(int loseCnt) {
		this.loseCnt = loseCnt;
	}
	public int getDrawCnt() {
		return drawCnt;
	}
	public void setDrawCnt(int drawCnt) {
		this.drawCnt = drawCnt;
	}
	
}
