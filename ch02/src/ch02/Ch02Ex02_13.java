package ch02;

import java.util.Scanner;

public class Ch02Ex02_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String a = scanner.nextLine();
		String aa = scanner.nextLine();
		String aaa = scanner.nextLine();
		int num =Integer.parseInt(a);
		int num1 =Integer.parseInt(aa);
		int num2 =Integer.parseInt(aaa);
		
		int sum = num+num1+num2;
		float avg = sum/3;
		
		System.out.printf("sum = %d%n avg = %2.0f",sum,avg);

	}

}
