package ch04;

import java.util.Scanner;

public class ch04Ex02_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		int num = Integer.parseInt(tmp);
		int odd =0;
		int even = 0;
		while(num !=0){
			if(num%2==0) {
				even++;
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);
			}
			else {
				odd++;
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);
			}
		}
		System.out.println("odd:"+odd);
		System.out.println("even:"+even);
	}

}
