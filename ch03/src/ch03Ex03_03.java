import java.util.Scanner;

public class ch03Ex03_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String a = scanner.nextLine();
		String aa = scanner.nextLine();
		String aaa = scanner.nextLine();
		int num =Integer.parseInt(a);
		int num1 =Integer.parseInt(aa);
		int num2 =Integer.parseInt(aaa);
		int sum = num+num1+num2;// 3과목의 합
		float su = (float)sum/3;// 평균을 구한뒤 float 타입으로 형변환
		System.out.printf("%.1f",su); // 소수 첫째자리까지 출력
		
		
		
		

	}

}
