package problem1;


import problem1.Sports;

public class Football extends Sports {

	int tackles;
	int sacks;
	int TD;

	//Overload constructors
	public Football() {
		super();
		this.tackles=0;
		this.sacks=0;
		this.TD=0;
	}
	//Overload
	public Football(int wins, int loses, int tackles, int sacks, int TD) {
		super();
		this.tackles=0;
		this.sacks=0;
		this.TD=0;
	}
//	setters getters
	public int getTackles() {
		return tackles;
	}
	public void setTackles(int tackles) {
		this.tackles = tackles;
	}
	public int getSacks() {
		return sacks;
	}
	public void setSacks(int sacks) {
		this.sacks = sacks;
	}
	public int getTD() {
		return TD;
	}
	public void setTD(int tD) {
		TD = tD;
	}
	
	
	@Override
	public String toString() {
		return "Football [tackles=" + tackles + ", sacks=" + sacks + ", TD="
				+ TD + ", wins=" + wins + ", loses=" + loses + "]";
	}
	public void printFootball() {
		System.out.println(this.toString());
	}




}
