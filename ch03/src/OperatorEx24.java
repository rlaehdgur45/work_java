
public class OperatorEx24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		char ch= ' ';
		
		
		// x값이 10 초과이고 20 미안인지 확인
		x =15;
		System.out.printf("x=%2d, 10 < x && x <20 =%b%n",x,10 < x && x <20);
		
		// x값이 2의 배수이거나 3의 배수이고 6의 배수가 아니면 true
		x = 6;
		System.out.printf("x=%2d, x%%2==0 || x%%3==0 && x %% 6!=0 =%b%n",
				x,x%2==0||x%3==0&&x%6!=0);
		
		// x값이 2의 배수이거
		System.out.printf("x=%2d,(x%%2==0 || x%%3==0) && x %% 6!=0 =%b%n",
				x, (x%2==0 ||x%3==0)&&x%6!=0);
		
		// 변수 ch가 문자 '0'이상 문자 '9'이하인지 확인
		ch = '1';
		System.out.printf("ch='%c', '0' <= ch && ch <= '9' =%b%n",
				ch,'0' <= ch&& ch <='9');
		
		// 변수 ch가 문자 'a'이상 문자 'z'이하인지 확인
		ch='a';
		System.out.printf("ch='%c', 'a' <= ch && <= 'z' =%b%n",
				ch,'a' <= ch && ch <='z');
		
		// 변수 ch가 문자 'A'이상 문자 'Z'이하인지 확인
		ch='A';
		System.out.printf("ch='%c', 'A' <= ch && <= 'Z' =%b%n",
				ch,'A' <= ch && ch <='Z');
		
		// 변수 ch가 문자 'q'이거나 문자 'Q'이면 true
		ch='q';
		System.out.printf("ch='%c', 'q' <= ch || <= 'Q' =%b%n",
				ch,'q' <= ch || ch <='Q');
		
		
		

	}

}
