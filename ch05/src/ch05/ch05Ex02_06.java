package ch05;

import java.util.Scanner;

public class ch05Ex02_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch1= {'A','P','P','L','E','!'};
		
		Scanner scanner = new Scanner(System.in);
		
		char ch2=scanner.nextLine().charAt(0);
		
		for(int i=0; i<ch1.length; i++) {
			if(ch1[i]==ch2) {
				System.out.print(i + " ");
				//break;
			}
			else if(i==ch1.length && ch1[i]!=ch2) {
				System.out.println("none");
			}
			
		}
		
		

	}

}
