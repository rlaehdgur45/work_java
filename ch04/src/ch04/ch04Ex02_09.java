package ch04;

import java.util.Scanner;

public class ch04Ex02_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		int num = Integer.parseInt(tmp);
		int sum =0;
		float avg = 0;
		int count=0;
		
		while(0<=num && num<=100) {
			
			sum+=num;
			count++;
			tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
		}
		avg=(float)sum/count;
		System.out.printf("sum:%d%navg:%.1f",sum,avg);

	}

}
