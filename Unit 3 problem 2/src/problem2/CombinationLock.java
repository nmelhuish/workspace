package problem2;

public class CombinationLock {

	// TODO Auto-generated constructor stub
	
			/** locker, student name, number of books, combination lock*/
			private int ComboNum1;
			private int ComboNum2;
			private int ComboNum3;
			private int dial=0;
			
			
			
			public CombinationLock() {
				
				ComboNum1= 0;
				ComboNum2= 0;
				ComboNum3= 0;
				dial=0;
			}
			
			
			
			public CombinationLock (int initialComboNum1, int initialComboNum2, int initialComboNum3) {
				if (initialComboNum1>=0) {
					ComboNum1=initialComboNum1;
				
				} else {
					System.out.println("Error: Combo number cannot be negative"); 
					System.exit(0);
				}
				
				if (initialComboNum2>=0) {
					ComboNum2=initialComboNum2;
				
				} else {
					System.out.println("Error: Combo number cannot be negative"); 
					System.exit(0);
				}
				
				if (initialComboNum3>=0) {
					ComboNum3=initialComboNum3;
				
				} else {
					System.out.println("Error: Combo number cannot be negative"); 
					System.exit(0);
				}
			}	
			public void setCombinationLock(int newComboNum1, int newComboNum2, int newComboNum3) {
				if (newComboNum1>=0) {
					ComboNum1=newComboNum1;
				
				} else {
					System.out.println("Error: Combo number cannot be negative"); 
					System.exit(0);
				}
				if (newComboNum2>=0) {
					ComboNum2=newComboNum2;
				
				} else {
					System.out.println("Error: Combo number cannot be negative"); 
					System.exit(0);
				}
				
				if (newComboNum3>=0) {
					ComboNum3=newComboNum3;
				
				} else {
					System.out.println("Error: Combo number cannot be negative"); 
					System.exit(0);
				}
				
			}
			public void resetDial() 
			{
				dial=0;
			}
			
			public int turnRight(int RightComboNumberTurns)
				
			{
				int diff;
				dial=dial + RightComboNumberTurns;
				System.out.println("turn right " +dial);
				if(dial >39) {
					diff= dial-39;
					dial=diff-1;
				}
				if(dial <0) {
					dial= 40+dial;
				} 
				return dial;
				
			}
			public int turnLeft(int LeftComboNumberTurns)
			
			{
				int diff;
				dial=dial - LeftComboNumberTurns;
				System.out.println("turn left " +dial);
				if(dial >39) {
					diff= dial-39;
					dial=diff-1;
				}
				if(dial <0) {
					dial= 40+dial;
				}			
				return dial;
				
			}
			
			public boolean openLock(int RightComboNum1, int LeftComboNum2, int RightComboNum3)
			{
					int attemptComboNum1;
					int attemptComboNum2;
					int attemptComboNum3;
					
					resetDial();
					
					System.out.println("Right  " + RightComboNum1 + "   " + ComboNum1 ); 
					System.out.println("Left   " + LeftComboNum2 + "   " + ComboNum2 );
					System.out.println(" Right " + RightComboNum3 + "   " + ComboNum3 );
					if((RightComboNum1==ComboNum1) && (LeftComboNum2==ComboNum2) && (RightComboNum3==ComboNum3)) {
						return true;
					}else{					
						return false; 
							
					}
			}
			public boolean openLockOld(int RightComboNum1, int LeftComboNum2, int RightComboNum3)
			{
					int attemptComboNum1;
					int attemptComboNum2;
					int attemptComboNum3;
					
					resetDial();
					attemptComboNum1=turnRight(RightComboNum1);
					attemptComboNum2=turnLeft(LeftComboNum2);
					attemptComboNum3=turnRight(RightComboNum3);
					System.out.println("Error   " + attemptComboNum1 + "   " + ComboNum1 ); 
					System.out.println("Error   " + attemptComboNum2 + "   " + ComboNum2 );
					System.out.println("Error   " + attemptComboNum3 + "   " + ComboNum3 );
					if((attemptComboNum1==ComboNum1) && (attemptComboNum2==ComboNum2) && (attemptComboNum3==ComboNum3)) {
						return true;
					}else{					
						return false; 
							
					}
			}
			
			public int getComboNum1()
			{
				return ComboNum3;
			}
			public int getComboNum2()
			{
				return ComboNum2;
			}
			public int getComboNum3()
			{
				return ComboNum3;
			}
			
			
			
}
