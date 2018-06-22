package ch05;

import java.util.Scanner;

public class ch05Ex02_07 {

	public static void main(String[] args) {
		// 999가 나타나기 전까지 입력이 무한 하므로 우선 크기 2인 배열 생성
		int[] stream = new int[2];
		//stream 배열의 현재 인덱스 번호를 저정하는 변수 i
		int i=0;
		// 무한히 입력 받으므로 무한 반복한다.
		while(true) {
			//숫자 하나 입력받기
			Scanner scanner =new Scanner(System.in);
			int num= Integer.parseInt(scanner.nextLine());
			//2.4번에 똑같은 코드이므로 생략
			if(i == stream.length) {
				int [] tmp= new int[stream.length*2];
				System.arraycopy(stream, 0, tmp, 0, stream.length);
				stream=tmp;
			}
			//입력 받은 정수를 배열에 저장
			stream[i] =num;
			//만약 999일 경우 무한 반복문을 빠져나온다.
			if(stream[i]==999) {
				break;
			}
			//stream 배열의 인덱스 번호 1증가
			i++;
		}
		//최소값과 최대값의 초기값은 입력 받은 stream배열의 첫번째 값으로 한다.
		int min = stream[0];
		int max = stream[0];
		//stream 배열의 현재 인덱스 번호를 0으로 초기화
		i=0;
		
		//stream 배열에서 꺼낸 정수가 999가 아닐 동안 계속 반복
		while(stream[i] != 999) {
			
			min=min<stream[i] ? min:stream[i];
			max=max>stream[i] ? max:stream[i];
			i++;
		}
		//결과 출력
		System.out.println("max :"+ max);
		System.out.println("min :"+ min);
		
		
		
		
		
		
		
		/*for(int i=0; i<numbers.length;i++) {
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
		}*/


	}

}
