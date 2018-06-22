package ch05;

import java.util.Scanner;

public class ch05Ex02_10 {

	public static void main(String[] args) {
		// 사람수 입력받기
		Scanner scanner = new Scanner(System.in);
		/*String tmp1 = scanner.nextLine();
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
	}*/
	int count = Integer.parseInt(scanner.nextLine());
	
	
	//입력받은 사람의 수가 20 초과일 경우는 프로그램 종료
	if(count >20) {
		return;
	}
	//입력받은 사람의 수를 이용하여 점수를 저장할 배열 생성
	int [] score = new int[count];
	//점수들을 입력받기
	String[] tmp= scanner.nextLine().split(" ");
	//tmp 배열은 타입이 String 이므로 int형으로 변경하여 score배열에 저장한다.
	for(int i=0; i<tmp.length; i++) {
		score[i]=Integer.parseInt(tmp[i]);

	}
	//ArrayEx10 예제 참고(버블정렬법)
	for(int i=0; i<score.length-1; i++) {
		boolean changed =false;
		
		for(int j=0; j<score.length-1-i; j++) {
			if(score[j]> score[j+1]) {
				int temp =score[j];
				score[j]=score[j+1];
				score[j+1]=temp;
				changed=true;
			}
		}
		
		if(!changed)break; {
			
		}
	}
		//버블 정렬이 끝나면 오름차순으로 정렬되기 때문에 배열을 뒤에서 부터 출력하면
		//내림차순(점수가 높은 순서)으로 출력된다.
		for(int i=score.length-1; i>=0; i--) {
			System.out.println(score[i]);
		}
		
		
	
	
	
	
	
		

}

}
