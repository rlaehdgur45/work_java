package ch03;
import java.util.Scanner;

public class ch03Ex02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String a = scanner.nextLine();
		String aa = scanner.nextLine();
		String aaa = scanner.nextLine();
		String aaaa = scanner.nextLine();
		int num =Integer.parseInt(a);
		int num1 =Integer.parseInt(aa);
		int num2 =Integer.parseInt(aaa);
		int num3 =Integer.parseInt(aaaa);
		
		boolean su = (num>num2 && num1>num3);
		
		//if (su==false) {
			//System.out.println("0");
		//}
		
		System.out.printf("%b",su);

	}

}
