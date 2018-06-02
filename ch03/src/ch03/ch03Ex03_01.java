package ch03;
import java.util.Scanner;

public class ch03Ex03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String[] numbers = scanner.nextLine().split(" ");
		double num =Double.parseDouble(numbers[0]);
		double num1 =Double.parseDouble(numbers[1]);
		int sum = (int) (num*num1); // 입력 받은 두값을 곱한뒤 int형으로 형변환
		//num = (int)num;//double형 num을 int형으로 형변환
		//num1 = (int)num1;//double형 num1을 int형으로 형변환
		int sum1 = (int)num * (int)num1;// 형변환 시킨 두값을 곱한뒤 다시 형변환
		System.out.printf("%d %d",sum,sum1);//출력

	}

}
