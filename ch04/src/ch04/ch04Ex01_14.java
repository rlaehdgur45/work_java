package ch04;

import java.util.Scanner;

public class ch04Ex01_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.print("1~12의 값을 입력해주세요.>");
		String tmp1 = scanner.nextLine();
		int num = Integer.parseInt(tmp1);
		
		if(1 <= num && num <= 12) {
			switch(num) {
			case 1: case 3: case 5:
			case 7: case 8: case 10:
			case 12:
				System.out.println("31");
				break;
			case 4: case 6: case 9:
			case 11:
				System.out.println("30");
				break;
			case 2:
				System.out.println("28");
				break;
				
			}
		}

	}

}
