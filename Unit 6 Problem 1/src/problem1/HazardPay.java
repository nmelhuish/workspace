package problem1;

import java.math.BigDecimal;

public class HazardPay extends PayCalc {
	
	public HazardPay(BigDecimal payRate,BigDecimal hoursWorked ) {
		super(payRate, hoursWorked);
		
	}

	@Override
		public BigDecimal computePay() {
		return computePay(1.5);
}
	
	public BigDecimal computePay(double factor) {
		return computePay(new BigDecimal(factor));
	
	}


	
	
}
