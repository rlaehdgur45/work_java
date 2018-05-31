import java.util.Scanner;

public class ch03Ex01_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String a = scanner.nextLine();
		String aa = scanner.nextLine();
		int num =Integer.parseInt(a);
		int num1 =Integer.parseInt(aa);
		
		System.out.printf("%b %b",num==0 && num1==0 
				,num==0 || num1==0);

	}

}
