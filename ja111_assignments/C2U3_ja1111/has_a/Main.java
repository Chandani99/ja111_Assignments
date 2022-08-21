package has_a;

public class Main {
	public static Person generatePerson(Person person) {
		
		
		if(person instanceof Student) {
		Student st=(Student)person;
		st.courseEnrolled="23";
		st.studentId=250125;
		st.name="XYZ";
		st.gender="Male";
		st.courseFee=2500;
		st.ad.city="Chennai";
		st.ad.state="Tamil Nadu";
		st.ad.pinCode="60001";
//	
		return st;
		}
		else if(person instanceof Instructor) {
				
			Instructor ins=(Instructor) person;
			ins.name="Ratan Lal";
			ins.instructorId=12312;
			ins.salary=45000;
			ins.gender="Male";
			ins.ad.city="Chennai";
			ins.ad.state="Tamil Nadu";
			ins.ad.pinCode="60001";
			
			return ins;
		}
		return null;
		
	}
	public static void main(String[] args) {
		Person person=new Person();
		System.out.println( );
		
		Person newStudent = generatePerson(new Student());

		Person newTeacher = generatePerson(new Instructor());
		System.out.println(newStudent);
		System.out.println(newTeacher);
	}

}
