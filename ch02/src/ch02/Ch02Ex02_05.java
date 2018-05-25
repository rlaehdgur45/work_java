package ch02;

import java.util.Scanner;

public class Ch02Ex02_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("숫자를 입력해주세요.>");
		String a =scanner.nextLine();
		String input = scanner.nextLine();
		int num = Integer.parseInt(a);
		float num1 = Float.parseFloat(input);
		float num2 = num * num1;
		
		System.out.printf("%d * %f = %f",num,num1,num2);
		

	}

}
