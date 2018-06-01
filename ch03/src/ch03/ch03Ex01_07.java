package ch03;
import java.util.Scanner;

public class ch03Ex01_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String a = scanner.nextLine();
		String aa = scanner.nextLine();
		String aaa = scanner.nextLine();
		int num =Integer.parseInt(a);
		int num1 =Integer.parseInt(aa);
		int num2 = Integer.parseInt(aaa);
		
		System.out.printf("%b %b",num1 < num && num >num2 ,
				num1==num && num == num2);
		
		

	}

}
