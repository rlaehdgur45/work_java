package ch04;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		 for (int i= 1; i <=20; i++) {
		  if(i%2!=0 || i%3!=0) {
		   num1+=i;
		  }
		  
		  System.out.printf("%d%n",num1);
		 }

	}

}
