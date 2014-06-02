package problem3;

import problem3.Courses;

public class English extends Courses {

		String journal;
		String fiction;
	

		//Overload constructors
		public English() {
			super();
			this.journal= "no journal yet";
			this.fiction= "fiction";
		}
		//Overload
		public English(int ClassNumber, int level, String journal, String fiction) {
			super();
			this.journal="no journal yet";
			this.fiction="fiction";

		}
		public String getJournal() {
			return journal;
		}
		public void setJournal(String journal) {
			this.journal = journal;
		}
		public String getFiction() {
			return fiction;
		}
		public void setFiction(String fiction) {
			this.fiction = fiction;
		}
		@Override
		public String toString() {
			return "English [journal=" + journal + ", fiction=" + fiction
					+ ", ClassNumber=" + ClassNumber + ", level=" + level + "]";
		}
		public void printEnglish() {
			System.out.println(this.toString());
		}
}
