package ch04;

import java.util.Scanner;

public class ch04Ex01_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력해 주세요.>");

		int num = Integer.parseInt(scanner.nextLine());
		
		if(num >= 20) {
			System.out.println("adult");
		}
		else {
			System.out.printf("%d years later",20-num);
		}

	}

}
