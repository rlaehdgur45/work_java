package ch06;

public class Person {
	//속성(인스턴스 변수)
	//1.이름
	String name;
	//2.나이
	int age;
	//3.주소
	String js;
	
	//[2-1]이름, 나이, 주소 인스턴스 변수를 초기화 하는 생성자를 작성하시오
	Person(String name, int age, String js){
		this.name = name;
		this.age = age;
		this.js= js;
	}
	
	//[2-3] 이름만 입력받는 생성자를 작성하시오.
	//단, 나이와 주소 값은 각각 기본으로 19,"없음" 값으로 초기화 하는 생성자를 작성
	Person(String name){
		/*this.name =name;
		this.age=19;
		this.js="없음";*/
		
		this(name, 19, "없음");//생성자에서 다른 생성자를 호출하려면 첫번째 호출에서만 가능하다.
		
	}
	
	
	//행동(메서드)
	//1.자기소개
	void so() {System.out.println("저는 "+age+"살 "+js+"에 사는 "+ name +" 입니다.");}
	//"저는 [나이]살 [주소]에 사는 [이름]입니다."
}
