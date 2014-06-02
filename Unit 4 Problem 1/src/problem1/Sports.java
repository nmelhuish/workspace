package problem1;

import java.util.Scanner;

public class Sports {

	
	// TODO Auto-generated method stub		
//		overload
		public Sports(int wins, int loses) {
			super();
			this.wins= wins;
			this.loses= loses;
			
		}
//		Default
		public Sports() {
			this(0,0);
			this.wins = wins;
			this.loses = loses;
		}
		
		
			int wins=0;
			int loses=0;
			public int getWins() {
				return wins;
			}
			public void setWins(int wins) {
				this.wins = wins;
			}
			public int getLoses() {
				return loses;
			}
			public void setLoses(int loses) {
				this.loses = loses;
			}
		
			
			
			
	



		
}


