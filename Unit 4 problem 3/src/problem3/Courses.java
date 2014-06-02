package problem3;

import java.util.Scanner;

public class Courses {

	
	// TODO Auto-generated method stub		
//		overload
		public Courses(int ClassNumber, int level) {
			super();
			this.ClassNumber= ClassNumber;
			this.level= level;
			
		}
//		Default
		public Courses() {
			this(0,0);
			this.ClassNumber = ClassNumber;
			this.level = level;
		}
		
		
			int ClassNumber=0;
			int level=0;
			public int getClassNumber() {
				return ClassNumber;
			}
			public void setClassNumber(int ClassNumber) {
				this.ClassNumber = ClassNumber;
			}
			public int getLevel() {
				return level;
			}
			public void setLevel(int level) {
				this.level = level;
			}
		
			
			
			
	



		
}



