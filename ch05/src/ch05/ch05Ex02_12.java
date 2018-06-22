package ch05;

import java.util.Scanner;

public class ch05Ex02_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] counter= new int[11];
		while(true) {
			//2. 한줄에 하나씩 입력받기
			Scanner scanner = new Scanner(System.in);
			int num=Integer.parseInt(scanner.nextLine());

			//4. 0이 입력되면 반복문 종료
			if(num==0) {
				break;
			}

			//3. 십의 자리 수 구하기
			int ten =num / 10;
			counter[ten]++;
			

		}
		for(int i=10; i>0;i--) {
			if(counter[i]!=0) {
				System.out.println(i+"0:"+counter[i]+" person");
			}
		}
		
	}

}
