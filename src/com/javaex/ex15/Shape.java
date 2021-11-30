package com.javaex.ex15;

public class Shape {

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
		
	public void draw() {
		System.out.println("선색:" + getLineColor() + " 면색:" + getFillColor() + " 도형을 그렸습니다.");
	}
}
