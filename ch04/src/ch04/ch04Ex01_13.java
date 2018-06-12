package ch04;

import java.util.Scanner;

public class ch04Ex01_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 하나를 입력해 주세요.>");
		int su = Integer.parseInt
				(scanner.nextLine());
		
		
		if(su ==1) {
			System.out.println("dog");
		}
		else if(su ==2) {
			System.out.println("cat");
		}
		else if (su ==3){
			System.out.println("chick");
		}
		else {
			System.out.println("I don't know");
		}
		
		/*switch(su) {
		case 1:
			System.out.println("dog");
			break;
		case 2:
			System.out.println("cat");
			break;
		case 3:
			System.out.println("chick");
			break;
		default:
			System.out.println("I don't know");
		}*/

	}

}
