import java.util.Scanner;

public class ch03Ex01_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String a = scanner.nextLine();
		String aa = scanner.nextLine();
		int num =Integer.parseInt(a);
		int num1 =Integer.parseInt(aa);

		System.out.printf("4>5---%b%n",num>num1);
		System.out.printf("4<5---%b%n",num<num1);
		System.out.printf("4>=5---%b%n",num>=num1);
		System.out.printf("4<=5---%b%n",num<=num1);

	}

}
