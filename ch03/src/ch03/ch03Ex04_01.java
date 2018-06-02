package ch03;

public class ch03Ex04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 프로그램 실행 도중 1번 위치의 a값이 궁금할 경우
		 * 방법 1: print 메소드를 이용해 출력해본다.
		 * 방법 2: 디버깅 도구를 사용한다.
		 */
		int a= 5;
		a+=10;
		
		
		//System.out.println(a);// 방법1: 파괴식 검사방식
/*<-브레이크 포인트(본인이 알고 싶은 값 위치번호를 더블 클릭 	*/
		a=a-1;//1번- 현재 위치에서 a값은 14이다.
		debugTest(a);
		System.out.printf("%d%n",a);

	}
	
	private static void debugTest(int b) {
		/*
		 * debug 
		 * F5: 메소드 내부 진입
		 * F6: 현재 가리키고 있는 줄 실행
		 * F8: 다음 break Point로 이동
		 */
		System.out.println(b+10);
	}

}
