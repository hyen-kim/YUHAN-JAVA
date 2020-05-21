
public class ThisTest1 {
	private double n;
	public void power(double n) {
		this.n =  n * n;
		System.out.println(n + "ÀÇ Á¦°ö½ÂÀº " + this.n + "ÀÔ´Ï´Ù.");
	}
	
	public static void main(String[] args) {
		ThisTest1 tt = new ThisTest1();
		tt.power(3.0);
	}
}
