package ch05;

import java.util.Scanner;

public class ch05EX01_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		
		int[] su= new int[100];


		for(int i=0; i<tmp.length; i++) {
			int num= Integer.parseInt(tmp[i]);
			su[i]=num;
			if(su[i]==0) {
				for(int j=tmp.length-2; j>=0;j--) {
					System.out.print(su[j]+" ");
				}
				
			}
		}
		
	}

}
