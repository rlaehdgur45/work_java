package ch04;

import java.util.Scanner;

public class ch04Ex01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 하나를 입력해 주세요.>");
		int num = Integer.parseInt(scanner.nextLine());
		
		
		if(num < 0) {
			System.out.printf("%d%n minus",num);
		}
		else {
			System.out.println(num);
		}

	}

}
