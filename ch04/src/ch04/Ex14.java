package ch04;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = (int)(Math.random() * 100) + 1/* (1) */;
		  int input = 0; // 사용자입력을 저장할 공간
		  int count = 0; // 시도횟수를 세기위한 변수
		  // 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
		  java.util.Scanner s = new java.util.Scanner(System.in);
		  do {
		   count++;
		   System.out.print("1과 100사이의 값을 입력하세요 :");
		   input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
		   /*
		  (2) 알맞은 코드를 넣어 완성하시오.
		    */if(input > answer) {
		     System.out.println("더 작은 수로 다시 시도해보세요");
		    } else if(input < answer) {
		     System.out.println("더 큰 수로 다시 시도해보세요");
		    }
		    else {
		     System.out.println("정답입니다.");
		     System.out.println("시도횟수는"+count+"번 입니다.");
		     break;
		    }
		  } while(true);
	}
}
