package problem3;

import java.util.Scanner;

public class DriverCourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		PRINTING OUT ENGLISH
		English English= new English();
		System.out.println("ENGLISH");
		Scanner input = new Scanner(System.in);	
		System.out.println("");
		System.out.println("Class Number: ");
		int ClassNumber = input.nextInt();
		English.setClassNumber(ClassNumber);
		System.out.println("Level: ");
		int level = input.nextInt();
		English.setLevel(level);
		System.out.println("Journals:");
		String inches = input.next();
		English.setJournal(journal);
		System.out.println("Fiction: ");
		String fiction = input.next();
		English.setFiction(fiction);
		English.printEnglish();
		
//		PRINTING OUT MATH
		Math Math= new Math();
		System.out.println("MATH");
		System.out.println("");
		System.out.println("Class Number: ");
		int ClassNumber1 = input.nextInt();
		English.setClassNumber(ClassNumber1);
		System.out.println("Level: ");
		int level1 = input.nextInt();
		English.setLevel(level1);
		System.out.println("Inches:");
		int inches = input.nextInt();
		Math.setInches(inches);
		System.out.println("Cm ");
		int Cm = input.nextInt();
		Math.setCm(Cm);
		Math.printMath();
		
//		PRINTING OUT SCIENCE
		Science Science= new Science();	
		System.out.println("SCIENCE");
		System.out.println("");
		int ClassNumber11 = input.nextInt();
		English.setClassNumber(ClassNumber11);
		System.out.println("Level: ");
		int level11 = input.nextInt();
		English.setLevel(level11);
		System.out.println("Chemistry");
		String Chemistry= input.next();
		Science.setChemistry(Chemistry);
		System.out.println("Lab ");
		String lab = input.next();
		Science.setLab(lab);
		Science.printScience();
		
		
		
	}

}
