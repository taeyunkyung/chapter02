package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {

		Goods[] goodsArray = new Goods[3];

		Goods camera = new Goods("니콘", 400000);
		goodsArray[0] = camera;

		// Goods computer = new Goods("LG그램", 900000);
		// goodsArray[1] = computer;

		Goods cup = new Goods("머그컵", 2000);
		goodsArray[2] = cup;

		// System.out.println(camera.toString());
		// System.out.println(goodsArray[0].toString());

		int count = 0;
		for (int i = 0; i < goodsArray.length; i++) {
			if (goodsArray[i] != null) {
				goodsArray[i].showInfo();
				count++;
			}
		}
		System.out.println(count);

	}

}
