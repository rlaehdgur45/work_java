package ch06;

public class PersonTest {

	public static void main(String[] args) {
		//1. 사람 3명(객체 3개) 만들기
		Person[] a=new Person[3];
		/*Person a1 = new Person();
		Person a2 = new Person();
		Person a3 = new Person();*/
		//2. 각 사람(객체)마다 이름, 나이, 주소를 설정하세요.
		//(자기소개 포함해서 옆사람 정보 작성하기)
		/*for(int i=0; i<a.length;i++) {
		a[i]=new Person();	
		}*/
		//[2-2]아래 방법은 객체 를 생성후 각 인스턴스 변수에 접근하여 
		// 값을 초기화 한 부분이다.
		// 아래 부분을 2-1에서 작성한 생성자를 이용하여 변경하시오.
		a[0]=new Person("김동혁", 26,"인천");
		a[1]=new Person("조은향", 19, "경기도");
		a[2]=new Person("김기용", 19, "경기도");
		
		
		/*Person s1= new Person("김동혁",26,"인천");
		s1.so();
		Person s2=new Person("조은향", 19, "경기도");
		s2.so();
		Person s3=new Person("김기용", 19, "경기도");
		s3.so();*/
		
		
		/*a[0].name="김동혁";
		a[0].age=26;
		a[0].js="인천";
		//a[0].so();
		
		a[1].name="조은향";
		a[1].age=19;
		a[1].js="경기도";
		//a[1].so();
		
		a[2].name="김기용";
		a[2].age=19;
		a[2].js="경기도";*/
		//a[2].so();
		/*a1.name="김동혁";
		a1.age=26;
		a1.js="인천";
		a1.so();
		
		a2.name="조은향";
		a2.age=19;
		a2.js="경기도";
		a2.so();
		
		a3.name="김기용";
		a3.age=19;
		a3.js="경기도";
		a3.so();*/
		
		
		//3. Person 클레스에서 만든 메서드를 각 사람(객체)마다 호출하세요.
		//for문 이용해도 좋고, 각각 3줄로 호출해도 됩니다.
		for(int i=0; i<a.length;i++) {
			a[i].so();
		}
		//[2-4]. 2-3. 에서 생성한 생성자를 이용하여"흥민"이라는 이름으로 사람 객체 하나를 생성하세요.
		
		Person s1=new Person("흥민");
		
		
		//[2-5] 2-4객체를 이용하여 introduce() 메서드를 호출하세요.
		s1.so();
		
	}

}
