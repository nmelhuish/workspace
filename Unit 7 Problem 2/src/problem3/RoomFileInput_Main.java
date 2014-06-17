package problem3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class RoomFileInput_Main {

	public static void main(String[] args) {
		String String1 = JOptionPane.showInputDialog("Enter File Name");
		String fileName = String1;
		PrintWriter output = null;
		File file = new File(fileName);
		Scanner input=null;
		
			try {
				 input = new Scanner(new File (String1));
				}catch (FileNotFoundException e) {
					
					System.out.println("File not found");
			
		}
//			Reads Document
			String	nextLine;
			while(input.hasNext()) {
				nextLine = input.nextLine();
				System.out.println(nextLine);
				String[] fields = nextLine.split(":");
				System.out.println(fields[1]);
			}
			
	}
}
