package ch04;

import java.util.Scanner;

public class ch04Ex02_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.printf("정수를 입력해주세요.>");
		String tmp = scanner.nextLine();
		int num = Integer.parseInt(tmp);

		for(int i=1; i<=num; i++) {

			
			System.out.print(i+" ");
		}

	}

}
