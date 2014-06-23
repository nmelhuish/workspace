package problem3;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class Student_ID extends JFrame {


	public Student_ID() {
		// Open or create a random access file
		try {
			
			
			System.out.println("Please enter the Student ID, or press '999' to exit.");
//			INPUTING STUDENT ID IN THE FILE
			String inputStudentID=null; 
			int StudentID=0;
			double inputGPA;
			long postition=0;
			while (StudentID != 999) {
				inputStudentID = JOptionPane.showInputDialog("Student ID");
				
				// The user entry for Student ID number must be exactly 6 digits long.
			        if (inputStudentID != null && inputStudentID.trim().length() == 6) {
			            StudentID=Integer.parseInt(inputStudentID);
			        }
			        else if(Integer.parseInt(inputStudentID) == 999) {			        	
			        	break;
			        }
			        else{
			        	throw new IOException("Error: Student ID Must Be 6 Digits");
			        }
			        
			
				
				inputGPA = Double.parseDouble(JOptionPane.showInputDialog("GPA"));
				postition=writeToFile("Student ID.txt", StudentID, inputGPA, postition);
				System.out.println("GPA" + postition);
				if(inputGPA > 4.0) {
					System.out.println("Error: GPA Cannot be that high");
					System.exit(0);
				}
				else if (inputGPA < 0.0){
						System.out.println("Error: GPA Cannot be that low");
						System.exit(0);
					
				}
				
			
			}	
			
		} catch (IOException ex) {
			System.out.print("Error: " + ex);
			System.exit(1);
		}
	}

		

	public static void main(String[] args) {
		Student_ID frame = new Student_ID();
		int postition=0;
		int prtStudentID=0;
		double prtGPA;
		int RequestedStudentID;
		
//		REQUESTING THE GPA OF A STUDENT
		RequestedStudentID = Integer.parseInt(JOptionPane.showInputDialog("Type in Student ID you want the GPA for"));
		while(prtStudentID!=999) {
			try {
				prtStudentID=readStudentIDFromFile("Student ID.txt", postition);
				System.out.println("prt" + prtStudentID);
				postition = postition + 4;
				prtGPA=readGPAFromFile("Student ID.txt", postition);
				System.out.println("prt2 " + prtStudentID);
				postition = postition + 8;
				
				if(RequestedStudentID==prtStudentID){
					System.out.println("The Requested Student " + prtStudentID + " GPA is " + prtGPA);
					System.exit(0);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("GPA" + postition);
		}

		
	}
	private static int  readStudentIDFromFile(String filePath, int position)  throws IOException {
	
	  RandomAccessFile file = new RandomAccessFile(filePath, "r");
	  	file.seek(position);
	  
	  	int ID=file.readInt();
	  	file.close();
	  		return ID;
	}
	private static double readGPAFromFile(String filePath, int position)  throws IOException {
		
		  RandomAccessFile file = new RandomAccessFile(filePath, "r");
		  	file.seek(position);
		 
		  	double GPA = file.readDouble();
		  	file.close();
		  		return GPA;
		}
	 private static long writeToFile(String filePath, int StudentID, double GPA, long position) throws IOException {
	
	  RandomAccessFile file = new RandomAccessFile(filePath, "rw");
	  file.seek(position);
	  file.writeInt(StudentID);
	  System.out.println("prt" + file.getFilePointer());
	  file.writeDouble(GPA);
	 long pointer = file.getFilePointer();
	  file.close();
	  return pointer;
	
	 
	
	}

}
