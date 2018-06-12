package ch04;

import java.util.Scanner;

public class ch04Ex02_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.printf("1.korea%n2.USA%n3.Japan%n4.China%nnumber?");
		int num = Integer.parseInt(scanner.nextLine());
		
		/*switch(num) {
		case 1:
			System.out.println("Seoul");
			break;
		case 2:
			System.out.println("Washington");
			break;
		case 3:
			System.out.println("Tokyo");
			break;
		case 4:
			System.out.println("Beijing");
			break;
		default:
			System.out.println("none");
			break;
	
		}*/
		do {
			if(num==1) {
				System.out.println("Seoul");
				System.out.printf("1.korea%n2.USA%n3.Japan%n4.China%nnumber?");
				num = Integer.parseInt(scanner.nextLine());
				System.out.println();
			}
			else if(num==2) {
				System.out.println("Washington");
				System.out.printf("1.korea%n2.USA%n3.Japan%n4.China%nnumber?");
				num = Integer.parseInt(scanner.nextLine());
				System.out.println();
			}
			else if(num==3) {
				System.out.println("Tokyo");
				System.out.printf("1.korea%n2.USA%n3.Japan%n4.China%nnumber?");
				num = Integer.parseInt(scanner.nextLine());
				System.out.println();
			}
			else if(num==4){
				System.out.println("Beijing");
				System.out.printf("1.korea%n2.USA%n3.Japan%n4.China%nnumber?");
				num = Integer.parseInt(scanner.nextLine());
				System.out.println();
			}
			else {
				System.out.println("none");
				break;
			}
		}while(true);
		

		
	}

}
