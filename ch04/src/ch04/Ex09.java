package ch04;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) {
		/*
		(1) 알맞은 코드를 넣어 완성하시오.
		*/
			int su = str.charAt(i)-48;
			   sum+=su;
		}
		System.out.println("sum="+sum);
		

	}

}
