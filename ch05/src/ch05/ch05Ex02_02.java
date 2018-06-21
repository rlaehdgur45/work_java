package ch05;

import java.util.Scanner;

public class ch05Ex02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String[] str= scanner.nextLine().split(" ");
		int sum=0;
		int[] su=new int[str.length];
		
		for(int i=0; i<str.length; i++) {
			su[i]=Integer.parseInt(str[i]);
		}
		sum+=su[0]+su[2]+su[4];
		System.out.print(sum);
	}

}
