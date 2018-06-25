package ch05;

import java.util.Scanner;

public class ch05Ex01_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chars=new char[10];
		Scanner scanner = new Scanner(System.in);
		String[] tmp=scanner.nextLine().split(" ");
		
		for(int i=0; i<chars.length; i++) {
			chars[i]=tmp[i].charAt(0);
			
		}
		System.out.print(chars[0]+" "+chars[3]+" "+chars[6]);
		
		/*Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		
		System.out.printf("%s %s %s",tmp[0],tmp[3],tmp[6]);
		
*/



	}

}
