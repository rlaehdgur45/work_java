package ch04;

import java.util.Scanner;

public class ch04Ex01_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 하나를 입력해 주세요.>");
		String tmp = scanner.nextLine();
		int year = Integer.parseInt(tmp);
		
		if(year%400==0 || 
				(year %4 ==0 && year %100 != 0)) {
			System.out.println("leap year");
		}
		else {
			System.out.println("common year");
		}

	}

}
