package Vehicles;

public abstract class Engine {
	int speed,gear;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public abstract void gearUp(int a);
	public abstract void speedUp(int a);
}
