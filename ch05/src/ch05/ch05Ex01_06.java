package ch05;

import java.util.Scanner;

public class ch05Ex01_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] str=scanner.nextLine().split(" ");
		int[] nums=new int[10];

		for(int i=0; i<str.length;i++) {
			nums[i]=Integer.parseInt(str[i]);

		}
		for(int i=0; i<nums.length-1;i++) {
			boolean chang=false;
			for(int j=0; j<nums.length-1-i;j++) {
				if(nums[j]> nums[j+1]) {
					int tmp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = tmp;
					chang =true;
				}
			}
			if(!(chang))break; {

			}
			
			//1. 10개의 정수를 입력받기

			//2.가장 작은 수를 저장하는 변수 생성 (초기값은 배열의 첫번째 값)
			//int min = Integer.perseInt(str[0]);


			//if();

			//3.str 배열의 문자열 하나씩 끄집어 내기
			/*for(int i =1; i < str.length; i++) {
			int num = Integer.parseInt(str[i]);
			min = min<num ? min:num;*/
		}
		System.out.print(nums[0]);
	}
}
