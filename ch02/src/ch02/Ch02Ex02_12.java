package ch02;

import java.util.Scanner;

public class Ch02Ex02_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String a = scanner.nextLine();
		int num1 =Integer.parseInt(a);
		String num2 = scanner.nextLine();
		float num3 = Float.parseFloat(num2);
		
		double sum = num3*num1;
		
		System.out.printf("%3.2f * %d = %2.0f",num3,num1,sum);

	}

}
