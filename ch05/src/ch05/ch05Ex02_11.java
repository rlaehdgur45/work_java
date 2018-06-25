package ch05;

import java.util.Scanner;

public class ch05Ex02_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] tmp = scanner.nextLine().split(" ");
		int[] numbers=new int[tmp.length];
		int[] counter =new int[6];
		int num=0;
		
		for(int i=0; i<tmp.length; i++) {
			numbers[i] = Integer.parseInt(tmp[i]);
			num=numbers[i];
			//주사위 눈의 수 -1 한 ㅓㅅ은 인덱스 번화와 일치
			//해당 counter배열 인덱스에 1증가
			counter[num-1]++;
		}
		for(int i= 0; i<counter.length;i++) {
			System.out.println(i+1+":"+counter[i]);
		}
		
		
		
		
		

	}

}
