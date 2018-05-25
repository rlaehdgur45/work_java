package ch02;

import java.util.Scanner;

public class Ch02Ex02_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("yard?");
		String num = scanner.nextLine();
		float num1 = Float.parseFloat(num);
		
		double a = num1*91.44;
		
		System.out.printf("%2.1fyard = %2.1fcm",num1,a);
	}

}
