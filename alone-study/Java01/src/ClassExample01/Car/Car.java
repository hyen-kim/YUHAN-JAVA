package ClassExample01.Car;

public class Car {
	private String company;
	private String modelName;
	private int amount;//배기량
	
	public Car() {
	}
	
	public Car(String company, String modelName, int amount) {
		super();//부모 클래스의 기본생성자 호출
		this.company = company;
		this.modelName = modelName;
		this.amount = amount;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company/*(필드)*/ = company;//매개변수
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	void start() {
		System.out.println(modelName + "에 시동을 건다.");
	}
	
	void drive() {
		System.out.println(modelName + "가(이) 주행하다.");
	}
	
	void stop() {
		System.out.println(modelName + "가(이) 멈추다.");
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", modelName=" + modelName + ", amount=" + amount + "]";
	}
}
