package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Song s1 = new Song("좋은날","아이유","REAL","이민수","2010",3);
		//System.out.println(s1.toString());
		s1.showInfo();
		
		Song s2 = new Song();
		s2.setTitle("거짓말");
		s2.setArtist("BIGBANG");
		s2.setAlbum("Always");
		s2.setComposer("G-DRAGON");
		s2.setYear("2007");
		s2.setTrack(2);
		//System.out.println(s2.toString());
		s2.showInfo();
		
		Song s3 = new Song("벚꽃엔딩","버스커버스커","버스커버스커1집","장범준","2012",4);
		//System.out.println(s3.toString());
		s3.showInfo();
	}

}
