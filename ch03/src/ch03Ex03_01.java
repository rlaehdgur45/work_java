import java.util.Scanner;

public class ch03Ex03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String a = scanner.nextLine();
		String aa = scanner.nextLine();
		double num =Double.parseDouble(a);
		double num1 =Double.parseDouble(aa);
		int sum = (int) (num*num1); // 입력 받은 두값을 곱한뒤 int형으로 형변환
		num = (int)num;//double형 num을 int형으로 형변환
		num1 = (int)num1;//double형 num1을 int형으로 형변환
		int sum1 = (int)(num*num1);// 형변환 시킨 두값을 곱한뒤 다시 형변환
		System.out.printf("%d %d",sum,sum1);//출력

	}

}
