package ch04;

import java.util.Scanner;

public class ch04Ex02_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] tmp = scanner.nextLine().split(" ");
		int num1 = Integer.parseInt(tmp[0]);
		int num2 = Integer.parseInt(tmp[1]);
		
		int sum=0;
		for(int i=1; i<=num1; i++) {
			for(int j=1; j<=num2;j++) {
				sum=i*j;
				System.out.print(sum+" ");
			}System.out.println();
		}

	}

}
