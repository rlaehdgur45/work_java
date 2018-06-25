package ch05;

import java.util.Scanner;

public class ch05EX01_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[100];
		Scanner scanner = new Scanner(System.in);
		String[] str=scanner.nextLine().split(" ");
		for(int i=0; i<str.length; i++) {
			nums[i]=Integer.parseInt(str[i]);
			if(nums[i]==0) {
				for(int j=str.length-2;j>=0; j--) {
					System.out.println(nums[j]+" ");
				}
			}
		}
	}

}
