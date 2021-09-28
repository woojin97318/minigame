package game.onetofifty;

public class RankingDTO {
	private String rank;
	private String nickname;
	private String time;

	public RankingDTO(String rank, String nickname, String time) {
		this.rank = rank;
		this.nickname = nickname;
		this.time = time;
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
