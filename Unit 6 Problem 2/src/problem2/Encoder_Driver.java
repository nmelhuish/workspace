package problem2;

import javax.swing.JOptionPane;

public class Encoder_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShuffleCipher sCipher = new ShuffleCipher(1);
		SubCipher aCipher = new SubCipher(3);
		
		
		String value1 = JOptionPane.showInputDialog("Type In a Sentence");
//		MessageEncoder myEncoder= new SubCipher(value1);
		String encText = sCipher.encode(value1);
		System.out.println(encText);
		encText = aCipher.encode(encText);
		System.out.println(encText);
	}

}
