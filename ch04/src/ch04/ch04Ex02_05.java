package ch04;

import java.util.Scanner;

public class ch04Ex02_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수를 입력해주세요.>");
		String tmp = scanner.nextLine();
		int num = Integer.parseInt(tmp);
		
		while(num%3==0) {
			num/=3;
			System.out.println(num);
			tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
		}
		while(num%3!=0) {
		System.out.println(num);
		tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
		}
		 do{
			
		
		if(num%3==0) {
			num/=3;
			System.out.println(num);
			tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
		}
		else if(num==-1){
			break;
		}
		else{
			tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
		}
		
		}while(num!=-1);
	}

}
