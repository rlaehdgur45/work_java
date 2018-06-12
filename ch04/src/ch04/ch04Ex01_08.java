package ch04;

import java.util.Scanner;

public class ch04Ex01_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자 하나를 입력해 주세요.>");
		Scanner scanner = new Scanner(System.in);
		
		String tmp = scanner.nextLine();
		float num = Float.parseFloat(tmp);
		
		switch((int)num) {
		case(int)4.0 :
			System.out.println("scholarship");
			break;
		case(int)3.0:
			System.out.println("next semester");
			break;
		case(int)2.0: 
			System.out.println("seasonal semester");
			break;
		default:
			System.out.println("retake");
			break;
		}

	}

}
