package ch04;

import java.util.Scanner;

public class ch04Ex02_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.printf("1.korea%n2.USA%n3.Japan%n4.China%nnumber?");
		String tmp = scanner.nextLine();
		int num = Integer.parseInt(tmp);
		
		do {
			if(num==1) {
				System.out.println("Seoul");
				break;
			}
			else if(num==2) {
				System.out.println("Washington");
				break;
			}
			else if(num==3) {
				System.out.println("Tokyo");
				break;
			}
			else if(num==4){
				System.out.println("Beijing");
				break;
			}
			else {
				System.out.println("none");
				break;
			}
		}while(num>=1 && num<5);

	}

}
