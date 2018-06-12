package ch04;

import java.util.Scanner;

public class ch04Ex01_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 하나를 입력해 주세요.>");
		int year = Integer.parseInt(
				scanner.nextLine());
		//boolean case1 = year%400==0;
		//boolean case2 = year %4 ==0 && year %100 != 0;
		//if(case1 || case2)
		if(year%400==0 || 
				(year %4 ==0 && year %100 != 0)) {
			System.out.println("leap year");
		}
		else {
			System.out.println("common year");
		}

	}

}
