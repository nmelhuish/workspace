package problem3;

import java.util.Arrays;

import com.sun.xml.internal.ws.util.StringUtils;

import problem3.MessageDecoder;

public class DecodeShuffleCipher implements MessageDecoder{
	int n;
	public DecodeShuffleCipher(int n) {
		this.n=n;
	}
	@Override
	public String Decode(String cipherText) {
		return this.shuffler(cipherText);
	
	}
	
	public String shuffler(String message) {
		String cipher= "";
		String newMessage[];
		
		
		newMessage = message.split("\\s",message.length()/2);
		System.out.println(newMessage.length);
		for(int i=0; i<newMessage.length; i++) {
//			System.out.println(newMessage[i]);
			cipher=cipher.concat(newMessage[(newMessage.length-1-i)].trim())+" ";
			
		}
			
		return cipher.trim();
			
	}
	
	
}
