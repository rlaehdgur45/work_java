package ch05;

import java.util.Scanner;

public class ch05Ex01_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] str = scanner.nextLine().split(" ");
		//1-1.
		for(int i =0; i<str.length; i++) {
			int num =Integer.parseInt(str[i]);
			
			if(!(1<=num && num<10000)) {
				return;
			}
			
		}
		
		//2.10미만의 수 중 가장 큰수를 저장 하는 변수 max선언
		int max = 100;
		//3.100이상의 수 중 가장 작은 수를 저장하는 변수 min선언
		int min = 100;

		//4. str 배열의 수를 하나씩 꺼내면서 비교하기
		for(int i =1; i<str.length; i++) {
			int num = Integer.parseInt(str[i]);

			if(num < 100) {
				if(max==100) {
					max=num;
				}
				else {
					max=max>num ? max:num;
				}

			}
			else {
				if(min==100) {
					min = num;
				}
				else {
					min= min<num ? min:num;
				}
			}
		}
		//5.출력하기
		System.out.println(max+" "+min);


		/*	for(int i=0; i<str.length;i++) {

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

		System.out.print(su[4]+" "+su[5]);
		 */
	}

}
