package ch04;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		 for (int i= 2; i <=10; i++) {
		  for(int j =1; j <i; j++){
		   num1+=j;
		                     }
		  System.out.printf("%d%n",num1);
		 }
		/*방법 2,
		int num =0;
		int= totalSum=0;
		{

		for(int i = 1; i <=10; i++)
		totalsum += sum;
		count++;

		system.out.println(totalsum);
		system.out.println(count); 
*/
	}

}
