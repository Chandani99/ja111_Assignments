package com.masai.Entities;

public class SalariedEmp extends Employee{
	

		private int salary;
		
		public SalariedEmp() {
		}
		
		
		public SalariedEmp(int salary) {
			this.salary = salary;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "SalariedEmp [salary=" + salary + "]";
		}
		

}
