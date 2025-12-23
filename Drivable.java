
public interface Drivable {

	double PI = 3.14;
	//interface içindeki tüm metotlar varsayılan olarak public ve abstracttır.
	//interface içindeki tüm değişkenler public static finaldır (yani sabittir).
	int getWheels();
	
	void setWheels(int numWheels);
	
	double getSpeed();
	
	void setSpeed(double speed);
	
	
}
