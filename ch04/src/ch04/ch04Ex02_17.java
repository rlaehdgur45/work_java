package ch04;

import java.util.Scanner;

public class ch04Ex02_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		int count=1;
		for(int i = 0; i< num; i++) {
			for(int j =0; j<num; j++) {
				if(i>j) {
					System.out.print("  ");

				}
				else {
					System.out.print(count %10 + " ");
					count++;
				}
			}System.out.println();
		}

		
	}

}
