package ch02;

import java.util.Scanner;

public class ScannerPrintf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.printf("num=%d, %o, %x%n", num, num, num);
		
		

	}

}
