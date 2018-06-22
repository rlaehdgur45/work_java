package ch05;

import java.util.Scanner;

public class ch05Ex02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String[] str= scanner.nextLine().split(" ");
		int sum=0;
		//문자열 배열인 str를 int형으로 변환하여 저장할 변수 su로 선언
		int[] su=new int[str.length];
		//str 배열에 있는 문자열을 하나씩 끄집어내어 int형으로 변경 후 su배열에 저장
		for(int i=0; i<str.length; i++) {
			su[i]=Integer.parseInt(str[i]);
		}
		//su의 첫번째, 세번째, 다섯번쨰 값을 끄집어내어서 sum에 합을 저장하고 출력
		sum+=su[0]+su[2]+su[4];
		System.out.print(sum);
	}

}
