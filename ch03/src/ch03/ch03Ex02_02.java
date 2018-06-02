package ch03;
import java.util.Scanner;

public class ch03Ex02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		String[] numbers = scanner.nextLine().split(" ");
		int num =Integer.parseInt(numbers[0]);
		int num1 =Integer.parseInt(numbers[1]);
		
		num += 5; // num = num + 5;
		num1 *= 2;
		System.out.printf("width=%d%nlength=%d%narea=%d",num,
				num1,num*num1 );
		


	}

}
