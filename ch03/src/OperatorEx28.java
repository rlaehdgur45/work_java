
public class OperatorEx28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0xAB, y= 0xF;
		
		System.out.printf("x = %#X \t\t%s%n", x, toBinaryString(x));
		System.out.printf("y = %#X \t\t%s%n", y, toBinaryString(y));
		System.out.printf("%#X | %#X = %#X \t%s%n", x,y,x|y, toBinaryString(x|y));
		System.out.printf("%#X & %#X = %#X \t%s%n", x,y,x&y, toBinaryString(x&y));
		System.out.printf("%#X ^ %#X = %#X \t%s%n", x,y,x^y, toBinaryString(x^y));
		System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n", x,y,y,x^y^y, toBinaryString(x^y^y));
		
		

	}

	private static Object toBinaryString(int num) {
		// TODO Auto-generated method stub
		String zero = "00000000000000000000000000000000";
		String tmp = zero +Integer.toBinaryString(num);
		
		/*
		 * substring(int) 메소드
		 * 괄호 안의 int값에 해당하는 문자 부터 문자열로 잘라낸다.
		 */
		return tmp.substring(tmp.length() -32);
	}


}
