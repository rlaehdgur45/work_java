package ch03;
import java.util.Scanner;

public class ch03Ex01_03 {

	private static String string;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String a = scanner.nextLine();
		String aa = scanner.nextLine();
		int num =Integer.parseInt(a);
		int num1 =Integer.parseInt(aa);
		
		//int num2 = Integer.parseInt(scanner.nextLine());
		
		int b = --num1;
		int c = num++;
		int sum = b * c;
		
		System.out.printf("%d %d %d", num,num1,sum);
		
		
		
		/*
		 * 우측 입력한뒤 ctrl +1 번을 누른뒤 두번째꺼 선택하면
		 * 지역변수를 쉽게 만들수있음
		 * 
		 */


	}

}
