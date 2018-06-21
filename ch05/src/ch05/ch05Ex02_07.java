package ch05;

import java.util.Scanner;

public class ch05Ex02_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		int max=0 , min=0;
		int[] numbers = new int[100];

		for(int i=0; i<numbers.length;i++) {
			int tmp =Integer.parseInt(scanner.nextLine());
			numbers[i]=tmp;

		}
		for(int k=0; k<numbers.length;k++) {
			if(numbers[k]==999) {
				for(int i=0; i<numbers.length-1; i++) {
					boolean chang=false;
					for(int j=0; j<numbers.length-1-i;j++) {
						if(numbers[j]<numbers[j+1]) {
							int tmp =numbers[j];
							numbers[j]=numbers[j+1];
							numbers[j+1]=tmp;
							chang =true;
						}
					}
					if(!chang) {break;}
				}
			}
		}
		for(int i=0; i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}


	}

}
