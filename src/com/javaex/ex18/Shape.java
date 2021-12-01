package com.javaex.ex18;

public abstract class Shape {

	// 필드
	private String lineColor;
	private String fillColor;

	// 생성자
	public Shape() {

	}

	public Shape(String lineColor, String fillColor) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}

	// 메소드 g/s
	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	// 메소드
	@Override
	public String toString() {
		return "Shape [lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}
	
	/* 오바라이딩을 위해 만들었지만 인터페이스 사용으로 필요 없어짐
	public void draw() {
		System.out.println("선색:" + getLineColor() + " 면색:" + getFillColor() + " 도형을 그렸습니다.");
	}
	*/
	
	public abstract double area();
}
