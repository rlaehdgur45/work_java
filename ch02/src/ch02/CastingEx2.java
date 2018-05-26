package ch02;

public class CastingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int형의 정수 10 byte 타입으로 변경했을때 -> 정보손실 없음
		int i = 10;
		byte b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i ,b);
		
		//int형의 정수 300을 byte 타입으로 변경 했을때 -> 정보손실 발생
		//byte의 값을 범위 -128~127을 초과했기 때문에 정보손실이 발생한다.
		i= 300;
		b= (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i , b);
		System.out.println("i="+Integer.toBinaryString(i));
		//300을 2진수로 출력
		
		
		// byte형의 정수 10을  int타입으로 변경했을때 -> 정보손실 없음
		// int타입의 범위는 -20억 ~ +20억이기 때문에 정보손실이 없다.
		b= 10;
		i= (int)b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);
		
		// byte형의 정수 -2를 int 타입으로 변경 했을때 -> 손실 없음
		//int 타입의 범위는 -20억 ~ +20억이기 때문에 정보손실이 없다.
		b = -2;
		i = (int)b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);
		
		System.out.printf("i="+Integer.toBinaryString(i));
		

	}

}
