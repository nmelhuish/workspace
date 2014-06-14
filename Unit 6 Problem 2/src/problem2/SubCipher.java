package problem2;

public class SubCipher implements MessageEncoder {
	int shift;
	public SubCipher(int shift) {
		this.shift=shift;
	}
	@Override
	public String encode(String plainText) {
		char[] encEncode= new char[100];
		char[] toEncode = plainText.toCharArray();
		for (int i = 0; i < toEncode.length; i++) {
			encEncode[i] = this.shifter(toEncode[i]);
		}
			
			return String.valueOf(encEncode);
	 }
	public char shifter(char letter) {
		return (char) (letter + this.shift);
	}
	



	
	
	


}
