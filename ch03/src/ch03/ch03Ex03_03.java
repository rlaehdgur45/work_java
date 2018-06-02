package ch03;
import java.util.Scanner;

public class ch03Ex03_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String[] numbers = scanner.nextLine().split(" ");
		int num =Integer.parseInt(numbers[0]);
		int num1 =Integer.parseInt(numbers[1]);
		int num2 =Integer.parseInt(numbers[2]);
		//int sum = num+num1+num2;// 3과목의 합
		//float su = (float)sum/3;// 평균을 구한뒤 float 타입으로 형변환
		
		double avg = (num+num1+num2)/3.0;
		System.out.printf("%.1f",avg); // 소수 첫째자리까지 출력
		
		
		
		

	}

}
