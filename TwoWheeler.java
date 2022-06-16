package week1.day2;

public class TwoWheeler {
	int noOfWheels;
	short noOfMirrors;
	long chassisNumber;
	boolean isPunctured;
	String bikeName;
	double runningKM;
	public static void main(String[] args) {
		TwoWheeler tw = new TwoWheeler();
		tw.bikeName = "Enfield";
		tw.chassisNumber=1233343434L;
		tw.isPunctured = true;
		tw.noOfMirrors = 2;
		tw.noOfWheels = 2;
		tw.runningKM = 1000.67;
		
		System.out.println("Bike Name is "+tw.bikeName);
		System.out.println("Bike Chassis Number is "+tw.chassisNumber);
		System.out.println("Is Bike punctured? "+tw.isPunctured);
		System.out.println("No of mirrors in bike: "+tw.noOfMirrors);
		System.out.println("No of wheels in bike: "+tw.noOfWheels);
		System.out.println("Running km of the bikw is "+tw.runningKM);
	}
	
}
