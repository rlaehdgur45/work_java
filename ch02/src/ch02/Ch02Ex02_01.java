package ch02;

import java.util.Scanner;

public class Ch02Ex02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요.>");
		String strkor = scanner.nextLine();
		String strmat = scanner.nextLine();
		String streng = scanner.nextLine();
		
		int kor =Integer.parseInt(strkor);
		int mat =Integer.parseInt(strmat);
		int eng =Integer.parseInt(streng);
		
		int sum = kor + mat + eng ;
		int avg = (kor + mat + eng) /3;
		
		System.out.printf("kor %d%nmat %d%neng %d%n",kor,mat,eng);
		System.out.printf("sum %d%navg %d%n",sum,avg);

	}

}
