package ch04;

import java.util.Scanner;

public class ch04Ex01_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 하나를 입력해 주세요.>");
	
		float num = Float.parseFloat(scanner.nextLine());
		
		if(num<=50.80) {
			System.out.println("Flyweight");
		}
		else if(num<=61.23) {
			System.out.println("Lightweight");
		}
		else if(num<=72.57) {
			System.out.println("Middleweight");
		}
		else if(num<=88.45) {
			System.out.println("Cruiserweight");
		}
		else {
		System.out.println("Heavyweight");
		}

	}

}
