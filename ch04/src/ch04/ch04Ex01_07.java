package ch04;

import java.util.Scanner;

public class ch04Ex01_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.print("영문자 하나를 입력해 주세요>");
		String tmp1 = scanner.nextLine();
		char num=tmp1.charAt(0);
		
		if(num=='A') {
			System.out.println("Excellent");
		}
		else if(num=='B') {
			System.out.println("Good");
		}
		else if(num=='C') {
			System.out.println("Usually");
		}
		else if(num=='D') {
			System.out.println("Effort");
		}
		else if(num=='F') {
			System.out.println("Failure");
		}
		else {
			System.out.println("error");
		}

	}

}
