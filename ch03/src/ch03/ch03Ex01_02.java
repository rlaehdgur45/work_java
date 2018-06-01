package ch03;
import java.util.Scanner;

public class ch03Ex01_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		int num =Integer.parseInt(a);
		
		System.out.printf("%d%n",num++);
		System.out.printf("%d",++num);
		

	}

}
