package motorBikeClass2;

public class MotorBike {
	private int speed;
	
	public void start() {
		System.out.println("Bike started!");
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
}
