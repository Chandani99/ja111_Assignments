package com.masai.EmployeeDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.EmpUtility.DBConnUtil;

import com.masai.exception.EmployeeException;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public String saveEmployeeDetails(Employee employee) {
    String message = "Not inserted...";
		
		try(Connection conn= DBConnUtil.provideConn()) {
			
			
			PreparedStatement ps= conn.prepareStatement("insert into Employee values(?,?,?,?)");
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAdderss());
			ps.setInt(4, employee.getSalary());
			
			int x= ps.executeUpdate();
			
			if(x > 0)
				message = "Inserted successfully..!";
			
			
		} catch (SQLException e) {
		
			message = e.getMessage();
		}
		
		return message;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee student = null;
		
		try(Connection conn = DBConnUtil.provideConn()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select * from student where eid =?");
			
			ps.setInt(1, empId);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				
				int i= rs.getInt("eid");
				String n= rs.getString("name");
				String a= rs.getString("address");
				int s= rs.getInt("salary");
				
				student = new Employee(i, n, a, s);
				
				
			}else
				throw new EmployeeException("Employee does not exist with id :"+empId);
			
			
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			
			throw new EmployeeException(e.getMessage());
		}
		
		
		
		
		
		
		
		return student;
	}

	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {
          List<Employee> employee = new ArrayList<>();
		
		
		try(Connection conn = DBConnUtil.provideConn()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select * from employee");
			ResultSet rs= ps.executeQuery();
			
			
			while(rs.next()) {
				
				int i= rs.getInt("eid");
				String n= rs.getString("name");
				String a= rs.getString("address");
				int s= rs.getInt("salary");
				
				Employee employee1 = new Employee(i, n, a,s);
				
				employee.add(employee1);
				
			}
			
			if(employee.size() <=0)
				throw new EmployeeException("There is no any Employee");
			
			
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
		
	}

	

}
