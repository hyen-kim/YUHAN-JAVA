package thistest3;

public class RunHuman {
	public static void main(String[] args) {
		Human h1 = new Human("홍길동", 62.7, 177.7);
		/*
		 *  Human(String name) 호출
			Human(String name, double weight) 호출
			this(name, weight) 호출
			순서대로 호출된다.
			왜냐하면 Human(String name, double weight, double height)가
			this(name, weight);를 호출하고
			this(name);을 호출하므로
			public Human(String name) 클래스부터 차례로 내려오는 형태가 된다.
		 * */
		
	}
}
