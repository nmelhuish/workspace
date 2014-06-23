package problem1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class Fraction_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction frac1 = new Fraction();
		int X = 5;
		
		try {
			FileOutputStream outfile = new FileOutputStream("SerialF.dat");
			ObjectOutputStream objOutput = new ObjectOutputStream(outfile);
			objOutput.writeObject(frac1);
			objOutput.writeInt(X);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
