package problem4;

import java.util.Scanner;

public class Electronics {

	
	
		// TODO Auto-generated method stub		
//	overload
	public Electronics(int powerUsage, int weight, float cost) {
		super();
		this.powerUsage= powerUsage;
		this.weight= weight;
		this.cost= cost;
	}
//	Default
	public Electronics() {
		this(0,0,0);
	}
	
		int powerUsage;
		int weight=0;
		float cost;
		public void setWeight(int newWeight) {
	 		 weight = newWeight;
		}
		public void setCost(int newCost) {
	 		 cost = newCost;
		}
		public void setPowerUsage(int newPowerUsage) {
	 		  powerUsage = newPowerUsage;
		}
		public int getWeight() {
			return weight;
		}
		
}


