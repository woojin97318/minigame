package game.tetris;

public class RankingDTO {
	private String rank;
	private String nickname;
	private String score;
	
	public RankingDTO(String rank, String nickname, String score) {
		this.rank = rank;
		this.nickname = nickname;
		this.score = score;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
	
	
	
}
