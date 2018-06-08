package ch04;

import java.util.Scanner;

public class ch04Ex01_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 하나를 입력해 주세요.>");
		String tmp = scanner.nextLine();
		int su = Integer.parseInt(tmp);
		
		
		if(su ==1) {
			System.out.println("dog");
		}
		else if(su ==2) {
			System.out.println("cat");
		}
		else if (su ==3){
			System.out.println("chick");
		}
		else {
			System.out.println("I don't know");
		}

	}

}
