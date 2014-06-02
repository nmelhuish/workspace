package problem4;

public class Tv extends Electronics {
int resolution;

//Overload constructors 
	public Tv() {
		super();
		this.resolution=0;
		this.type= "no brand";
}
//Overload
	public Tv(int powerUsage, int weight, float cost, int resolution, String type) {
		super();
		this.resolution=0;
		this.type= "no brand";
	}



//getters and setters
public int getResolution() {
	return resolution;
}
public void setResolution(int resolution) {
	this.resolution = resolution;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
String type;



@Override
public String toString() {
	return "Tv [resolution=" + resolution + ", type=" + type + ", powerUsage="
			+ powerUsage + ", weight=" + weight + ", cost=" + cost + "]";
}

public void printTv() {
	System.out.println(this.toString());
}



}

