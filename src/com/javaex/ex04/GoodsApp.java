package com.javaex.ex04;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods("니콘", 400000);
		//System.out.println(camera.toString());
		camera.showInfo();
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		//System.out.println(cup.toString());
		cup.showInfo();
		
		Goods computer = new Goods("LG그램", 900000);
		//System.out.println(computer.toString());
		computer.showInfo();
	}

}
