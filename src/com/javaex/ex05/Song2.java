package com.javaex.ex05;

public class Song2 {
	// 필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;

	// 생성자
	public Song2() {
		System.out.println("Song()");
	}
	public Song2(String title, String artist, String album, String composer) {
		this(title, artist, album, composer, ""); // 다른 생성자 이용
		System.out.println("Song(4)");
	}

	public Song2(String title, String artist, String album, String composer, String year) {
		this.title = title;
		this.artist = artist;
		this.album = album;

		// 최대 10글자 까지만 입력
		this.composer = composer;

		// 2021년 이후 연도 들어오면 2021년으로 처리
		this.year = year;
		System.out.println("Song(5)");
	}

	public Song2(String title, String artist, String album, String composer, String year, int track) {
		this(title, artist, album, composer, year); // 다른 생성자 이용
		this.track = track;
		System.out.println("Song(6)");
	}

	// 메소드 g/s
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}

	public void showInfo() {
		System.out.println(
				artist + ", " + title + " (" + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡)");
	}

}
