package ch04;

import java.util.Scanner;

public class ch04Ex02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		int num = Integer.parseInt(tmp);
		int sum =0;

		while(num !=0){
			if(!(num%3==0 || num%5==0)) {
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);
			}
			else {
				sum++;
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);
			}
		}
		System.out.println(sum);


	}

}
