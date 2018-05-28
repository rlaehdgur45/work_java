
public class OperatorEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 1_000_000 * 1_000_000;	//int형 * int형 = int형
		long b = 1_000_000 * 1_000_000L;// int형*long형 = long형
		
		System.out.println("a="+a); // 비정상 출력
		System.out.println("b="+b); // 정상 출력

	}

}
