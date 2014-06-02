package problem3;

import problem3.Courses;

public class Math extends Courses {

		int inches;
		int Cm;
	

		//Overload constructors
		public Math() {
			super();
			this.inches=0;
			this.Cm=0;
		}
		//Overload
		public Math(int ClassNumber, int level, int inches, int Cm) {
			super();
			this.inches=0;
			this.Cm=0;

		
		}
		public int getInches() {
			return inches;
		}
		public void setInches(int inches) {
			this.inches = inches;
		}
		public int getCm() {
			return Cm;
		}
		public void setCm(int cm) {
			Cm = cm;
		}
		
		@Override
		public String toString() {
			return "Math [inches=" + inches + ", Cm=" + Cm + ", ClassNumber="
					+ ClassNumber + ", level=" + level + "]";
		}
		public void printMath() {
			System.out.println(this.toString());
		}
}
