package problem2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class RoomFile {

	
		// TODO Auto-generated constructor stub
			
		/** color, floor type, number of windows*/
		private String color;
		private String floorType;
		private int numWindow;
		
		public RoomFile() {
		
			/** Default */
			color= "white";
			floorType= "hardwood";
			numWindow= 0;
		}
		
		
		public RoomFile (String initialColor, String initialFloorType, int initialNumWindow) {
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
			
		
			
		
		String fileName = "Room.txt";
		
		PrintWriter outputStream= null; {
		try
		{
			outputStream = new PrintWriter(fileName);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file" + fileName);
			
		}
		{
			outputStream.println("The room color is: " + color);
			outputStream.println("The floor type is: " + floorType);
			outputStream.println("The number of windows is: " + numWindow);
			
		}
		outputStream.close();
		System.out.println("Those lines were written to:" + fileName);
		}
	}
}
	