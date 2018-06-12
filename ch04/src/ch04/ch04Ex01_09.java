package ch04;

import java.util.Scanner;

public class ch04Ex01_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] tmp1 = scanner.nextLine().split(" ");
		
		int num1 = Integer.parseInt(tmp1[0]);
		int num2 = Integer.parseInt(tmp1[1]);
		int num3 = Integer.parseInt(tmp1[2]);
		
		/*if(num1 <num2 ) {
			if(num1<num3) {
				System.out.println(num1);
			}
			else {
				System.out.println(num3);
			}
		}
		else{
			System.out.println(num2);
		}*/
		
		int min01 = num1 < num2 ? num1:num2;
		int min02 = min01< num3 ? min01:num3;
		
		System.out.println(min02);

	}

}
