package ch04;

import java.util.Scanner;

public class ch04Ex02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요.(0:종료)>");
		int num = Integer.parseInt(scanner.nextLine());
		
		do {
			if(num>0) {
				System.out.println("positive integer");
			}
			else if(num<0){
				System.out.println("negative number");
				
			}
			else {
				break;
			}
			System.out.print("정수를 입력해 주세요.(0:종료)>");
			num = Integer.parseInt(scanner.nextLine());
		}while(true);
		
		
		

	}

}
