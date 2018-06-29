package ch06;

public class InitTest {
int x;	//인스턴스 변수 x:0(자동초기화)
int y=x;	// 인스턴스 변수 Y:0

	void method1() {
		int i=0;	//지역변수 i:알수없음
		int j=i;	//에러 지역변수를 초기화 하지않고 사용
	}
}
