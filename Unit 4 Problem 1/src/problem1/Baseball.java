package problem1;

import problem1.Sports;

public class Baseball extends Sports {

	int strikeOuts;
	int RBI;
	int HR;

	//Overload constructors
	public Baseball() {
		super();
		this.strikeOuts=0;
		this.RBI=0;
		this.HR=0;
	}
	//Overload
	public Baseball(int wins, int loses, int stirkeOuts, int RBI, int HR) {
		super();
		this.strikeOuts=0;
		this.RBI=0;
		this.HR=0;
	}
//	setters getters
	public int getStrikeOuts() {
		return strikeOuts;
	}
	public void setStrikeOuts(int strikeOuts) {
		this.strikeOuts = strikeOuts;
	}
	public int getRBI() {
		return RBI;
	}
	public void setRBI(int rBI) {
		RBI = rBI;
	}
	public int getHR() {
		return HR;
	}
	public void setHR(int hR) {
		HR = hR;
	}
	@Override
	public String toString() {
		return "Baseball [strikeOuts=" + strikeOuts + ", RBI=" + RBI + ", HR="
				+ HR + ", wins=" + wins + ", loses=" + loses + "]";
	}

	public void printBaseball() {
		System.out.println(this.toString());
	}


}
	
