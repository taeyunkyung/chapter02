package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {

		/*
		Point p01 = new Point(7, 7); 
		p01.draw(); 
		System.out.println(p01.getX());
		 
		Drawable p02 = new Point(8, 10); 
		p02.draw();
		System.out.println(((Point)p02).getX());
		*/

		Drawable[] dArray = new Drawable[4];

		Drawable p01 = new Point(4, 4);
		Drawable r01 = new Rectangle("빨강", "빨강", 5, 7);
		Drawable c01 = new Circle("파랑", "파랑", 12);
		Drawable t01 = new Triangle("노랑", "노랑", 20, 54);

		dArray[0] = p01;
		dArray[1] = r01;
		dArray[2] = c01;
		dArray[3] = t01;

		for (int i = 0; i < dArray.length; i++) {
			dArray[i].draw();
		}
		
		/*
		for (int i = 0; i < dArray.length; i++) {
			System.out.println(((Shape)dArray[i]).area());
		} 오류 -> Shape이면 출력하고 Shape이 아니면 출력할 수 없도록 해야함
		*/ 
		
		for (int i = 0; i < dArray.length; i++) {
			if(dArray[i] instanceof Shape) { // 이 주소의 인스턴스가 Shape틀에서 만들어졌나?
				System.out.println(((Shape)dArray[i]).area());
			} 
		}
	}

}
