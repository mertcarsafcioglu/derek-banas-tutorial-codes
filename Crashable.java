
public abstract class Crashable {
	boolean carDrivable = true;
	//abstract class, hem soyut (abstract) hem de somut (normal) metotlar içerebilir örnegin crashed somut diğerleri soyuttur.
	public void youCrashed() {
		this.carDrivable = false;
	}
	public abstract void setCarStrength(int carStrength);
	
	public abstract int getCarStrength();
	
}
