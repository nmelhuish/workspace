package problem1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Fraction implements Serializable  {

	
            private int numerator;
            private int denominator;
            private static char slash;
	
        	
           public Fraction(int numerator, int denominator) {
				super();
				this.slash = '/';
				this.numerator = numerator;
				this.denominator = denominator;
			}
        	
           public Fraction() {
				super();
				// TODO Auto-generated constructor stub
            
           }

			public int getNumerator() {
				return numerator;
			}

			public void setNumerator(int numerator) {
				this.numerator = numerator;
			}

			public int getDenominator() {
				return denominator;
			}

			public void setDenominator(int denominator) {
				this.denominator = denominator;
			}

			public static char getSlash() {
				return slash;
			}

			public static void setSlash(char slash) {
				Fraction.slash = slash;
			}
			@Override
			public String toString() {
				return "Fraction_Demo [numerator=" + numerator
						+ ", denominator=" + denominator + "]";
			}
			FileInputStream inFile; {
			try {
				inFile = new FileInputStream("SerialF.dat");
				ObjectInputStream objInput = new ObjectInputStream(inFile);
				Object obj =objInput.readObject();
//				((Fraction)obj)
			} catch (IOException | ClassNotFoundException e) {	
				System.out.println("Class not found");
				e.printStackTrace();
			}
			
			
			}
}
			
		
