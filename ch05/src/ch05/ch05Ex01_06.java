package ch05;

import java.util.Scanner;

public class ch05Ex01_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String[] str = scanner.nextLine().split(" ");
		int[] su = new int[10];
		for(int i=0; i<str.length;i++) {
			
			int num = Integer.parseInt(str[i]);
			su[i]=num;
			
		}
		
		
		for(int i=0; i<su.length-1;i++) {
			boolean chang = false;
			for(int j =0; j<su.length-1-i;j++) {
				if(su[j]> su[j+1]) {
					int tmp = su[j];
					su[j] = su[j+1];
					su[j+1] = tmp;
					chang =true;
				}
			}
		
			if(!chang) { break;}
		}
		
		
			System.out.print(su[0]);
			System.out.println();
		
		
		
		

	}

}
