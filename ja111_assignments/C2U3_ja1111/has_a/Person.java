package has_a;

public class Person {
	String name ;

	String gender;
	
	Address ad;

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", ad=" + ad + "]";
	}
	
}

//Address class=====================================

class Address{
	String city  ; 

	String state ;
	String pinCode ;
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
	}
	
}

//Instructor class=====================================

class Instructor extends Person{
	int instructorId ; 

	int salary ;

	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + "]";
	} 
	
}

//Student class=====================================

class Student extends Person{
	int studentId ; 
	String courseEnrolled ; 
	int courseFee ;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				+ "]";
	}
	
}