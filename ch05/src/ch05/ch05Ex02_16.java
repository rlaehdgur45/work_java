package ch05;

import java.util.Scanner;

public class ch05Ex02_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 입력받아 저장할 배열 2개 생성
				int[][] a1= new int[2][3];
				int[][] a2= new int[2][3];
				

				System.out.println("first array");
				//a1 배열에 입력받은 값을 저장
				for(int j =0;j<a1.length;j++) {

					//2.정수 입력 받기
					Scanner scanner =new Scanner(System.in);
					String[] number = scanner.nextLine().split(" ");

					//3.입력받은 정수를 a?배열에 저장
					for(int i =0; i<number.length;i++) {
						a1[j][i]=Integer.parseInt(number[i]);

					}

				}
				System.out.println("second array");
				//a2 배열에 입력받은 값을 저장
				for(int j =0;j<a2.length;j++) {

					//2.정수 입력 받기
					Scanner scanner =new Scanner(System.in);
					String[] number = scanner.nextLine().split(" ");

					//3.입력받은 정수를 a?배열에 저장
					for(int i =0; i<number.length;i++) {
						a2[j][i]=Integer.parseInt(number[i]);

					}

				}
				
				//4.출력하기
				for(int i=0; i<a1.length;i++) {
					for(int j=0; j<a1[i].length;j++) {
						System.out.print(a1[i][j]*a2[i][j] + " ");
					}System.out.println();
				}
		

	}

}
