package problem3;

import problem3.Courses;

public class Science extends Courses {

		String chemistry;
		String lab;
	

		//Overload constructors
		public Science() {
			super();
			this.chemistry= "no chem";
			this.lab= "no lab";
		}
		//Overload
		public Science(int ClassNumber, int level, String chemistry, String lab) {
			super();
			this.chemistry= "no chem";
			this.lab= "no lab";
		
		}
		public String getChemistry() {
			return chemistry;
		}
		public void setChemistry(String chemistry) {
			this.chemistry = chemistry;
		}
		public String getLab() {
			return lab;
		}
		public void setLab(String lab) {
			this.lab = lab;
		}
		@Override
		public String toString() {
			return "Science [chemistry=" + chemistry + ", lab=" + lab
					+ ", ClassNumber=" + ClassNumber + ", level=" + level + "]";
		}
		public void printScience() {
			System.out.println(this.toString());
		}
}	