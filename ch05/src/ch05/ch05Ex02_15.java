package ch05;

import java.util.Scanner;

public class ch05Ex02_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*for(int i=0; i<4; i++) {
			System.out.print(i+1+"class?");
			Scanner scanner = new Scanner(System.in);
			String[] str = scanner.nextLine().split(" ");
			int sum=0;
			sum+=Integer.parseInt(str[0]);
			sum+=Integer.parseInt(str[1]);
			sum+=Integer.parseInt(str[2]);
			System.out.println(i+1+"class:"+sum);*/

		int [][] score =new int[4][3];
		for(int i=0; i<score.length;i++) {
			
			System.out.printf("%dclass? ",i+1);
			
			Scanner scanner =new Scanner(System.in);
			
			String[] numbers=scanner.nextLine().split(" ");
			
			for(int j=0; j<score[i].length;j++) {
				score[i][j]=Integer.parseInt(numbers[j]);

			}
		}
		for(int i=0; i< score.length;i++) {
			int sum=0;
			for(int j=0; j<score[i].length; j++) {
				sum+=score[i][j];
			}
			System.out.printf("%dclass : %d%n",i+1,sum);
		}

	}

}
