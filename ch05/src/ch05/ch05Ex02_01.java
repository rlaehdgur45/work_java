package ch05;

import java.util.Scanner;

public class ch05Ex02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		char[] ch=scanner.nextLine().toCharArray();
		
		for(int i=ch.length; i>0;i--) {
			System.out.print(ch[i-1]);
		}
		/*Scanner scanner = new Scanner(System.in);
		 * String[] chars =scanner.nextLine().split(" ");
		 * 
		 * for(int i=ch.length; i>0;i--){
		 * System.out.print(ch[i-1]);
		 * }
		 */
	}

}
