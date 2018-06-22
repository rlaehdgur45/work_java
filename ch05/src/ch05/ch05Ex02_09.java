package ch05;

import java.util.Scanner;

public class ch05Ex02_09 {

	public static void main(String[] args) {
		// 
		int[] numbers = new int[2];
		
		int i=0;
		while(true) {
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());
			
			if(i == numbers.length) {
				int[] tmp= new int[numbers.length*2];
				System.arraycopy(numbers, 0, tmp, 0, numbers.length);
				numbers=tmp;
			}
			
			numbers[i] =num;
			if(numbers[i]==0) {
				break;
			}
			
			i++;
			
			
		}
		
		//현재 i값은 배열에 입력된 정수의 개수와 같으므로 i값을 출력
		System.out.println(i);
		
		//numbers 배열에 입력된 값을 하나씩 끄집어 낸다.
		for(int j=0; j< numbers.length;j++) {
			//끄집어 낸 값이 0일 경우는 반복문을 종료
			if(numbers[j]==0) {
				break;
			}
			//홀수일 경우는 곱하기 2, 짝수일 경우는 나누기 2한 몫을 출력
			System.out.print((numbers[j]%2 !=0 ? numbers[j] *2:numbers[j]/2)+" ");
		}
		
		/*Scanner scanner = new Scanner(System.in);
		int[] numbers=new int[6];
		int count=0;
		for(int i=0; i<numbers.length;i++) {
			int num=Integer.parseInt(scanner.nextLine());
			numbers[i]=num;
			count++;
			if(num==0) {
				break;
			}

		}
		for(int j=0; j<count-1;j++) {
			if(numbers[j]%2==0) {
				numbers[j]=numbers[j]/2;
			}
			else {
				numbers[j]=numbers[j]*2;
			}
		}
		System.out.println(count-1);
		System.out.print(numbers[count-6]+" "+numbers[count-5]+" "+numbers[count-4]+" "+
				numbers[count-3]+" "+numbers[count-2]);*/
		
	}

}
