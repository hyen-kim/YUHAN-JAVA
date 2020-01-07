package ClassExample01.Car;

public class UseCar {

	public static void main(String[] args) {
		
		Car c1 = new Car("HYUNDAI", "AVANTE", 1500);
		Car c2 = new Car();
		
		c2.setAmount(1200);
		c2.setCompany("KIA");
		c2.setModelName("MORING");
		
		c2.start();
		
		c1.start();
		c1.drive();
		
		System.out.println("c1 : " + c1.toString());
		System.out.println("c2 : " + c2);
	}

}
