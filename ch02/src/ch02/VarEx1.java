package ch02;

public class VarEx1 {

	public static void main(String[] args) {
		/* 변수란, 단 하나의 값을 저장 할수 있는 메모리 공간
		 * 변수의 초기화란, 변수를 사용하기 전에 처음으로 값을 저장하는것
		 */
		// TODO Auto-generated method stub
		int year = 0; // 변수  year를 선언 및 0 으로 초기화
		int age = 14; // 변수 age 를 선언 및 14 로 초기화
		
		System.out.println(year); // 변수  year의 내용 출력
		System.out.println(age); // 변수 age의 내용 출력
		
		year = age + 2000; // 변수 age의 갑에 2000을 더해서 변수  year에 저장
		age = age + 1; // 변수 age의 값에 1을 더해서 변수 age에 저장
		
		System.out.println(year);
		System.out.println(age);
	}

}
