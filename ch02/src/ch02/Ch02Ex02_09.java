package ch02;

import java.util.Scanner;

public class Ch02Ex02_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요.>");
		String num = scanner.nextLine();
		String input = scanner.nextLine();
		String input1 = scanner.nextLine();
		float num1 = Float.parseFloat(num);
		float num2 = Float.parseFloat(input);
		double num3 = Double.parseDouble(input1);
		
		
		System.out.printf("%4.3f%n%4.3f%n%4.3f",num1,num2,num3);

	}

}
