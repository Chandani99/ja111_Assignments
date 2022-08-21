package carBean;

public class Ola {
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3) {
			Sedan sd=new Sedan();
			return sd;
		}
		HatchBack hb=new HatchBack();
		return hb;
	}

	public int calculateBill(Car car) {
		HatchBack hb1= new HatchBack();
		Sedan sd=(Sedan)car;
		if(car.equals(hb1)){
			int total1=car.getNumberOfPassenger()*hb1.farePerKm;
			return total1;
        }
		
		int total=car.getNumberOfPassenger()*sd.farePerKm;
		
		return total;
	}
	
}
