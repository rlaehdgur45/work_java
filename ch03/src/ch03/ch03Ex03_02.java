package ch03;
import java.util.Scanner;

public class ch03Ex03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String a = scanner.nextLine();
		String aa = scanner.nextLine();
		int num =Integer.parseInt(a);
		int num1 =Integer.parseInt(aa);
		float su = (float)num;//입력 받은 첫번째 값을 float타입으로 형변환
		
		System.out.printf("%d %.2f",num/num1,su/num1);
		//출력
		
		
		



	}

}
