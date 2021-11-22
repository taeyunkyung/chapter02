package com.javaex.ex02;

public class Point {
	// 필드
	private int pointX;
	private int pointY;
	// 메소드
	public void setX(int x) {
		pointX = x;
	}
	public void setY(int y) {
		pointY = y;
	}
	public int getX() {
		return pointX;
	}
	public int getY() {
		return pointY;
	}
	public void draw() {
		System.out.println("점[x="+pointX+", y="+pointY+"]을 그렸습니다.");
	}
	
}
