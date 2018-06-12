package ch04;

import java.util.Scanner;

public class ch04Ex02_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		int num = Integer.parseInt(tmp);
		char a='0';
		char b='A';
		for (int i=0;i<num;i++){
			for (int j=0; j<num;j++)
			{
				if (i<=num/2)// 위쪽 영역
				{
						System.out.print(b);// *찍기
						b++;
				}
				else if (i>num/2) //아래쪽 영역
				{
					if (i-j>=num/2+1) //왼쪽 밑 공백
						System.out.print(b);
						
					else if (i+j>=num/2*3+1)//오른쪽 밑 공백
						System.out.print(a);
					else
						System.out.print(a);// *찍기
						a++;
					
				}
			}
			System.out.println();//줄바꿈
		}

	}

}
