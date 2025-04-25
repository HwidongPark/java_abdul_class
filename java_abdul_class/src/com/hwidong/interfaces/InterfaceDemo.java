package com.hwidong.interfaces;

public class InterfaceDemo {

	public static void main(String[] args) {
		// smart phone의 모든 method를 사용할 수 있음
		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.record();
		
		// Phone 클래스가 갖고 있는 method만 호출할 수 있음
		Phone p = new SmartPhone();
		p.call();
		
		// ICamera Interface에 정의된 method만 호출할 수 있음
		ICamera c = new SmartPhone();
		c.click();
		
		// IMusicPlayer Interaface에 정의된 method만 호출할 수 있음
		IMusicPlayer mp =  new SmartPhone();
		mp.play();
		
	}

}


class Phone {
	public void call() {
		System.out.println("Phone call");
	}
	
	public void sms() {
		System.out.println("Phone sending SMS");
	}
}

interface ICamera {
	void click();
	void record();
}

interface IMusicPlayer {
	void play();
	void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer {
	public void videoCall() {
		System.out.println("Smart Phone video calling");
	}
	
	public void click() {
		System.out.println("Smart phone Clicking photo");
	}
	
	public void record() {
		System.out.println("Smart phone recording video");
	}
	
	public void play() {
		System.out.println("Smart phone playing music");
	}
		
	public void stop() {
		System.out.println("Smart phone stopped playing music");
	}
}