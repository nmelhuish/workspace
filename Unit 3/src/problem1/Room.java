package problem1;

public class Room {

	
		// TODO Auto-generated constructor stub
			
		/** color, floor type, number of windows*/
		private String color;
		private String floorType;
		private int numWindow;
		
		public Room() {
		
			/** Default */
			color= "white";
			floorType= "hardwood";
			numWindow= 0;
		}
		
		
		public Room (String initialColor, String initialFloorType, int initialNumWindow) {
			color= initialColor;
			if ((initialFloorType == "hard wood") || (initialFloorType == "carpeting") || (initialFloorType == "tiled" )) {
				floorType= initialFloorType;
			} else {
				System.out.println("Error: You need to enter- Hard Wood, Carpeting or Tiled");
				System.exit(0);
			}	
			if (initialNumWindow>=0) {
				numWindow=initialNumWindow;
			
			} else {
				System.out.println("Error: Number of windows cannot be negative"); 
				System.exit(0);
			
			}
		}	
		public void setRoom(String newColor, String newFloorType, int newNumWindow ) {
			color= newColor;
			if ((newFloorType == "hard wood") || (newFloorType == "carpeting") || (newFloorType == "tiled" )) {
				floorType= newFloorType;
			} else {
				System.out.println("Error: You need to enter- Hard Wood, Carpeting or Tiled");
				System.exit(0);
			}	
			if (newNumWindow>=0) {
				numWindow=newNumWindow;
			
			} else {
				System.out.println("Error: Number of windows cannot be negative"); 
				System.exit(0);
			}
		}
		public String getColor()
		{
			return color;
		}
		public String getFloorType()
		{
			return floorType;
		}
		public int getNumWindow()
		{
			return numWindow;
		}
		public void writeOutput()
		{
			System.out.println("The room color is: " + color);
			System.out.println("The floor type is: " + floorType);
			System.out.println("The number of windows is: " + numWindow);
		}
			
}
		
		
		
		
		
		
		
		
			
	
		

	
