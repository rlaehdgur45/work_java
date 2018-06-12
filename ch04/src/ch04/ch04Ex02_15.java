package ch04;

import java.util.Scanner;

public class ch04Ex02_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		int num = Integer.parseInt(tmp);

		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {

				System.out.print("*");
			}System.out.println();
		}
		for(int a=1; a<=(num-1); a++) {
			for(int j=2; j>=a; j--) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
