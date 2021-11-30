package com.javaex.ex15;

public class Circle extends Shape{

	// 필드
	private int radius;

	// 생성자
	public Circle() {
		super();
	}

	public Circle(String lineColor, String fillColor, int radius) {
		super(lineColor, fillColor);
		this.radius = radius;
	}

	// 메소드 g/s
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// 메소드
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getLineColor()=" + getLineColor() + ", getFillColor()=" + getFillColor()
				+ "]";
	}
	
	public void draw() {
		System.out.println("선색:" + getLineColor() + " 면색:" + getFillColor() + " 반지름:" + radius + " 원을 그렸습니다.");
	}
	
}
