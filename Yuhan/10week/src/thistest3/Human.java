package thistest3;

public class Human {
	
	String name;
	double weight, height;
	
	// this()는 같은 클래스내에서 생성자를 호출하는 용도
	
	public Human(String name) {
		this.name = name;
		System.out.println("Human(String name) 호출");
	}

	public Human(String name, double weight) {
		this(name);
		this.weight = weight;
		System.out.println("Human(String name, double weight) 호출");
	}
	
	public Human(String name, double weight, double height) {
		this(name, weight);
		this.height = height;
		System.out.println("this(name, weight) 호출");
	}
}
