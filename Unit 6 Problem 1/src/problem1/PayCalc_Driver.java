package problem1;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class PayCalc_Driver {
//	inputs money per hour. 
//	inputs the hours worked.
//	called RegularPay 
	
	public static void main(String[] args) {
		String value1 = JOptionPane.showInputDialog("Enter Pay Rate");
		System.out.println("Pay Rate: " + value1);
		String value2 = JOptionPane.showInputDialog("Enter Hours Worked");
		System.out.println("Hours Worked: " + value2);
		
		BigDecimal payRate = new BigDecimal(value1.replaceAll(",", ""));
		BigDecimal hoursWorked= new BigDecimal(value2.replaceAll(",", ""));
		BigDecimal RegValue;
		BigDecimal HazValue;
	
//		Regular pay
		RegularPay r = new RegularPay(payRate,hoursWorked);
		RegValue=r.computePay();
//		Hazard pay
		HazardPay h = new HazardPay(payRate,hoursWorked);
		HazValue=h.computePay();
		
//		Printing out the pay rates
		System.out.println("Your Regular PayCheck Value is:" + RegValue);
		System.out.println("Your Hazard PayCheck Value is:" + HazValue);
		
	}

}
