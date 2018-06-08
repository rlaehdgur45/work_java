package ch04;

import java.util.Scanner;

public class ch04Ex01_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 하나를 입력해 주세요.>");
		String tmp = scanner.nextLine();
		int num = Integer.parseInt(tmp);
		
		if(num ==0) {
			System.out.println("zere");
		}
		else if(num > 0) {
			System.out.println("plus");
		}
		else {
			System.out.println("minus");
		}

	}

}
