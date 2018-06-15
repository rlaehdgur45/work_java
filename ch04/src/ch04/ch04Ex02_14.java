package ch04;

import java.util.Scanner;

public class ch04Ex02_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] tmp = scanner.nextLine().split(" ");
		int num1 = Integer.parseInt(tmp[0]);
		int num2 = Integer.parseInt(tmp[1]);
		
		/*for(int i=1; i<=num1;i++) {
			for(int j=5; j>=num2;j--) {
				System.out.printf("%d * %d =  %d\t",j,i,j*i);
			}System.out.println();
		}*/
		
		//2. 단순하게 코드를 두 부분으로 나누기
		//2.1. 첫번째 수가 작고 두번째 수가 클경우
		if(num1<num2) {
			//3. 틀작성
			for(int i =1; i <=9; i++) {
				for(int j= num1; j<=num2; j++) {
					System.out.printf("%d * %d = %3d   ",j,i,j*i);
				}System.out.println();
			}
		}
		else if(num1>num2) {
			for(int i =1; i <=9; i++) {
				for(int j= num1; j>=num2; j--) {
					System.out.printf("%d * %d = %3d   ",j,i,j*i);
				}System.out.println();
			}
		}
	}

}
