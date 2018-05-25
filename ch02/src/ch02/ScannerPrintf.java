package ch02;

import java.util.Scanner;

public class ScannerPrintf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		//String input = scanner.nextLine();
		//int num = Integer.parseInt(input);
		int num =scanner.nextInt();
		int num1 =scanner.nextInt();
		
		//System.out.printf("num=%d, num1=%d%n", num, num1);
		
		System.out.printf("num=%d, %o, %x%n", num, num, num);
		
		

	}

}
