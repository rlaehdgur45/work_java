package ch05;

import java.util.Scanner;

public class ch05Ex01_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		
		int sum =0;
		
		/*int avg =0;
		int count=0;
		
		for(int i =0; i< tmp.length; i++) {
			//홀수번째 입력된 값일경우
			if(i%2==0) {
				avg+= Integer.parseInt(tmp[i]);
				count++;
			}
			//짝수번째 입력된 값일 경우
			else {
				sum+=Integer.parseInt(tmp[i]);
			}
			
		}
		// 3. 결과 출력하기
		System.out.printf("sum:%d%n",sum);
		System.out.printf("avg:%.1f%n",avg/(double)count);*/
		double avg = 0f;
		int count=0;

		int[] su = new int[10];
		for(int i=0; i<tmp.length;i++) {
			int num = Integer.parseInt(tmp[i]);
			su[i]=num;
		}
		for(int i=0; i<10; i++) {
			if(i%2==0) {
				count++;
				avg+=su[i];
				
			}
			else {
				sum+=su[i];
			}
			
		}
		System.out.printf("%d%n%.1f",sum,avg/count);
		
		

	}

}
