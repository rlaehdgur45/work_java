
public class OperatorEx30 {

	/*
	 * 코드 자동 정렬법
	 * 1. Ctrl + a 정렬할 범위 지정
	 * 2. Ctrl + i 정렬
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dec = 8;

		//비트를 오른쪽으로 0칸 이동
		System.out.printf("%s%n", toBinaryString(dec >> 0));
		//비트를 오른쪽으로 1칸 이동
		System.out.printf("%s%n", toBinaryString(dec >> 1));
		//비트를 오른쪽으로 2칸 이동
		System.out.printf("%s%n", toBinaryString(dec >> 2));

		//비트를 왼쪽으로 0칸 이동
		System.out.printf("%s%n", toBinaryString(dec << 0));
		//비트를 왼쪽으로 1칸 이동
		System.out.printf("%s%n", toBinaryString(dec << 1));
		//비트를 왼쪽으로 2칸 이동
		System.out.printf("%s%n", toBinaryString(dec << 2));
		
		dec = -8;

		//비트를 오른쪽으로 0칸 이동
		System.out.printf("%s%n", toBinaryString(dec >> 0));
		//비트를 오른쪽으로 1칸 이동
		System.out.printf("%s%n", toBinaryString(dec >> 1));
		//비트를 오른쪽으로 2칸 이동
		System.out.printf("%s%n", toBinaryString(dec >> 2));

		//비트를 왼쪽으로 0칸 이동
		System.out.printf("%s%n", toBinaryString(dec << 0));
		//비트를 왼쪽으로 1칸 이동
		System.out.printf("%s%n", toBinaryString(dec << 1));
		//비트를 왼쪽으로 2칸 이동
		System.out.printf("%s%n", toBinaryString(dec << 2));
		







	}

	private static Object toBinaryString(int x) {
		// TODO Auto-generated method stub
		String zero = "00000000000000000000000000000000";
		String tmp = zero +Integer.toBinaryString(x);

		return tmp.substring(tmp.length() - 32);
	}

}
