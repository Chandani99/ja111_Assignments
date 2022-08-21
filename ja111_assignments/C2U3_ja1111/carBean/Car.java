package carBean;

public class Car {
	private int numberOfPassenger ;
    private int numberOfKms;
    
    public Car() {
    	
    }
	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}
	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}
	public int getNumberOfKms() {
		return numberOfKms;
	}
	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKms = numberOfKms;
	}
}


// Sedan class================================
class Sedan extends Car{
	final int farePerKm =20;
	public int numOfPass() {
		int num=super.getNumberOfPassenger();
		return num;
	}
}


//HatchBack class================================
class HatchBack extends Car{
	final int farePerKm =15;
	public int numOfPass() {
		int num=super.getNumberOfPassenger();
		return num;
	}
}

