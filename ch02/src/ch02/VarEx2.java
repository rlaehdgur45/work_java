package ch02;

public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y = 20; // 변수 x,y 를 선언 하고, 각각 10 과 20으로 초기화
		int tmp = 0; // 변수 tmp를 선언 하고, 0으로 초기화
		
		System.out.println("X:"+ x + " Y:" + y); // x 와 y 값 출력
		
		tmp = x;	// x의 값을 tmp 변수에 저장
		x= y;		// y의 값을 x 변수에 저장
		y= tmp;		// tmp의 값을 y 변수에 저장
		
		System.out.println("X:" + x + " Y:" + y);  // x 와 y 값 출력
		
		/*
		 *  이 코드의 목적: x와 y값을 바꾸기 위한 방법
		 */
		
		
	}

}
