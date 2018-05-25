package ch02;

import java.util.Scanner;

public class Ch02Ex02_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요.>");
		String num = scanner.nextLine();
		String input = scanner.nextLine();
		float num1 = Float.parseFloat(num);
		float num2 = Float.parseFloat(input);
		
		double a1 = num1 * 91.44;
		double a2 = num2 * 2.54;
		
		System.out.printf("%4.1fyd = %5.1fcm\n",num1,a1);
		System.out.printf("%4.1fin = %5.1fcm\n",num2,a2);

	}

}
