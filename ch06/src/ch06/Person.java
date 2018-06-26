package ch06;

public class Person {
	//속성(인스턴스 변수)
	//1.이름
	String name;
	//2.나이
	int age;
	//3.주소
	String js;
	
	//행동(메서드)
	//1.자기소개
	void so() {System.out.println("저는 "+age+"살 "+js+"에 사는 "+ name +" 입니다.");}
	//"저는 [나이]살 [주소]에 사는 [이름]입니다."
}
