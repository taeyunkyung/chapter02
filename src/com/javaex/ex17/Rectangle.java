package com.javaex.ex17;

public class Rectangle extends Shape {

	// 필드
	private int width;
	private int height;

	// 생성자
	public Rectangle() {
		super(); // Shape(부모)의 디폴트 생성자
	}

	public Rectangle(String lineColor, String fillColor, int width, int height) {
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
	}

	// 메소드 g/s
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// 메소드
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getLineColor()=" + getLineColor()
				+ ", getFillColor()=" + getFillColor() + "]";
	}

	public void draw() {
		System.out.println(
				"선색:" + getLineColor() + " 면색:" + getFillColor() + " 가로:" + width + " 세로:" + height + " 사각형을 그렸습니다.");
	}

	public double area() {
		double result = height * width;
		return result;
	}

}
