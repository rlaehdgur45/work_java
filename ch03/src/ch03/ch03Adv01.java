package ch03;

import java.util.Scanner;

public class ch03Adv01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String[] numbers = scanner.nextLine().split(" ");
		int num1 = Integer.parseInt(numbers[0]);
		int num2 = Integer.parseInt(numbers[1]);
		int su1 = 0;
		int su2 = 0;
		
		/*boolean dd = (num1 == 0 && num2 ==0) ? 
				(System.exit(0)): ((num1 <=1000 && num2 <= 4000) ? 
						(num1 %6 ==0 && num2 %6 ==0) ? true:(System.out.println("0"))):
					(System.out.println("INPUT ERROR!")));
				
		System.out.println(su1);
		*/
		//System.out.printf("강아지 :%d 병아리 :%d ", num1%6,num2%6);
		

	}


}
