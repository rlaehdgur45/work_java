package ch04;

public class Ex00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		
		//행의 수만큼 반복
		for (int i =0; i<num; i++) {
			//열의 수만큼 반복
			for(int j=0; j<num; j++) {
				//현재 찍을 곳이 빈칸이 아닌 경우
				if(j>=num-i-1) {
					System.out.print("*");	
				}
				// 그 외는 빈칸인 경우 이므로 빈칸찍기
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		

	}

}
