package problem2;

public class ShuffleCipher implements MessageEncoder{
	int n;
	public ShuffleCipher(int n) {
		this.n=n;
	}
	@Override
	public String encode(String plainText) {
		return this.shuffler(plainText);
	
	}
	
	public String shuffler(String message) {
		String cipher= "";
		String newMessage[];
		
		newMessage = message.split("\\s+",message.length()/2);
//		newMessage = message.split("\\s",message.length()/2);
		System.out.println(newMessage.length);
		for(int i=0; i<newMessage.length; i++) {
			System.out.println(newMessage[i]);
			cipher=cipher.concat(newMessage[(newMessage.length-1-i)])+" ";
			
		}
			
			return cipher.trim();
			
	}
	
}
