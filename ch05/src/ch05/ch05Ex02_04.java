package ch05;

import java.util.Scanner;

public class ch05Ex02_04 {

	public static void main(String[] args) {
		// 백개의 정수를 입력 받을수 있는 정수 선언
		/*		int[] numbers = new int[100];

		Scanner scanner = new Scanner(System.in);
		String[] tmp = scanner.nextLine().split(" ");
		for(int i=0; i<numbers.length;i++) {
			numbers[i]=Integer.parseInt(tmp[i]);
			if(numbers[i]==-1) {
				System.out.print(numbers[i-3]+" "+numbers[i-2]+" "+numbers[i-1]);
				break;
			}
		}*/
		//초기 에는 2칸짜리 배열을 우선 생성한다.
		int[] stream= new int[2];

		//입력을 받은 값을 저장할 인덱스 번호 i
		int i =0;
		//무한히 반복한다.
		while(true) {

			//정수하나 를 문자열로 받는다.
			Scanner scanner=new Scanner(System.in);
			String num = scanner.nextLine();
			//만약 배열이 꽉찬 경우라면
			if(i== stream.length) {
				//임시로 stream 배열의 2배 크기인 배열 tmp를 생성한다.
				int[] tmp = new int[stream.length *2];
				//stream 배열에 담겨 있는 몬든 값들을 tmp배열로 복사한다.
				System.arraycopy(stream, 0, tmp, 0, stream.length);
				//우리는 stream배열을 사용할 것이므로 tmp배열을 stream 배열에 대입한다.
				//(tmp배열의 주소값을 stream 배열의 주소값으로 설정한다.)
				//자바 메모리 구조 그림으로 그려서 복습 권장 드립니다.
				stream = tmp;
			}
			//입력 받은 정수를 int형으로 변경후 stream 배열에 저장
			stream[i]=Integer.parseInt(num);
			// 만약 입력받은 정수가 -1값이면 무한 반복을 멈춘다.
			if(stream[i] == -1) {
				break;
			}
			//stream 배열의 다음 칸을 가리키기 위한 인덱스 번호 증가
			i++;
		}
		//stream 배열을 전체적으로 탐색한다.
		for(int j=0; j<stream.length;i++) {
			if(stream[j]==-1) {
				//인덱스 번호 (j)값이 3미만이면 혅 인덱스 번호를 사용하고
				//3이상이면 현재 인덱스 번호에서 앞으로 3칸의 값부터 사용
				int init =j<3?j:3;
				//-1을 제외한 마지막 세 개의 정수를 출력
				for(int k =init; k>=1;k--) {
					System.out.print(stream[j-k]+" ");
				}
				break;
			}
		}



	}

}
