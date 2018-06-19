package ch05;

import java.util.Scanner;

public class ch05Ex01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");

		String str =" ";

		for(int i=0; i<tmp.length; i++) {
			str+=tmp[i];
		}
		System.out.print(str);*/

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		
		char[] result = new char[tmp.length];
		for(int i=0; i<tmp.length; i++) {
			
			result[i]=tmp[i].charAt(0);
			//charAt(0)으로 쓰는 이유는
			// tmp[]은 문자열 배열로 배열에 각각 문자열 한글자씩 저장되어있으므로
			// 0번째 이후로 값이 존재하지 않아 0으로 사용한다.
			
			System.out.print(result[i]);
		}System.out.println();
	}

}
