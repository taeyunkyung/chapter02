package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {

		/*
		Rectangle r = new Rectangle("빨강", "빨강", 5, 10);
		System.out.println(r.area());
		
		Circle c = new Circle("파랑", "파랑", 10);
		System.out.println(c.area());
		
		Triangle t = new Triangle("노랑", "노랑", 5, 10);
		System.out.println(t.area());
		*/
		
		Shape[] sArray = new Shape[3];

		Shape r01 = new Rectangle("빨강", "빨강", 5, 10);
		Shape c01 = new Circle("파랑", "파랑", 10);
		Shape t01 = new Triangle("노랑", "노랑", 5, 10);

		sArray[0] = r01;
		sArray[1] = c01;
		sArray[2] = t01;

		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i].area());
		}

	}

}
