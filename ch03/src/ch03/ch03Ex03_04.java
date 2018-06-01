package ch03;
import java.util.Scanner;

public class ch03Ex03_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String a = scanner.nextLine();
		String aa = scanner.nextLine();
		String aaa = scanner.nextLine();
		double num =Double.parseDouble(a);
		double num1 =Double.parseDouble(aa);
		double num2 =Double.parseDouble(aaa);
		double su = (num+num1+num2)/3;// 입력받은 실수합의 평균
		
		//num=(int)num;//int형으로 형변환
		//num1=(int)num1;//int형으로 형변환
		//num2=(int)num2;//int형으로 형변환
		int sum = (int)num + (int)num1 + (int)num2;
		//세 수의 합을 구한뒤 int형으로 형변환 
		
		System.out.printf("sum=%d%navg=%.0f",sum,su);//출력
		

	}

}
