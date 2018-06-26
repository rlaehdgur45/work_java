package ch06;

class Tv {
	String color;	//색상
	boolean power;	//전원상태(on/off)
	int channel;	//채널

	void power(){ power = !power;}	//tv를 켜거나 끄는 기능을 하는 메소드
	void channelUp(){ ++channel;}	//tv의 채널을 높이는 기능을 하는 메서드
	void channelDown() { --channel;}	// tv의 채널을 낮추는 기능을 하는 메서드
}
