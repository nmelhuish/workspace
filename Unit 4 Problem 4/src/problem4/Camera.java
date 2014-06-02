package problem4;

public class Camera extends Electronics{
	int numOfPixels;
	double flashSpeed1;
//	Overload constructors
	public Camera() {
	super();
	this.flashSpeed1=0.0;
	this.numOfPixels=0;
	}
//	Overload
	public Camera(int powerUsage, int weight, float cost, int numOfPixels, double flashSpeed) {
		super(powerUsage, weight, cost);
		this.numOfPixels=0;
		this.flashSpeed1=0.0;
	}
	
	
//	Getter setter	
	
	
	
	public int getNumOfPixels() {
		return numOfPixels;
	}
	public void setNumOfPixels(int numOfPixels) {
		this.numOfPixels = numOfPixels;
	}
	public double getFlashSpeed() {
		return flashSpeed1;
	}
	public void setFlashpeed(float flashSpeed) {
		this.flashSpeed1 = flashSpeed;
	}
	float flashSpeed;
	
	
@Override
	public String toString() {
		return "Camera [numOfPixels=" + numOfPixels + ", flashSpeed="
				+ flashSpeed1 + " , powerUsage="
				+ powerUsage + ", weight=" + weight + ", cost=" + cost + "]";
		}
	public void printCamera() {
			System.out.println(this.toString());
	}
}
