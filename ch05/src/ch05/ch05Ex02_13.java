package ch05;

import java.util.Scanner;

public class ch05Ex02_13 {

	public static void main(String[] args) {
		// 배열 생성(첫항과 두번째 항만 저장하는 배열 우선 생성)
		int[] stream=new int[2];
		//첫번째 항과 두번쨰항은 입력받은 수로 초기화
		Scanner scanner =new Scanner(System.in);
		String[] tmp = scanner.nextLine().split(" ");
		//입력받은 수를 Stream배열 첫항과 두번째 항에 저장
		stream[0]=Integer.parseInt(tmp[0]);
		stream[1]=Integer.parseInt(tmp[1]);
		//첫항과 두번째 항 다음 항부터 반복시작
		//문제에서는 최대 10개를 출력하는 프로그램 작성하라고 되어 있으므로
		//9번 인덱스까지 반복
		for(int i=2; i<=10; i++) {
			//만약 배열 공간이 부족하면 늘리기
			if(i==stream.length) {
				int[] db=new int[stream.length * 2];
				System.arraycopy(stream, 0, db, 0, stream.length);
				stream=db;
				
			}
			//전전항(i-2)과 전항(i-1)의 함에서 1의 자리를 배열에 채우기
			int result = (stream[i-2]+stream[i-1])%10;
			stream[i]=result;
			
		}
		//0번 인덱스부터 9번 인덱스까지 값을 출력
		for(int i =0; i<10;i++) {
			System.out.print(stream[i]+" ");
		}
	}

}
