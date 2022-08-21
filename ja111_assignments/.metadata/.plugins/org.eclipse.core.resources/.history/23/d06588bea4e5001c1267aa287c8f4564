package Question_2;
   
public class Loan {
	
//	private Loan(int employeeId, String employeeName,double basicPay) {
//		
//	}
	 public double calculateLoanAmount(Employee employeeObj) {
		 if(employeeObj instanceof PermanentEmployee) {
			 PermanentEmployee pe=(PermanentEmployee)employeeObj;
			 double loan=pe.salary*15/100;
			 return loan;
		 }
		 else if(employeeObj instanceof TemporaryEmployee) {
			 TemporaryEmployee te= (TemporaryEmployee)employeeObj; 
			 double loan=te.salary*15/100;
			 return loan;
		 }
		return 0;
	    	
	    }
}
