package ch05;

import java.util.Scanner;

public class ch05Ex02_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<4; i++) {
			System.out.print(i+1+"class?");
			Scanner scanner = new Scanner(System.in);
			String[] str = scanner.nextLine().split(" ");
			int sum=0;
			sum+=Integer.parseInt(str[0]);
			sum+=Integer.parseInt(str[1]);
			sum+=Integer.parseInt(str[2]);
			System.out.println(i+1+"class:"+sum);
		}

	}

}
