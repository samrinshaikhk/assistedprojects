package exceptionhandling;

 @SuppressWarnings("serial")
class EmployeeNotFoundException extends Exception {
	
}

class Employee {
	
	Employee readEmployee(int empId) throws EmployeeNotFoundException {
		if(empId == 0) {
			throw new EmployeeNotFoundException();
		}
		return null;
	}
	
}

public class CustomExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		try {
			e.readEmployee(0);
		} 
		catch (EmployeeNotFoundException e1) {
			e1.printStackTrace();
		}
		
	}

}

