package Question_2;

public class Main {

	public static void main(String[] args) {
		Employee em=new PermanentEmployee(101,"Chandani",85000.00);
		
		Employee em1=new TemporaryEmployee(201,"xyz",500,5);
		
		Employee em2=null;
		
		Loan l=new Loan();
		
		double result =l.calculateLoanAmount(em);
		double result1=l.calculateLoanAmount(em1);
		double result2 =l.calculateLoanAmount(em2);
		
		System.out.println("Permanent Employee Details========= " );
		System.out.println("Id: " +em.getEmployeeId());
		System.out.println("Name: " +em.getEmployeeName());
		System.out.println("Salary: " +em.getSalary());
		System.out.println("Loan of permanent Employee: "+ result );
		
		System.out.println("Temporary Employee Details========= " );
		System.out.println("Id: " +em1.getEmployeeId());
		System.out.println("Name: " +em1.getEmployeeName());
		System.out.println("Salary: " +em1.getSalary());
		System.out.println("Loan of permanent Employee: "+ result1 );
		
		
		System.out.println("Null Employee Details========= " );
		System.out.println("Loan of permanent Employee: "+ result2 );
	}

}
