package ch04;

import java.util.Scanner;

public class FlowEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("현재 월을 입력하세요.>");
		
		Scanner scanner= new Scanner(System.in);
		String tmp = scanner.nextLine();
		int month= Integer.parseInt(tmp);
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("현재 계절은 봄입니다.");
			break;
			
		case 6: case 7: case 8:
			System.out.println("현재 계절은 여름입니다.");
			break;
			
		case 9: case 10: case 11:
			System.out.println("현재 계절은 가을 입니다.");
			break;
			
		
		case 12: case 1: case 2:
			System.out.println("현재 계절은 겨울입니다.");
			break;
			
		default:
			System.out.println("유효한 값을 입력해주세요.");
		}
		
		
		
		

	}

}
