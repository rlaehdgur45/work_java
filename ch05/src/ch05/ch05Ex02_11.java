package ch05;

import java.util.Scanner;

public class ch05Ex02_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] tmp = scanner.nextLine().split(" ");
		int[] numbers=new int[tmp.length];
		int[] counter =new int[7];
		int num=0;
		
		for(int i=0; i<tmp.length; i++) {
			numbers[i] = Integer.parseInt(tmp[i]);
			num=numbers[i];
			counter[num]++;
		}
		for(int i= 1; i<counter.length;i++) {
			System.out.println(i+":"+counter[i]);
		}
		
		
		
		
		

	}

}
