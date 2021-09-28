package game.tetris;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Form {
	Rectangle a;			// 테트리스의 모든 블록들은 4개이다
	Rectangle b;			// 그래서 a, b, c, d 총 4개의 변수를 생성
	Rectangle c;
	Rectangle d;
	Color color;			// 블록의 색상
	private String name;	// 각 블록의 이름
	public int form = 1;	// 한 블록이 회전하여 나타나는 모형은 4가지

	public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d, String name) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.name = name;

		// 블록 색상 지정
		switch (name) {
		case "j":
			color = Color.SLATEGRAY;
			break;
		case "l":
			color = Color.DARKGOLDENROD;
			break;
		case "o":
			color = Color.INDIANRED;
			break;
		case "s":
			color = Color.FORESTGREEN;
			break;
		case "t":
			color = Color.CADETBLUE;
			break;
		case "z":
			color = Color.HOTPINK;
			break;
		case "i":
			color = Color.SANDYBROWN;
			break;

		}
		this.a.setFill(color);
		this.b.setFill(color);
		this.c.setFill(color);
		this.d.setFill(color);
	}

	public String getName() {
		return name;
	}

	public void changeForm() {	// 한 블록이 회전하여 나타나는 모형은 4가지
		if (form != 4)
			form++;
		else
			form = 1;
	}

}