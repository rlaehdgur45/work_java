package ch02;

import java.util.Scanner;

public class Ch02Ex02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요.>");
		String input1 = scanner.nextLine();
		int input = Integer.parseInt(input1);
		
		System.out.printf("%d",input);

	}

}
