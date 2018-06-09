package ch04;

import java.util.Scanner;

public class ch04Ex02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int count =0;
		float avg = 0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("100이하 정수를 입력해주세요.>");
		String tmp = scanner.nextLine();
		int num = Integer.parseInt(tmp);
		while(num!=100) {
			sum+=num;
			count++;

			tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
		}
		sum+=num;
		count++;
		avg=(float)sum/count;
		System.out.printf("%d%n%.1f",sum,avg);
	}

}
