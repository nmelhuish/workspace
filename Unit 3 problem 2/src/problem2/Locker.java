package problem2;

import javax.swing.JOptionPane;

public class Locker {

		// TODO Auto-generated constructor stub
		
		/** locker, student name, number of books, combination lock*/
		private int lockerNum;
		private String name;
		private int numBooks;
		private CombinationLock comboObj;
		
		
		
		public Locker() {
		
			lockerNum= 0;
			name= "no name yet";
			numBooks= 0;
		}
		
		
		public Locker (int initialLockerNum, String initialName, int initialNumBooks, CombinationLock initialComboObj) {
			if (initialLockerNum>=0) {
				lockerNum=initialLockerNum;
			
			} else {
				System.out.println("Error: Locker number cannot be negative"); 
				System.exit(0);
			}

			name= initialName;
			
			if (initialNumBooks>=0) {
				numBooks=initialNumBooks;
			
			} else {
				System.out.println("Error: Number of books cannot be negative"); 
				System.exit(0);
			} 
			
			comboObj=initialComboObj;
		}	
		public void setLocker(int newLockerNum, String newName, int newNumBooks) {
			if (newLockerNum>=0) {
				lockerNum=newLockerNum;
			
			} else {
				System.out.println("Error: Locker number cannot be negative"); 
				System.exit(0);
			}

			name= newName;
			
			if (newNumBooks>=0) {
				numBooks=newNumBooks;
			
			} else {
				System.out.println("Error: Number of books cannot be negative"); 
				System.exit(0);
			}
			
			
		}
		public void putBookInLocker() 
		{
			numBooks=numBooks + 1;
		}
		
		public boolean removeBookFromLocker() 
		{
			
			numBooks=numBooks - 1;
			if( numBooks<0) {
				numBooks=0;
				return false;  
			
			}else {
				return true; 
			}
		}
		public void openLocker()
		{
			int attemptComboNum1;
			int attemptComboNum2;
			int attemptComboNum3;
			boolean results;
			
			/**CombinationLock mmCombo= new CombinationLock(28,17,39);*/
			
			attemptComboNum1=Integer.parseInt(JOptionPane.showInputDialog("Enter Combo Number 1: "));
			attemptComboNum2=Integer.parseInt(JOptionPane.showInputDialog("Enter Combo Number 2: "));
			attemptComboNum3=Integer.parseInt(JOptionPane.showInputDialog("Enter Combo Number 3: "));
			
			results=comboObj.openLock(attemptComboNum1,attemptComboNum2,attemptComboNum3);
			if(results==true)
				System.out.println("Opening your locker was a success");
			else
				System.out.println("Sorry that was the wrong combination");
			
		}
		
		
		public int getLockerNum()
		{
			return lockerNum;
		}
		public String getName()
		{
			return name;
		}
		public int getNumBooks()
		{
			return numBooks;
		}
		
		public void writeOutput()
		{
			System.out.println("The locker number is: " + lockerNum);
			System.out.println("The student name is: " + name);
			System.out.println("The number of books is: " + numBooks);
			
		}
	
	
	
	
	
}


