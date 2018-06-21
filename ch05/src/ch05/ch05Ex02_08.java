package ch05;

import java.util.Scanner;

public class ch05Ex02_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] numbers=new int[100];
		int sum=0;
		int count =0;
		double avg=0f;
		int num=Integer.parseInt(scanner.nextLine());
		for(int i=0; i<numbers.length;i++) {
			numbers[i]=num;
			num=Integer.parseInt(scanner.nextLine());
			if(num==0) {
				break;
			}
		}
		for(int j=0; j<8-1;j++) {
			if(numbers[j]%5==0) {
				sum+=numbers[j];
				count++;
			}
		}
		avg=(double)sum/count;
		
		System.out.printf("Multiples of 5:%d%nsum:%d%navg:%.1f",count,sum,avg);
		
		
		
		

	}
}

