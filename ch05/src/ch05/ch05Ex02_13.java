package ch05;

import java.util.Scanner;

public class ch05Ex02_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stream=new int[2];
		
		Scanner scanner =new Scanner(System.in);
		String[] tmp = scanner.nextLine().split(" ");
		
		stream[0]=Integer.parseInt(tmp[0]);
		stream[1]=Integer.parseInt(tmp[1]);
		
		for(int i=2; i<=10; i++) {
			if(i==stream.length) {
				int[] db=new int[stream.length * 2];
				System.arraycopy(stream, 0, db, 0, stream.length);
				stream=db;
	
			}
			int result = (stream[i-2]+stream[i-1])%10;
			stream[i]=result;
		}
		for(int i =0; i<10;i++) {
			System.out.print(stream[i]+" ");
		}
		
		
		

	}

}
