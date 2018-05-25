package ch02;

import java.util.Scanner;

public class Ch02Ex02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String a = scanner.nextLine();
		String aa = scanner.nextLine();
		int num =Integer.parseInt(a);
		int num1 =Integer.parseInt(aa);
		
		int num2 = num+num1;
		
		System.out.printf("%d+%d=%d",num,num1,num2);

	}

}
