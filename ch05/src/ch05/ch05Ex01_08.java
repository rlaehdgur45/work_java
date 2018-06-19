package ch05;

import java.util.Scanner;

public class ch05Ex01_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		
		int sum =0;
		double avg = 0f;
		int count=0;

		int[] su = new int[10];
		for(int i=0; i<tmp.length;i++) {
			int num = Integer.parseInt(tmp[i]);
			su[i]=num;
		}
		for(int i=0; i<10; i++) {
			if(i%2==0) {
				sum+=su[i];
			}
			else {
				count++;
				avg+=su[i];
			}
			
		}
		System.out.printf("%d%n%.1f",sum,avg/count);
		
		

	}

}
