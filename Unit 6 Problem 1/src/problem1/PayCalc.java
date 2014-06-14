package problem1;

import java.math.BigDecimal;

public abstract class PayCalc {
	BigDecimal payRate;
	BigDecimal hoursWorked;
	
	public PayCalc(BigDecimal payRate, BigDecimal hoursWorked) {
	
		this.payRate=payRate;
		this.hoursWorked=hoursWorked;
	}
	
	public abstract BigDecimal computePay();

	
	public BigDecimal computePay(BigDecimal factor) {
		this.payRate= (this.payRate.multiply(factor));
		return (this.payRate.multiply(hoursWorked));
	}
}
