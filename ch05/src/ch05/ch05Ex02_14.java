package ch05;

public class ch05Ex02_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] su= {
				{3,5,9},
				{2,11,5},
				{8,30,10},
				{22,5,1}
		};
		//배열의 총합을 저장할수 있는 변수 선언및 초기화
		int sum=0;
		//i는 행번호
		for(int i=0; i<su.length;i++) {
			//j는 열번호
			for(int j=0; j<su[i].length;j++) {
				//해당 행과 열에 대한 값을 출력
				System.out.printf("%d ",su[i][j]);
				//해당 값을 sum변수에 더하기
				sum+=su[i][j];
				
			}System.out.println();
			//마지막으로 총합을 출력하기
		}System.out.println(sum);
		
	}

}
