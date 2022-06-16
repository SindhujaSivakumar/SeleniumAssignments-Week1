package week1.day2;

public class Car {
	public void applyBreak() {
		System.out.println("Apply Break");
	}
	public void applyGear() {
		System.out.println("Apply Gear");
	}
	
	public void switchOnAc() {
		System.out.println("Switch on AC");
	}
	public void applyAcclerate() {
		System.out.println("Apply Accelerate");
	}

public static void main(String[] args) {
	Car ca = new Car();
	ca.applyBreak();
	ca.applyGear();
	ca.switchOnAc();
	ca.applyAcclerate();
	}
}
