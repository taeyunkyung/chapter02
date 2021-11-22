package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Song iu = new Song();
		iu.setArtist("아이유");
		iu.setTitle("좋은날");
		iu.setAlbum("Real");
		iu.setYear(2010);
		iu.setTrack(3);
		iu.setComposer("이민수");
		iu.showInfo();
		
		Song bb = new Song();
		bb.setArtist("BIGBANG");
		bb.setTitle("거짓말");
		bb.setAlbum("Always");
		bb.setYear(2007);
		bb.setTrack(2);
		bb.setComposer("G-DRAGON");
		bb.showInfo();
		
		Song bsk = new Song();
		bsk.setArtist("버스커버스커");
		bsk.setTitle("벚꽃엔딩");
		bsk.setAlbum("버스커버스커1집");
		bsk.setYear(2012);
		bsk.setTrack(4);
		bsk.setComposer("장범준");
		bsk.showInfo();
	}

}
