package problem1;

import problem1.Sports;

public class Soccer extends Sports {

	int goals;
	int saves;
	

	//Overload constructors
	public Soccer() {
		super();
		this.goals=0;
		this.saves=0;
		
	}
	//Overload
	public Soccer(int wins, int loses, int goals, int saves) {
		super();
		this.goals=0;
		this.saves=0;
		
	}
//	setters getters
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
	public int getSaves() {
		return saves;
	}
	public void setSaves(int saves) {
		this.saves = saves;
	}
	@Override
	public String toString() {
		return "Soccer [goals=" + goals + ", saves=" + saves + ", wins=" + wins
				+ ", loses=" + loses + "]";
	}

	public void printSoccer() {
		System.out.println(this.toString());
	}


}
