package ch06;






public class carTest {

	public static void main(String[] args) {
		Car c1= new Car();
		c1.color="white";
		c1.gearType="auto";
		c1.door= 4;
		
		Car c2=new Car("white","auto",4);
		
		System.out.println("c1의color=" + c1.color + ", gearType=" + c1.gearType+", door="+c1.door);
		System.out.println("c2의color=" + c2.color + ", gearType=" + c2.gearType+", door="+c2.door);
	}

}
