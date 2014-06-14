package problem3;

import javax.swing.JOptionPane;

public class Decoder_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecodeShuffleCipher sCipher = new DecodeShuffleCipher(1);
		DecodeCipher aCipher = new DecodeCipher(3);
		
		
		String value1 = JOptionPane.showInputDialog("Type In a Sentence");
//		MessageEncoder myEncoder= new SubCipher(value1);
		String encText = aCipher.Decode(value1);
		System.out.println("Decoded Character Shift: " +encText);
		encText = sCipher.Decode(encText);
		System.out.println("Decoded Output: " +encText);
	}

}
