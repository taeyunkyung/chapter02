package com.javaex.ex12;

public class ColorPoint extends Point {

	// 필드
	private String color;

	// 생성자
	public ColorPoint() {

	}

	public ColorPoint(String color) {
		this.color = color;
	}

	public ColorPoint(int x, int y, String color) {
		super.x = x;
		super.y = y;
		this.color = color;
	}

	// 메소드 g/s
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// 메소드
	public void showInfo() {
		System.out.println("[점: " + super.x + ", 점: " + super.y + ", 색: " + this.color + " 를 그렸습니다.]");
	}

	@Override
	public String toString() {
		return "ColorPoint [color=" + color + ", x=" + x + ", y=" + y + "]";
	}
	
}
