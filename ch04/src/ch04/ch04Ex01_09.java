package ch04;

import java.util.Scanner;

public class ch04Ex01_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 하나를 입력해 주세요.>");
		String[] tmp1 = scanner.nextLine().split(" ");
		
		int num1 = Integer.parseInt(tmp1[0]);
		int num2 = Integer.parseInt(tmp1[1]);
		int num3 = Integer.parseInt(tmp1[2]);
		
		if(num1 <num2) {
			if(num1<num3) {
				System.out.println(num1);
			}
			else {
				System.out.println(num3);
			}
		}
		else{
			System.out.println(num2);
		}

	}

}
