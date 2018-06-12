package ch04;

import java.util.Scanner;

public class ch04Ex01_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 하나를 입력해 주세요.>");
		String[] tmp1 = scanner.nextLine().split(" ");
		
		int num1 = Integer.parseInt(tmp1[0]);
		int num2 = Integer.parseInt(tmp1[1]);
		
		if(num1 <num2) {
			System.out.printf("%d",num2-num1);
		}
		else {
			System.out.printf("%d",num1-num2);
		}
		//번외 메소드 이용해서 구하는 방법
		//***Math.abs():절대값 리턴하는 메소드***
		//System.out.println(Math.abs(num1-num2));
	}

}
