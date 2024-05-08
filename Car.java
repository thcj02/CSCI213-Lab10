/* 
* Car.java
* 
* Author: Torryn Carey-Jarrell
* Data: 5/7/24
* Class: CSCI 213
* 
*
* Car.java extends Vehicle and creates a car with doors, make, model, plate
* and passengers.
*/

public class Car extends Vehicle{
	
	public int doors;
	public int passengers;
	
	public Car(String theMake, String theModel, String thePlate, 
		int theDoors, int thePassengers){
		
		super(theMake, theModel, thePlate);
		this.doors = theDoors;
		this.passengers = thePassengers;
	}
	
	public int getDoors(){
		
		return this.doors;
	}
	
	public int getPassengers(){
		
		return this.passengers;
	}
	
	public String toString(){
		
		String string = String.format("%d-door %s %s with license %s", this.doors);
		return string;
	}
	
	public boolean equals(Object obj){
		
		if(!(obj instanceof Car)){
			
			return false;
		}
		
		Car equals = (Car) obj;
		return super.equals(equals) && this.doors == equals.doors && this.passengers == equals.passengers;
	}
	
	public Car copy(){
		
		int doors = this.getDoors();
		int passengers = this.getPassengers();
		Car copyCar = new Car(super.getMake(), super.getModel(), super.getPlate(), doors, passengers);
		
		return copyCar;
	}
}