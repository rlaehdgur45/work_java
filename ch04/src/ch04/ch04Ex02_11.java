package ch04;

import java.util.Scanner;

public class ch04Ex02_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		boolean su = true;
		float area=0;
		
		while(su==true) {
			
			System.out.print("Base=");
			String tmp1 = scanner.nextLine();
			System.out.print("Height=");
			String tmp2 = scanner.nextLine();
			int num1 = Integer.parseInt(tmp1);
			int num2 = Integer.parseInt(tmp2);
			area=(float)num1 * num2/2;
			System.out.printf("%.1f%n",area);
			System.out.print("Continue?");
			String tmp3 = scanner.nextLine();
			char[] num3 = tmp3.toCharArray();
			
			if(num3[0]!='y' && num3[0] != 'Y') {
				break;
			}
		}

	}

}
