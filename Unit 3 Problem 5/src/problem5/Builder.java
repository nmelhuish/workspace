package problem5;

import javax.swing.JOptionPane;

public class Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String String1;
		String String2;
		String String3;
		String SubStr1;
		String SubStr2;
		
		String1=JOptionPane.showInputDialog("Input a string 1 ");

		System.out.println("The length is: " +String1.length());
		
		String2=String1 + "  I love it!";
		
		String3=JOptionPane.showInputDialog("Input a string 2 ");
		
		SubStr1=String2.substring(0,String1.length());
		SubStr2=String2.substring(String1.length()+1);
		
		System.out.println(SubStr1 + " " + String3 + SubStr2);
	}

}
