package ch05;

import java.util.Scanner;

public class ch05Ex01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String[] tmp = scanner.nextLine().split(" ");
		
		String str =" ";
		
		for(int i=0; i<10; i++) {
			str+=tmp[i];
		}
		System.out.print(str);
	}

}
