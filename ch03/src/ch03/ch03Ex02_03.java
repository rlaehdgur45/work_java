package ch03;
import java.util.Scanner;

public class ch03Ex02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String a = scanner.nextLine();
		String aa = scanner.nextLine();
		int num =Integer.parseInt(a);
		int num1 =Integer.parseInt(aa);
		
		System.out.printf("%d %d%n",++num,num1--);
		System.out.printf("%d %d",num,num1);

	}

}
