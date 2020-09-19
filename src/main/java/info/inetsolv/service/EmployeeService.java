package info.inetsolv.service;

import org.springframework.stereotype.Service;

import info.inetsolv.exceptionhandling.EmployeeServiceException;
import info.inetsolv.model.Employee;

@Service
public class EmployeeService {
	
	//return employee object
		public Employee getEmployee() throws EmployeeServiceException {
			Employee emp = new Employee();
			emp.setName("emp1");
			emp.setDesignation("manager");
			emp.setEmpId("1");
			emp.setSalary(3000);

			return emp;
		}

	    //return employee as null
		public Employee getEmployeeNull() throws EmployeeServiceException {

			return null;
		}

	    //throw exception
		public Employee getEmployeeException() throws EmployeeServiceException {
			System.out.println("Rakesh kumar");
			throw new EmployeeServiceException();
		}

}
