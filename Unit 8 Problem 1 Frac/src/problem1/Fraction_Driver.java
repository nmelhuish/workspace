package problem1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;


public class Fraction_Driver {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fraction frac1 = new Fraction(1,2);
		Fraction frac2 = new Fraction(3,5);
		Fraction frac3 = new Fraction(6,8);
		
		
			FileOutputStream outFile = null;
		try {
			outFile = new FileOutputStream("SerialF.txt");
			ObjectOutputStream objOutput = new ObjectOutputStream(outFile);
			objOutput.writeObject(frac1);
			objOutput.writeObject(frac2);
			objOutput.writeObject(frac3);
//			outFile.flush();
			objOutput.close();
			outFile.close();
			//objOutput.writeInt(x);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ObjectInputStream objInput = null;
		try {
			FileInputStream inFile = new FileInputStream("SerialF.txt");
			objInput = new ObjectInputStream(inFile);
			Object obj;
			
//			Runs all the objects through the loop and writes them all a the same time
			while(inFile.available() > 0) {
		
				
				System.out.println("in Loop1");
				obj = objInput.readObject();
				
				System.out.println("Total file size to read (in bytes) : "
						+ inFile.available());
				System.out.println(obj);
				
			}
			inFile.close();
			objInput.close();
//			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No Class Found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
