package problem3;

import java.lang.reflect.Array;

import javax.swing.JOptionPane;

public class Temperatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]yearTemp=new int [12][2];
		String months[];
		months= new String[] {"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
		int averageLow;
		int averageHigh;
		int lowIndex;
		int highIndex;
		
		yearTemp=inputTempForYear();
		averageLow=calculateAverageLow(yearTemp);
		averageHigh=calculateAverageHigh(yearTemp);
		lowIndex=findLowestTemp(yearTemp);
		highIndex=findHighestTemp(yearTemp);
		
		System.out.println("The average high is: " + averageHigh);
		System.out.println("The average low is: " + averageLow);
		System.out.println("The highest temperature for the year is: " + months[highIndex] + "is" + yearTemp[highIndex][0]);
		System.out.println("The lowest temperature for the year is: " + months[lowIndex] + "is" + yearTemp[lowIndex][1]);
		
		
	}

	private static int[][] inputTempForYear() {
		// TODO Auto-generated method stub
		int[][]yearTemp=new int [12][2];
		String months[];
		months= new String[] {"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
		int i; 
		for( i=0;i < 12; i++) {
			 inputTempForMonth(months[i], i ,yearTemp);
			
		}
		return yearTemp;
	}

	private static void inputTempForMonth(String month,int i, int[][] yearTemp) {
		// TODO Auto-generated method stub
		yearTemp[i][0]=Integer.parseInt(JOptionPane.showInputDialog("Enter the High Temperature for the Month of: " + month));
		yearTemp[i][1]=Integer.parseInt(JOptionPane.showInputDialog("Enter the Low Temperature for the Month of: " + month));
	
	}
	private static int  calculateAverageLow(int[][] yearTemp) {
		// TODO Auto-generated method stub
		int sum=0;
		int averageLow;
		int i; 
		for( i=0;i < 12; i++) {
			sum=yearTemp[i][1]+ sum;
		}
		averageLow=sum/12;
		return averageLow;
	}

	private static int  calculateAverageHigh(int[][] yearTemp) {
		// TODO Auto-generated method stub
		int sum=0;
		int averageHigh;
		int i; 
		for( i=0;i < 12; i++) {
			sum=yearTemp[i][0]+ sum;
		}
		averageHigh=sum/12;
		return averageHigh;
	}
	private static int  findLowestTemp(int[][] yearTemp) {
		// TODO Auto-generated method stub
		int min=0;
		int lowIndex = 0;
		int i; 
		for( i=0;i < 12; i++) {
			if (yearTemp[i][1]<min) {
				min=yearTemp[i][1];
				lowIndex=i;
			}
		}
		return lowIndex;	
	}
	private static int  findHighestTemp(int[][] yearTemp) {
		// TODO Auto-generated method stub
		int max=0;
		int highIndex = 0;
		int i; 
		for( i=0;i < 12; i++) {
			if (yearTemp[i][0]>max) {
				max=yearTemp[i][0];
				highIndex=i;
			}
		}
		return highIndex;	
	}
}
