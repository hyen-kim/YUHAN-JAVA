package Day02;
public class Temporary extends Employee {
	   int time;
	   public Temporary(int time, int pay) {
	      this.time = time;
	      this.pay = pay;
	   }

	   public int getTime() {
	      return time;
	   }

	   public void setTime(int time) {
	      this.time = time;
	   }

	   public int getPay() {
	      return time * pay;
	   }

	   public void setPay(int pay) {
	      this.pay = pay;
	   }
}
