package problem1;

import javax.swing.JOptionPane;

public class unit2 {
	public static void main(String[] args) {
		int size = 0;
		int[]girlscouts=new int [10];
		
		size=Integer.parseInt(JOptionPane.showInputDialog("Enter number of girl scouts"));
			
			int i = 0;
			
			
		 			
		/** counting girlscout boxes*/
			
		int ctr0to10=0;	
		int ctr11to20=0;
		int ctr21to30=0;
		int ctr31to40=0;
		int ctr41ormore=0;
		for( i=1;i <= size; i++) {
			girlscouts[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter number of cookie boxes for girl scout #" + i));
			
			if(girlscouts[i] >=0 && girlscouts[i] <11) 
				ctr0to10++;
			else if (girlscouts[i] >=11 && girlscouts[i] <21)
				ctr11to20++;
			else if (girlscouts[i] >=21 && girlscouts[i] <30)
				ctr21to30++;
			else if (girlscouts[i] >=31 && girlscouts[i] <40)
				ctr31to40++;
			else if (girlscouts[i] >=41)
				ctr41ormore++;
			else
					System.out.println("Error: Negative number of boxes");
			return;
		
		}
					System.out.println("Total Boxes        Number of Girl Scouts");
					System.out.println("0 to 10" +  "                    "  + ctr0to10);
					System.out.println("11 to 20" +  "                   "  + ctr11to20);
					System.out.println("21 to 30" +  "                   " 	+ ctr21to30);
					System.out.println("31 to 40" +  "                   "  + ctr31to40);
					System.out.println("41 or more"+ "                 "  + ctr41ormore);
				
	}



}
