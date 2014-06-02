package problem4;

public class Phone extends Electronics {

	
String type1;

//Overload constructors
public Phone() {
	super();
	this.type1="no type";
	this.serviceProvider= "no provider";
}
//Overload
private Phone(int powerUsage, int weight, float cost, int resolution, String type) {
	super();
	this.serviceProvider= "no provider";
	this.type1= "no type";
}

//setters and getters
public String getType() {
	return type1;
}
public void setType(String type) {
	this.type1 = type;
}
public String getServiceProvider() {
	return serviceProvider;
}
public void setServiceProvider(String serviceProvider) {
	this.serviceProvider = serviceProvider;
}
String serviceProvider; 




@Override
	public String toString() {
		return "Phone [type=" + type1 + ", serviceProvider=" + serviceProvider
				+ ", powerUsage=" + powerUsage + ", weight=" + weight
				+ ", cost=" + cost + "]";
		}
		public void printPhone() {
			System.out.println(this.toString());
		}
		
			
		
			
}