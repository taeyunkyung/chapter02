package com.javaex.ex12;

public class PointApp {

	public static void main(String[] args) {

		Point p = new Point(4, 4);
		p.showInfo();

		ColorPoint cp1 = new ColorPoint("red");
		cp1.setX(7);
		cp1.setY(7);
		ColorPoint cp2 = new ColorPoint(10, 10, "blue");

		cp1.showInfo();
		cp2.showInfo();
		System.out.println(cp1.toString());
		System.out.println(cp2.toString());
	}

}
