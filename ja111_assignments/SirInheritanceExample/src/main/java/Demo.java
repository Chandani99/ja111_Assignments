import javax.persistence.Entity;
import javax.persistence.EntityManager;

import com.masai.DBUtility.DBConnection;
import com.masai.Entities.ContractualEmp;
import com.masai.Entities.Employee;
import com.masai.Entities.SalariedEmp;

public class Demo {

	public static void main(String[] args) {
		
		EntityManager em=DBConnection.provideEntityManager();
		
		Employee emp=new Employee();
		emp.setName("Ram");
		
		
		SalariedEmp semp=new SalariedEmp();
		semp.setName("Mohan");
		semp.setSalary(85000);
		
		ContractualEmp cemp=new ContractualEmp();
		cemp.setName("Hari");
		cemp.setCostPerDay(3000);
		cemp.setNoOfWorkingDays(10);
		
		em.getTransaction().begin();
		em.persist(emp);
		em.persist(semp);
		em.persist(cemp);
		em.getTransaction().commit();
		
		System.out.println("done");

	}

}
