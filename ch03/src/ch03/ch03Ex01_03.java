package ch03;
import java.util.Scanner;

public class ch03Ex01_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String a = scanner.nextLine();
		String aa = scanner.nextLine();
		int num =Integer.parseInt(a);
		int num1 =Integer.parseInt(aa);
		
		--num1;
		int sum = num * num1;
		num++;
		System.out.printf("%d %d %d", num,num1,sum);


	}

}
