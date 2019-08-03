package MEGABANK_201901;

import java.math.BigDecimal;

public class TestInheritance {

	public static void main(String[] args) {
		Amount alice = new Amount();
		alice.setdays(4);
		alice.setRate(new BigDecimal(2000+""));
		
		Amount bob = new Amount();
		bob.setdays(4);
		bob.setRate(new BigDecimal(1600+""));
		bob.setBonus(new BigDecimal(1500+""));
		
		System.out.println("Alice 週薪總共為："+alice.sumWage());
		System.out.println("Bob 週薪總共為："+ bob.sumWage());
	}

}
class BaseWage{
	protected Integer days;
	protected BigDecimal rate;
	
	public BigDecimal totalWage(){
		if(days==null ||rate ==null){
			System.out.println("days or rate 尚未設定");
			return null;
		}
		return rate.multiply(new BigDecimal(days+""));
	}
	public void setdays(Integer days) {
		this.days = days;
	}
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
}
class Amount extends BaseWage{
	private BigDecimal bonus = BigDecimal.ZERO;
	
	public BigDecimal sumWage(){
		BigDecimal wage = super.totalWage();
		return wage==null ?bonus:bonus.add(wage);
	}
	public void setBonus(BigDecimal bonus){
		this.bonus = bonus;
	}
}