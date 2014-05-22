package Problem2;

import javax.swing.JOptionPane;

public class diving {
	public static void main(String[] args) {
		float totalScore=calculateScore();
		
	System.out.println("The divers total score is: " + totalScore);
		


	}

	public static float inputValidScore(int i)
	{	
	
		float Score;
		Score=Float.parseFloat(JOptionPane.showInputDialog("Judge enter your score: " + i));
		return Score;

	}

	public static float[]  inputAllScores()
	{
		float[]Score=new float [10];
		int i; 
		for( i=1;i <= 7; i++) {
			Score[i]=inputValidScore(i);
			
		}
		return Score;

	}
	
	
	
	


	public static float  inputValidDegreeOfDifficulty()
	{

		float Difficulty; 
		 Difficulty=Float.parseFloat(JOptionPane.showInputDialog("Type Degree of Difficulty: "));
		 return Difficulty;
	 
	 }

	public static float calculateScore()
	{
	 float totalScore;
	 float max=0;
	 float min=10;
	 int i;
	 float sum=0;
	 float[]jdScore=new float [10];
		float DegDiff=inputValidDegreeOfDifficulty();
		jdScore=inputAllScores();
		for( i=1;i <= 7; i++) {
			if (jdScore[i]>max)
				max=jdScore[i];
			else if(jdScore[i]<min)
				min=jdScore[i];
			sum=jdScore[i] +sum;
		}
		
		
		totalScore=(sum-max-min)*DegDiff;
		totalScore= (float) (totalScore * 0.6);
		return totalScore;
	}
}
	