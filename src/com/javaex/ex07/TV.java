package com.javaex.ex07;

public class TV {

	// 필드
	private int channel;
	private int volume;
	private boolean power;

	// 생성자
	public TV () {
		
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	// 메소드 g/s
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}

	// 메소드 일반
	public void power (boolean on) {
		if(on==true) {
			power = true;
		} else if(on==false) {
			power = false;
		}
	}

	public void channel (int channel) {
		if (channel > 255) {
			this.channel = 255;
		} else {
			this.channel = channel;
		}
	}

	public void channel (boolean up) {
		if(up==true) {
			channel = channel+1;
			} else if(up==false) {
				channel = channel-1;
			}
	}

	public void volume(int volume) {
		if (volume > 100) {
			this.volume = 100;
		} else {
			this.volume = volume;
		}
	}

	public void volume (boolean up) {
		if(up==true) {
			volume = volume+1;
		} else if(up==false){
			volume = volume-1;
		}
	}

	public void staus() {
		System.out.println("전원: " + isPower() + "  채널: " + getChannel() + "  볼륨: " + getVolume());
	}
}
