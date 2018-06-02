package ch03;
import java.util.Scanner;

public class ch03Ex02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		//String[] numbers =scanner.nextLine().split(" ");
		//int num= Integer.parseInt(numbers[0]);
		//int num1= Integer.parseInt(numbers[1]);
		
		String a = scanner.nextLine();
		String aa = scanner.nextLine();
		int num =Integer.parseInt(a);
		int num1 =Integer.parseInt(aa);
		
		System.out.printf("%d/%d = %d...%d",num,num1,num/num1,num%num1);

	}

}
