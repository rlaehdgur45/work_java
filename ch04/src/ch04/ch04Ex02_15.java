package ch04;

import java.util.Scanner;

public class ch04Ex02_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int num = Integer.parseInt(scanner.nextLine());

		//두부분으로 나눠서
		/*for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {

				System.out.print("*");
			}System.out.println();
		}
		for(int i=1; i<=(num-1); i++) {
			for(int j=num-1; j>=i; j--) {
				System.out.print("*");
			}System.out.println();
		}*/
		
		//한번에
		int i = 1;
		boolean isDese = false;
		while(i !=0) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i==num) {
				isDese = true;
			}
			if(!isDese) {
				i++;
			}
			else {
				i--;
			}
		}
	}

}
