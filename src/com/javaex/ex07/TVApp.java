package com.javaex.ex07;

public class TVApp {

	public static void main(String[] args) {

		TV tv =  new TV(7,20,false);
		tv.staus();
		
		tv.power(true);
		tv.volume(120);
		tv.staus();
		
		tv.volume(false);
		tv.staus();
		
		tv.channel(0);
		tv.staus();
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.staus();
		
		tv.power(false);
		tv.staus();
	}

}
