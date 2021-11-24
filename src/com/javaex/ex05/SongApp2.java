package com.javaex.ex05;

public class SongApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Song2 s1 = new Song2("좋은날","아이유","REAL","이민수","2010",3);
		//System.out.println(s1.toString());
		s1.showInfo();
		
		Song2 s2 = new Song2("거짓말","BIGBANG","Always","G-DRAGON","2007");
		s2.setTrack(2);
		//System.out.println(s2.toString());
		s2.showInfo();
		
		Song2 s3 = new Song2("벚꽃엔딩","버스커버스커","버스커버스커1집","장범준");
		s3.setTrack(4);
		//System.out.println(s3.toString());
		s3.showInfo();
	}

}
