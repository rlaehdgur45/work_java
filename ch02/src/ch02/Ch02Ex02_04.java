package ch02;

import java.util.Scanner;

public class Ch02Ex02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요.>");
		
		String a =scanner.nextLine();
		String a1 =scanner.nextLine();
		String a2 =scanner.nextLine();
		String a3 =scanner.nextLine();

		int num =Integer.parseInt(a);
		int num1 =Integer.parseInt(a1);
		int num2 =Integer.parseInt(a2);
		int num3 =Integer.parseInt(a3);
		
		int c = num-num1;
		int b = num2-num3;
		
		System.out.printf("%d - %d = %d%n",num,num1,c);
		System.out.printf("%d - %d = %d%n",num2,num3,b);

	}

}
