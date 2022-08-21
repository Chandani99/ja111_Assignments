package Question_2;

public class PermanentEmployee extends Employee{
	
	double basicPay;

	public PermanentEmployee(int employeeId, String employeeName,double basicPay) {
		super(employeeId, employeeName);
		this.basicPay=basicPay;
		
	}

	@Override
	public void calculateSalary() {
		
		double pfAmount=basicPay * 0.12;
		
		double sal=basicPay-pfAmount;
		
		this.setSalary(sal);
		
	}

}
