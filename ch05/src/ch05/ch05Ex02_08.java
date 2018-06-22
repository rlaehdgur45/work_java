package ch05;

import java.util.Scanner;

public class ch05Ex02_08 {

	public static void main(String[] args) {
		// 
		int[] numbers=new int[2];

		int i=0;
		while(true){
			Scanner scanner = new Scanner(System.in);
			int num= Integer.parseInt(scanner.nextLine());

			if(i== numbers.length) {
				int[] tmp=new int[numbers.length*2];
				System.arraycopy(numbers, 0, tmp, 0, numbers.length);
				numbers=tmp;
			}
			numbers[i]=num;
			if(numbers[i]==0) {
				break;
			}
			i++;
		}
		int multiplesOfFive=0;
		int sum =0;
		for(int j=0; j<numbers.length;j++) {
			
			if(numbers[j] ==0) {
				break;
			}
			if(numbers[j] %5==0) {
				multiplesOfFive++;
				sum+=numbers[j];
			}
		}
		System.out.println("Multiples Of 5 :"+multiplesOfFive);
		System.out.println("sum :"+sum);
		System.out.printf("avg %.1f",sum/(double)multiplesOfFive);
		/*Scanner scanner = new Scanner(System.in);
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
		 */




	}
}

