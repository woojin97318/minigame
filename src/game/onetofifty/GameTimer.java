package game.onetofifty;

import javafx.scene.Parent;

public class GameTimer extends Thread{
	Parent root;
	ThreadSharedData tsd = new ThreadSharedData();

	public void setRoot(Parent root) {
		this.root = root;
	}

	public void timeSleep(int num) {
		try {
			sleep(num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		int h=0, m=0, s=0;
		String hour, min, sec, timer = "00:00:00";

		while(true) {
			if(s>=60) {s=0;m++;}
			if(m>=60) {m=0;h++;}

			hour = String.valueOf(h);
			min = String.valueOf(m);
			sec = String.valueOf(s);

			if(h<10) {hour = "0"+hour;}
			if(m<10) {min = "0"+min;}
			if(s<10) {sec = "0"+sec;}
			timer = String.format("%s:%s:%s", hour, min, sec);
			timeSleep(1000); //1초 간격
			s++;
			tsd.setTime(timer);

			System.out.println(timer);	// 테스트 출력
		}
	}
}