package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {

		Shape[] sArray = new Shape[3];

		Shape r01 = new Rectangle("빨강", "빨강", 5, 5);
		// s01.getHeight, s01.getWidth: 접근 블가
		// r01.draw();

		Shape c01 = new Circle("노랑", "노랑", 15);
		// c01.draw();

		Shape t01 = new Triangle("파랑", "파랑", 20, 20);
		// t01.draw();

		sArray[0] = r01;
		sArray[1] = c01;
		sArray[2] = t01;
		
		for (int i = 0; i < sArray.length; i++) {
			sArray[i].draw();
		}

		((Rectangle)r01).getHeight();
		((Circle)c01).getRadius(); // 강제 형변환, 다운캐스팅
		((Triangle)t01).getWidth();
	}

}
