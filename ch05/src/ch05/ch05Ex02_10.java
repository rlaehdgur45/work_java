package ch05;

import java.util.Scanner;

public class ch05Ex02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String tmp1 = scanner.nextLine();
		String[] tmp2 = scanner.nextLine().split(" ");

		int[] su2=new int[Integer.parseInt(tmp1)];

		for(int i=0; i<su2.length; i++) {
			su2[i]=Integer.parseInt(tmp2[i]);
		}
		for(int i=0; i<su2.length-1; i++) {
			boolean chang = false;
			for(int j =0; j<su2.length-1-i;j++) {
				if(su2[j]< su2[j+1]) {
					int tmp = su2[j];
					su2[j] = su2[j+1];
					su2[j+1] = tmp;
					chang =true;
				}
			}

			if(!chang) { break;}

		}
	
	for(int i=0; i<su2.length; i++) {
		System.out.println(su2[i]);
	}

}

}
