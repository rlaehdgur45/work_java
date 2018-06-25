package ch05;

import java.util.Scanner;

public class ch05Ex02_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] str=new char[3][5];
		
		for(int j=0; j<str.length;j++) {
			Scanner scanner = new Scanner(System.in);
			String[] tmp = scanner.nextLine().split(" ");

			for(int i=0; i<tmp.length;i++) {
				str[j][i]=tmp[i].charAt(0);
				
			}

		}
		for(int i=0; i<str.length;i++) {
			for(int j=0; j<str[i].length;j++) {
				System.out.print((char)(str[i][j]+32)+ " ");
				/*int su1=0;
				su1=(int)str[i][j]+32;
				str[i][j]=(char)su1;
				System.out.print(str[i][j]+ " ");
				*/
			}System.out.println();
		}
		
		
		
		
		
		
	}

}
