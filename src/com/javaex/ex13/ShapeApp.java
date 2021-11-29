package com.javaex.ex13;

public class ShapeApp {

	public static void main(String[] args) {

		Rectangle r01 = new Rectangle("빨강", "노랑", 5, 5);
		Rectangle r02 = new Rectangle("파랑", "노랑", 10, 20);
		Rectangle r03 = new Rectangle("빨강", "빨강", 55, 77);

		Rectangle[] rArray = new Rectangle[3];
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;

		for (int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}

		/*
		 * for (int i = 0; i < rArray.length; i++) {
		 * System.out.println(rArray[i].getLineColor()); }
		 */

		Circle[] cArray = new Circle[3];
		Circle c01 = new Circle("보라", "빨강", 15);
		cArray[0] = c01;

		Circle c02 = new Circle("검정", "초록", 5);
		cArray[1] = c02;

		Circle c03 = new Circle("분홍", "주황", 10);
		cArray[2] = c03;

		for (int i = 0; i < cArray.length; i++) {
			cArray[i].draw();
		}

		Triangle[] tArray = new Triangle[3];
		Triangle t01 = new Triangle("검정", "파랑", 6, 6);
		tArray[0] = t01;

		Triangle t02 = new Triangle("하양", "청록", 12, 15);
		tArray[1] = t02;

		Triangle t03 = new Triangle("자주", "하양", 21, 18);
		tArray[2] = t03;

		for (int i = 0; i < tArray.length; i++) {
			tArray[i].draw();
		}
	}

}
