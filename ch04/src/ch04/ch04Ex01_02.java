package ch04;

import java.util.Scanner;

public class ch04Ex01_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.print("키와 몸무게를 입력해주세요.>");
		String[] tmp1 = scanner.nextLine().split(" ");
		int stature=Integer.parseInt(tmp1[0]);
		int weight=Integer.parseInt(tmp1[1]);
		int obesity = weight+100 -stature;
		
		if(obesity > 0) {
			System.out.printf("%d%nobesity",obesity);
		}
		else {
			System.out.println(obesity);
		}
		
		
		

	}

}
