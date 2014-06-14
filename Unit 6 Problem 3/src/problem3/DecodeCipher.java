package problem3;

import problem3.MessageDecoder;

public class DecodeCipher implements MessageDecoder {
	int shift;
	public DecodeCipher(int shift) {
		this.shift=shift;
	}
	@Override
	public String Decode(String cipherText) {
		char[] encEncode= new char[100];
		char[] toEncode = cipherText.toCharArray();
		for (int i = 0; i < toEncode.length; i++) {
			encEncode[i] = this.shifter(toEncode[i]);
		}
			
			return String.valueOf(encEncode);
	 }
	public char shifter(char letter) {
		return (char) (letter - this.shift);
	}
}
	
