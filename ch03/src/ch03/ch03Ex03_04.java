package ch03;
import java.util.Scanner;

public class ch03Ex03_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String[] numbers = scanner.nextLine().split(" ");
		double num =Double.parseDouble(numbers[0]);
		double num1 =Double.parseDouble(numbers[1]);
		double num2 =Double.parseDouble(numbers[2]);
		double su = (num+num1+num2)/3;// 입력받은 실수합의 평균
		
		//num=(int)num;//int형으로 형변환
		//num1=(int)num1;//int형으로 형변환
		//num2=(int)num2;//int형으로 형변환
		int sum = (int)num + (int)num1 + (int)num2;
		//세 수의 합을 구한뒤 int형으로 형변환 
		
		System.out.printf("sum=%d%navg=%.0f",sum,su);//출력
		

	}

}
