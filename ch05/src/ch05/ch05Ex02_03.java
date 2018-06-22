package ch05;

import java.util.Scanner;

public class ch05Ex02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] tmp = scanner.nextLine().split(" ");
		
		//홀수번째 합과 짝수번째 합을 저장할 변수 선언 및 초기화.
		int odd =0;
		int even =0;
		
		int[] su=new int[tmp.length];
		
		//tmp배열에서 값을 하나씩 꺼낸다.
		for(int i=0; i<tmp.length;i++) {
			su[i]=Integer.parseInt(tmp[i]);
			//만약 홀수번째 값이면
			if(i%2==0) {
				odd+=su[i];
			}
			//짝수번째 값이면
			else {
				even+=su[i];
			}
			//홀수번째 와 짝수번째에 각각의 합을 출력하기
		}System.out.println(odd);
		System.out.println(even);
		

	}

}
