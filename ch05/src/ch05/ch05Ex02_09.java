package ch05;

import java.util.Scanner;

public class ch05Ex02_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] numbers=new int[6];
		int count=0;
		for(int i=0; i<numbers.length;i++) {
			int num=Integer.parseInt(scanner.nextLine());
			numbers[i]=num;
			count++;
			if(num==0) {
				break;
			}

		}
		for(int j=0; j<count-1;j++) {
			if(numbers[j]%2==0) {
				numbers[j]=numbers[j]/2;
			}
			else {
				numbers[j]=numbers[j]*2;
			}
		}
		System.out.println(count-1);
		System.out.print(numbers[count-6]+" "+numbers[count-5]+" "+numbers[count-4]+" "+
				numbers[count-3]+" "+numbers[count-2]);
		
	}

}
