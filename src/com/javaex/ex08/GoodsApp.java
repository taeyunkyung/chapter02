package com.javaex.ex08;

public class GoodsApp {

	// 필드
	// 생성자 -> 디폴트
	// 메소드 g/s
	// 메소드 일반
	public static void main(String[] args) {

		Goods camera = new Goods("니콘", 400000);
		// camera.showInfo();
		System.out.println(camera.toString());

		Goods computer = new Goods("LG그램", 900000);
		// computer.showInfo();
		System.out.println(computer.toString());

		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		// cup.showInfo();
		System.out.println(cup.toString());
	}

}
