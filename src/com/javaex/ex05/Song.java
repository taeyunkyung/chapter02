package com.javaex.ex05;

public class Song {
	// 필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;

	// 생성자
	public Song() {
		System.out.println("Song()");
	}

	public Song(String title, String artist, String album, String composer, String year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
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
