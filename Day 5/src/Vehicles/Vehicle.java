package Vehicles;

public class Vehicle extends Engine implements Status{
	int gear=0,speed=0;
	
	@Override
	public void DisplayStatus() {
		// TODO Auto-generated method stub
		System.out.println("Speed is: "+getSpeed()+" Gear is "+getGear());
	}

	@Override
	public void gearUp(int a) {
		// TODO Auto-generated method stub
		gear=gear+a;
		setGear(gear);
		DisplayStatus();
	}

	@Override
	public void speedUp(int a) {
		// TODO Auto-generated method stub
		speed=speed+a;
		setSpeed(speed);
		DisplayStatus();
	}
	
}
