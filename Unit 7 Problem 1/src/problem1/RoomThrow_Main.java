package problem1;


public class RoomThrow_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoomThrow rm= new RoomThrow();
		rm.writeOutput();
		rm.setRoom("Yellow", "hard wood", 1);
		rm.writeOutput();
		rm.setRoom("Purple", "tiled", 0);
		rm.writeOutput();
		rm.setRoom("White","carpeting", 3);
		rm.writeOutput();
	}

}
