
public class OperatorEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1_000_000; // 1000000
		int b = 2_000_000; // 2000000
		
		
		// 대입연산자(=)는 오른쪽 부터 계산한 다음 왼쪽으로 대입한다.
		// int a, b 곱한 결과는 int 타입이다.
		// 곱한 결과가 int 범위를 초과하므로 오버 플로우가 일어나
		// -1454759936 값으로 계산 된 것이다.
		long c = a * b;	// a*b=2,000,000,000,000?No
		
		System.out.println(c);

	}

}
