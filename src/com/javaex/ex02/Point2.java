package com.javaex.ex02;

public class Point2 {
	// 필드
	private int x;
	private int y;

	// 생성자

	public Point2() {
		// 해당 클래스를 메모리에 올리는 일, 쓰지 않아도 해줌
		// 단 다른 생성자를 만들면 사라지므로 필요한 경우에는 써줘야 함
		System.out.println("Point()");
	}

	public Point2(int x) {
		this.x = x;
		System.out.println("Point(1)");
	}

	// public Point2(int y) { this.y = y; } 윗 생성자와 이름이 같아서 구별 못함

	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point(2)");
	}

	// 메소드 g/s
	public void setX(int x) { // setter (alt+shift+s generate getter setter)
		if (x >= 0) {
			this.x = x;
		} else {
			this.x = 0;
		}
	}

	public int getX() { // getter
		if (x < 0) {
			return 0;
		} else {
			return x;
		}
	}

	public void setY(int y) {
		this.y = y;

	}

	public int getY() {
		return y;
	}

	// 메소드
	public void draw() {
		System.out.println("점[x=" + getX() + ", y=" + getY() + "]를 그렸습니다.");
	}

	// action=true 그리는 기능, action=false 지우는 기능
	public void draw(boolean action) {
		if (action == true) {
			System.out.println("점[x=" + getX() + ", y=" + getY() + "]를 그렸습니다.");
		} else if (action == false) {
			System.out.println("점[x=" + getX() + ", y=" + getY() + "]를 지웠습니다.");
		} else {
			System.out.println("잘못된 입력");
		}
	}

	@Override
	public String toString() {
		return "Point2 [x=" + x + ", y=" + y + "]";
	}

}
