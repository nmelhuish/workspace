package problem2;


	import javax.swing.JOptionPane;
	public class CharacterArray {
	 
		public static void main(String[] args) {
			
			String userMessage = JOptionPane.showInputDialog("Input an Alpha Numeric String ");
			
			
		char[] charArray = userMessage.toCharArray();
			
			
			for (int i = 0; i < charArray.length; i++) {
				System.out.print(charArray[i] + ":");
				
				if (Character.isLowerCase(charArray[i])) {
					System.out.print("   ");
					System.out.print(Character.toUpperCase(charArray[i]) + "\n");
				} 
				
				else if (Character.isUpperCase(charArray[i])) {
					System.out.print("   ");
					System.out.print(Character.toLowerCase(charArray[i]) + "\n");
				} 
				
				else if (Character.isDigit(charArray[i])) {
					System.out.print("   ");
					System.out.print("*\n");
				} 
				
				else
					System.out.print("  \n");
	
			}
				
	}
}
