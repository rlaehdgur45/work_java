package ch05;

import java.util.Scanner;

public class ch05Ex02_04 {

	public static void main(String[] args) {
		// 백개의 정수를 입력 받을수 있는 정수 선언
		int[] numbers = new int[100];

		Scanner scanner = new Scanner(System.in);
		String[] tmp = scanner.nextLine().split(" ");
		for(int i=0; i<numbers.length;i++) {
			numbers[i]=Integer.parseInt(tmp[i]);
			if(numbers[i]==-1) {
				System.out.print(numbers[i-3]+" "+numbers[i-2]+" "+numbers[i-1]);
				break;
			}
		}
	}

}
