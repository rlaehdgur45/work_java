
public class Ex03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fahrenheit = 100;
		float celcius = (float)((int)(((float)5/9 *(fahrenheit - 32)*100)+1))/100;
		System.out.println("Fahrenheit:"+ fahrenheit);
		System.out.println("Celcius:"+ celcius);
		
		
		/*byte a = 10;
		byte b = 20;
		int c = a + b;
		
		char ch = 'A';
		int ch1 = ch +2;
		ch = (char) ch1;
		
		float f = 3 /2f;
		long l = 3000 * 3000 * 3000L;
		
		float f2 = 0.1f;
		double d = 0.1f;
		
		boolean result = d==f2;
		
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		*/
		
		/*char ch = '5';
		boolean b = (int)ch >=48 ? ((int)ch <= 57 ? true : 
			((int)ch >= 65 ? ((int)ch <= 90 ? true : ((int)ch >= 97 ? ((int)ch <= 122 ? true: false ):false)):false)):false ;
			
		
		System.out.println(b);*/
		/*
		char ch = 'Z';
		
		char lowerCase = (char) ((int)ch < 97 ? ((int)ch+32) :ch );
		
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
		*/
		
		
		
	}

}
