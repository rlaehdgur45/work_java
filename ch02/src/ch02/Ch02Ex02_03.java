package ch02;

import java.util.Scanner;

public class Ch02Ex02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요.>");

		String num =scanner.nextLine();
		String num1 =scanner.nextLine();
		int num2 = Integer.parseInt(num);
		int num3 = Integer.parseInt(num1);
		
		System.out.printf("%d%n%d%n",num2,num3);

	}

}
