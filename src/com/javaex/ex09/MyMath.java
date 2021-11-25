package com.javaex.ex09;

public class MyMath {

	// 필드
	private static double PI = 3.14159;
	
	// 생성자 -> 디폴트

	// 메소드 g/s
	
	// 메소드 일반
	public static int plus(int a, int b) {
		return a + b;
	}

	public static double plus(double a, double b) {
		return a + b;
	}

	public static double plus(int a, double b) {
		return a + b;
	}

	public static double plus(double a, int b) {
		return a + b;
	}

	public static double circleArea(int radius) {
		return radius * radius * PI;
	}

	public static double circle(int radius) {
		return 2 * radius * PI;
	}
}
