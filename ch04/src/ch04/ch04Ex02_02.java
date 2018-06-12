package ch04;

import java.util.Scanner;

public class ch04Ex02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~100이하의 양의 정수를 입력해 주세요.>");
		String tmp = scanner.nextLine();
		int num = Integer.parseInt(tmp);
		int su=0;
		while(!(num <=100 && num >0)) {
			System.out.print("1~100이하의 양의 정수를 입력해 주세요.>");
			tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
		}
		for(int i=1; i<=num; i++) {
			su+=i;
			System.out.print(i+" ");
		}System.out.print(su);

	}

}
