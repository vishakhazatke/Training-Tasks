package Day3;

class Employee{
	
	int employeeId;
	
	String employeeName;
	
	Employee(){
		
		this(101, "Vishakha");
	}
	
	Employee(int id , String name){
		
		this.employeeId = id;
		this.employeeName = name;
	}
	
	void employeeDetails() {
		
		System.out.println("The Employee ID is : " + employeeId);
		System.out.println("The Employee Name is : " + employeeName);
	}
}

public class ConstructorChainingDemo {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.employeeDetails();
	}
}
