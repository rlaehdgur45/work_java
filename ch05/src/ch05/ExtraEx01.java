package ch05;

public class ExtraEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char At[] 예제
		String a ="KOITT";
		String b ="APPLE";
		String c ="CAT";
		
		//1. char At()을 이용하여 변수 result배열에 "KOREA"를 담아보세요.
				
		char[] result = new char[5];
		
		result[0] = a.charAt(0);
		result[1] = a.charAt(1);
		result[2] = 'R';
		result[3] = b.charAt(4);
		result[4] = b.charAt(0);
		for(int i=0; i<result.length; i++) {
		System.out.print(result[i]);
		}
		
		/*String sum = "";
		sum = Character.toString(a.charAt(0));*/
		

	}

}
