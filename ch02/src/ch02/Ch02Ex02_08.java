package ch02;

import java.util.Scanner;

public class Ch02Ex02_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요.>");
		String num = scanner.nextLine();
		String input = scanner.nextLine();
		String input1 = scanner.nextLine();
		double num1 = Double.parseDouble(num);
		double num2 = Double.parseDouble(input);
		
		
		System.out.printf("%.2f%n%.2f%n%s",num1,num2,input1);
		

	}

}
