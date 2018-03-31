/****************************************************************************
 *
 * Created by: Heejo Suh
 * Created on: Mar 2018
 * Created for: learning
 * 
 * This program uses the stack 'Vehicle',
 * a stub program that creates 2 vehicles, 
 * changes their fields and gives back their state
 *
 ****************************************************************************/


//****************************************************************************
public class Main {
	//This class tests the stack
	
	//-----------------------
	public static void main(String[] args) throws Exception {
		//instantiate a stack object and insert/remove stuff
		
		//Vehicle 1
		System.out.println("Vehicle 1-----------");
		//instantiate new vehicle
		Vehicle vehicle1 = new Vehicle("E1F2G3H","Red");
		vehicle1.Accelerate(1);
		System.out.println("Speed: "+vehicle1.getSpeed());
		vehicle1.Accelerate(5);
		System.out.println("Speed: "+vehicle1.getSpeed());
		vehicle1.Decelerate(500);
		System.out.println("Speed: "+vehicle1.getSpeed());
		

		//Vehicle 2
		System.out.println("\nVehicle 2-----------");
		//instantiate new vehicle
		//Vehicle vehicle2 = new Vehicle();
		Vehicle vehicle2 = new Vehicle("POI0987", "Black");
		System.out.println("License Plate: "+vehicle2.getLicensePlate());
		//set license plate
		vehicle2.setLicensePlate("3F4G5H6");
		System.out.println("License Plate: "+vehicle2.getLicensePlate());
		//set colour
		vehicle2.setColour("Yellow");
		System.out.println("Colour: "+vehicle2.getColour());
	}
}
