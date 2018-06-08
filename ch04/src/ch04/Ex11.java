package ch04;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // 세번째 값
		System.out.print(num1+","+num2);
		for (int i = 0 ; i < 8 ; i++ ) {
		/*
		(1) 알맞은 코드를 넣어 완성하시오.
		*/
			num3 = num1 +num2;
			System.out.println(","+ num3);
			num1=num2;
			num2=num3;
			/*if(i<4) {
		    num1=num1+num2;
		    num2=num1+num2;
		    System.out.println(num1+","+num2);
		   }*/
		   
		  }
		}

	

}
