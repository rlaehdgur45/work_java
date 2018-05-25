package ch02;

import java.util.Scanner;

public class Ch02Ex02_11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String num = scanner.nextLine();
		String input = scanner.nextLine();
		float num1 = Float.parseFloat(num);
		float num2 = Float.parseFloat(input);
		float a1 = num1 + num2;
		
		System.out.printf("%10.2f%10.2f%10.2f",num1,num2,a1);
		
		
		
		
	}

}
