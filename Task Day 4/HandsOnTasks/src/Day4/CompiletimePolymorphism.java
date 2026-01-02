package Day4;

class Company{
	
	void empDetails(int id, String name) {
		
		System.out.println("The Emp Id is : " + id);
		System.out.println("The Emp name is : " + name);
	}
	
	void empDetails(int id, String name, int age) {
		
		System.out.println("The Emp Id is : " + id);
		System.out.println("The Emp name is : " + name);
		System.out.println("The Emp Age is : " + age);
		
	}
}

public class CompiletimePolymorphism {

	public static void main(String[] args) {

		Company c1 = new Company();
		c1.empDetails(1, "Vishakha");
		c1.empDetails(2, "Vishu", 22);
	}

}
