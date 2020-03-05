package Day02;
public class Permanent extends Employee{
	   int bonus;

	   public Permanent(int pay, int bonus) {
	      this.pay = pay;
	      this.bonus = bonus;
	   }

	   public void setPay(int pay) {
	      this.pay = pay;
	   }

	   public int getBonus() {
	      return bonus;
	   }

	   public void setBonus(int bonus) {
	      this.bonus = bonus;
	   }

	   public int getPay() {
	      return pay + bonus;
	   }
}
