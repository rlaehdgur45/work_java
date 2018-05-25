package ch02;

import java.util.Scanner;

public class Ch02Ex02_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("height=");
		String input = "height";
		String a = scanner.nextLine();
		int num =Integer.parseInt(a);
		System.out.printf("Your %s is %dcm.",input,num);

	}

}
