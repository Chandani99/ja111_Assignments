package carBean;

public class Ola {
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3) {
			HatchBack hb=new HatchBack();
			hb.setNumberOfPassenger(numberOfPassenger);
			hb.setNumberOfKms(numberOfKMs);
			return hb;
			
		}
		Sedan sd=new Sedan();
		sd.setNumberOfPassenger(numberOfPassenger);
		sd.setNumberOfKms(numberOfKMs);
		return sd;
		
	}

	public int calculateBill(Car car) {
		
		
		if(car instanceof HatchBack){
			HatchBack hb1= ( HatchBack) car;
			int total1=hb1.getNumberOfKms()*hb1.farePerKm;
			return total1;
        }
		Sedan sd=( Sedan)car;
	
		int total=sd.getNumberOfKms()*sd.farePerKm;
		
		return total;
	}
	
}
