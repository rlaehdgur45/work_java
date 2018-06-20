package ch05;

import java.util.Scanner;

public class ch05Ex01_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.10개의 정수 입력받기
		Scanner scanner =new Scanner(System.in);
		String[] str = scanner.nextLine().split(" ");
		
		//2. 편의상  str에 저장된 문자열들을 정수형으로 바꾼 값을 저장할 배열 생성
		int[] su = new int[str.length];
		
		//3. str배열에 저장된 문자열들을 정수형으로 변환후 su배열에 집어넣기
		for(int i=0; i<str.length;i++) {
			su[i]=Integer.parseInt(str[i]);
			
		}
		
		
		for(int i=0; i<su.length-1;i++) {
			boolean chang = false;
			for(int j =0; j<su.length-1-i;j++) {
				if(su[j]< su[j+1]) {
					int tmp = su[j];
					su[j] = su[j+1];
					su[j+1] = tmp;
					chang =true;
				}
			}
		
			if(!chang) { break;}
		}
		for(int i=0; i<su.length; i++) {
			System.out.print(su[i]+" ");
		}
		//5. 오름차순 정렬된 배열을 거꾸로 출력하기 (내림차순 출력)
		/*for(int i=su.length-1;i>=0;i--){
			System.out.print(su[i]+" ");
		}*/

	}

}
