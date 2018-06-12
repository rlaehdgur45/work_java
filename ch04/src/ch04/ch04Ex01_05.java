package ch04;

import java.util.Scanner;

public class ch04Ex01_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 하나를 입력해 주세요.>");
		String[] tmp1 = scanner.nextLine().split(" ");

		float num1 = Float.parseFloat(tmp1[0]);
		float num2 = Float.parseFloat(tmp1[1]);
		
		if(num1 >= 4.0 && num2 >= 4.0){
			System.out.println("A");
		}
		else if(num1 >= 3.0 && num2 >= 3.0) {
			System.out.println("B");
		}
		else {
			System.out.println("C");
		}

	}

}
