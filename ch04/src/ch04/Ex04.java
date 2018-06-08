package ch04;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  ctrl + shift +/
		//방법 1)
		/*int sum =0;
		int num=1;
		while(true){
		if(num % 2 !=0){
		sum += num;
		}
		else {
		sum -= num;
		}
		if(sum >= 100){
		break;
		}
		num++;
		}
		System.out.println("답=" +num);
		System.out.println("총합 =" + sum);*/
		
		//방법2)
		/*int sum =0;
		int s= 1;	//값의 부호를 바꿔 주는데 사용할 변수
		int num = 0;
		// 조건식의 값이 true이므로 무한 반복문이 된다.
		for(int i = 1; true; i++, s=-s) {
			num = s* i;	//i와 부호(s)를 곱해서 더할 값을 구한다.
			num+= num;
			if(sum>= 100) { // 총합이 100 이상이면 반복문 종료
				break;
			}
		}
		System.out.println("답="+num);
		System.out.println("총합 = "+ sum);
*/
		//방법 3)
		int sum =0;
		int s =1;
		int num =0;
		
		for(int i =1; sum < 100; i++, s=-s) {
			num = i*s;
			sum += num;
		}
		System.out.println("답 ="+ num);
		System.out.println("총합 =" + sum);
	}

}
