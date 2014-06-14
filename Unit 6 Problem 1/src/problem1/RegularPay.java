package problem1;

import java.math.BigDecimal;

public class RegularPay extends PayCalc {

	public RegularPay(BigDecimal payRate, BigDecimal hoursWorked) {
		super(payRate, hoursWorked);
		
	}

	@Override
	public BigDecimal computePay() {
		return computePay(1.0);
	}
	public BigDecimal computePay(double factor) {
		return computePay(new BigDecimal(factor));
	}

}
