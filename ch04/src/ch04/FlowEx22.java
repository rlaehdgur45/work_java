package ch04;

public class FlowEx22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,20,30,40,50};
		int sum =0;
		
		for(int i =0; i<arr.length;i++)
			System.out.printf("%d ", arr[i]);
		System.out.println();
		
		/*
		 * 향상된 for문 (JDK 1.5버전 부터 사용가능)
		 * 형태: for (타입 변수명) :배열 또는 컬렉션
		 * 컬렉션은? 11장에서 설명
		 * (단,배열의 타입과 배열에서 값을 받는 변수의 타입을 일치시켜야된다.)
		 */
		
		for(int tmp :arr) {
			System.out.printf("%d ", tmp);
			sum+= tmp;
		}
		System.out.println();
		System.out.println("sum= "+sum);
		

	}

}
