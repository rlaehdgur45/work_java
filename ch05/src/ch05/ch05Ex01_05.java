package ch05;

import java.util.Scanner;

public class ch05Ex01_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		
		double[] num= {
				85.6,79.5,83.1,80.0,78.2,75.0
		};
		
		double sum=0;
		int su=0;
		for(int i=0; i<tmp.length;i++){
			su=Integer.parseInt(tmp[i]);
			sum+=num[su-1];
		}System.out.printf("%.1f",sum);







	}

}
