package ch04;

import java.util.Scanner;

public class ch04Ex02_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());



		/*for(int i = 0; i< 5; i++) {
			for(int j =0; j<num; j++) {
				if(i>=j) {
					if(i==3 && j==0) {
						System.out.print(" ");
					}
					else if(i==4 && j<=1) {
						System.out.print(" ");
					}
					else {
					System.out.print("#");
					}
				}


			}System.out.println();
		}*/
		//틀 작성 (2n-1행, n행열)
		for(int i =0; i<num*2; i++) {
			if(i<num) {
				for(int j =0; j<= i; j++) {
					System.out.print("#");
				}
			}
			else {
				for(int j =0; j<num; j++) {
					int limit = i% num +1;
					if(j<limit) {
						System.out.print(" ");
					}
					else {
						System.out.print("#");
					}
				}	
			}
			System.out.println();
		}


	}

}
