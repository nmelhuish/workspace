package problem3;

public interface CipherTest {

	
	 public static String cipherText (String word) {
		 StringBuffer r = new StringBuffer();
		 	for (int i = 0; i < word.length(); i++) {
		 		char c = word.charAt(i);
		 		c = (char)('a' + (c - 'a' + 21) % 26);
		 		r.append(c);                     
		 	}
		 		return r.toString();                   
		 
		       }


}
