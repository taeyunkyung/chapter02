package com.javaex.ex02;

public class PointApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point2 p01 = new Point2(3, 6);
		// p01.setX(5);
		// p01.setY(5);
		p01.draw();
		
		Point2 p02 = new Point2();
		p02.setX(10);
		p02.setY(23);
		p02.draw();
		
		Point2 p03 = new Point2(100);
		p03.setY(100);
		p03.draw();
	}

}
