package ch04;

import java.util.Scanner;

public class ch04Ex01_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
		System.out.print("성별(M,F)과 나이를 입력해주세요>");
		String[] tmp1 = scanner.nextLine().split(" ");
		int gender=Integer.parseInt(tmp1[0]);
		int age=Integer.parseInt(tmp1[1]);
		
		System.out.println(gender);

	}

}
