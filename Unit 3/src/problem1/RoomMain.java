package problem1;

import javax.swing.JOptionPane;

public class RoomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room rm= new Room();
		rm.writeOutput();
		rm.setRoom("Yellow", "hard wood", 1);
		rm.writeOutput();
		rm.setRoom("Purple", "tiled", 0);
		rm.writeOutput();
		rm.setRoom("White","carpeting", 3);
		rm.writeOutput();
	}

}
