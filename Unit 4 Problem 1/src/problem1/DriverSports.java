package problem1;

import java.util.Scanner;

public class DriverSports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		PRINTING OUT Baseball
		Baseball Baseball= new Baseball();	
		System.out.println("BASEBALL STATS");
		Scanner input = new Scanner(System.in);	
		System.out.println("");
		System.out.println("Wins: ");
		int wins = input.nextInt();
		Baseball.setWins(wins);
		System.out.println("Loses: ");
		int loses = input.nextInt();
		Baseball.setLoses(loses);
		System.out.println("Number of Strikeouts:");
		int strikeouts = input.nextInt();
		Baseball.setStrikeOuts(strikeouts);
		System.out.println("RBI: ");
		int RBI = input.nextInt();
		Baseball.setRBI(RBI);
		System.out.println("HR:");
		int HR = input.nextInt();
		Baseball.setHR(HR);
		Baseball.printBaseball();
		
//		PRINTING FOOTBALL
		Football Football= new Football();	
		System.out.println("FOOTBALL STATS");
		System.out.println("");
		System.out.println("Wins: ");
		int wins1 = input.nextInt();
		Baseball.setWins(wins1);
		System.out.println("Loses: ");
		int loses1 = input.nextInt();
		Baseball.setLoses(loses1);
		System.out.println("Number of Tackles:");
		int tackles = input.nextInt();
		Football.setTackles(tackles);
		System.out.println("Sacks: ");
		int sacks = input.nextInt();
		Football.setSacks(sacks);
		System.out.println("HR:");
		int TD = input.nextInt();
		Football.setTD(TD);
		Football.printFootball();
		
//		PRINTING SOCCER
		Soccer Soccer= new Soccer();	
		System.out.println("SOCCER STATS");
		System.out.println("");
		System.out.println("Wins: ");
		int wins11 = input.nextInt();
		Baseball.setWins(wins11);
		System.out.println("Loses: ");
		int loses11 = input.nextInt();
		Baseball.setLoses(loses11);
		System.out.println("Number of Goals");
		int goals = input.nextInt();
		Soccer.setGoals(goals);
		System.out.println("RBI: ");
		int saves = input.nextInt();
		Soccer.setSaves(saves);
		Soccer.printSoccer();
		
		
		
		
		
	}

}
