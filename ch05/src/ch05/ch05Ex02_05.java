package ch05;

import java.util.Scanner;

public class ch05Ex02_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] tmp = scanner.nextLine().split(" ");
		double[] num = new double[tmp.length];


		double sum=0f;
		for(int i=0; i<tmp.length; i++) {
			num[i]=Double.parseDouble(tmp[i]);
	
			sum+=num[i];
		}
		
		System.out.printf("%.1f",sum/tmp.length);
		
		

	}

}
