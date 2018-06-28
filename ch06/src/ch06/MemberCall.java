package ch06;

public class MemberCall {
	int iv =10;	//MemberCall 클래스의 인스턴스 변수
	static int cv =20;	//MemberCall 클래스의 클래스 변수
	
	int iv2=cv;	//가능
	static int cv2 = new MemberCall().iv;
	
	static void staticMethod1() {
		System.out.println(cv);
		MemberCall c = new MemberCall();
		System.out.println(c.iv);
	}
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	static void staticMethod2() {
		staticMethod1();
		MemberCall c= new MemberCall();
		c.instanceMethod1();
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}

}
