package ch05;

import java.util.Scanner;

public class ch05Ex02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		
		int odd =0;
		int even =0;
		int[] su=new int[tmp.length];
		
		for(int i=0; i<tmp.length;i++) {
			su[i]=Integer.parseInt(tmp[i]);
			if(i%2==0) {
				odd+=su[i];
			}
			else {
				even+=su[i];
			}
		}System.out.println(odd);
		System.out.println(even);
		

	}

}
