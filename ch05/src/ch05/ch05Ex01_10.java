package ch05;

import java.util.Scanner;

public class ch05Ex01_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		char[] su = tmp.toCharArray();
		int count =0;
		for(int i=0; i<su.length;i++) {
			if(su[i]>='A' && su[i]<='Z') {
				
			}
			else {
				System.out.printf("%d:%d%n",su[i],count);
				break;
			}
		}
		
		
		

	}

}
