package problem4;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		PRINTING OUT CAMERA 
		Camera Camera= new Camera();	
		System.out.println("CAMERA SPECS");
		Scanner input = new Scanner(System.in);	
		System.out.println("Power Usage: ");
		int powerUsage = input.nextInt();
		Camera.setPowerUsage(powerUsage);
		System.out.println("Weight: ");
		int weight = input.nextInt();
		Camera.setWeight(weight);
		System.out.println("Cost: ");
		int cost = input.nextInt();
		Camera.setCost(cost);
		System.out.println("Number of Pixels");
		int numOfPixels = input.nextInt();
		Camera.setNumOfPixels(numOfPixels);
		System.out.println("Flash Speed: ");
		int flashSpeed = input.nextInt();
		Camera.setFlashpeed(flashSpeed);
		Camera.printCamera();
		
//		PRINT OUT TV
		Tv Tv = new Tv();
		System.out.println("TV SPECS ");
		System.out.println("Power Usage: ");
		int powerUsage1 = input.nextInt();
		Tv.setPowerUsage(powerUsage);
		System.out.println("Weight: ");
		int weight1 = input.nextInt();
		Tv.setWeight(weight);
		System.out.println("Cost: ");		
		int cost1 = input.nextInt();
		Tv.setCost(cost);
		System.out.println("Resolution: ");		
		int resolution = input.nextInt();
		Tv.setResolution(resolution);
		System.out.println("Brand: ");
		String type = input.next();
		Tv.setType(type);
		Tv.printTv();
		
//		PRINT PHONE
		Phone Phone= new Phone();
		System.out.println("PHONE SPECS ");
		System.out.println("Power Usage: ");
		int powerUsage11 = input.nextInt();
		Phone.setPowerUsage(powerUsage);
		System.out.println("Weight: ");
		int weight11 = input.nextInt();
		Phone.setWeight(weight);
		System.out.println("Cost: ");		
		int cost11 = input.nextInt();
		Phone.setCost(cost);
		System.out.println("Service Provider");
		String serviceProvider=input.next();
		Phone.setServiceProvider(serviceProvider);
		System.out.println("Brand");
		String brand=input.next();
		Phone.setType(brand);
		Phone.printPhone();
	}

}	


