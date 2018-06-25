package ch05;

import java.util.Scanner;

public class ch05Ex02_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] tmp = new int[4][2];

		double avg=0;


		for(int j=0; j<tmp.length;j++) {
			Scanner scanner = new Scanner(System.in);
			String[] str = scanner.nextLine().split(" ");

			for(int i=0; i<str.length;i++) {
				tmp[j][i]=Integer.parseInt(str[i]);

			}

		}
		for(int i=0;i<tmp.length;i++) {

			int sum=0;
			sum+=tmp[i][0]+tmp[i][1]-1;
			System.out.printf("%.0f ",(double)sum/2);
			avg+=sum;

		}System.out.println();
		
			for(int j=0; j<2;j++) {
			int sum=0;
			sum+=tmp[0][j]+tmp[1][j]+tmp[2][j]+tmp[3][j];
			System.out.printf("%.0f ",(double)sum/4-1);
			}
			
		System.out.println();
		System.out.printf("%.0f",avg/8);





	}

}
