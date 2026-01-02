package Day4;

class GrandParent{
	
	int age = 80;
	String name = "Grandparent";
	
	void grandParentDetails() {
		
		System.out.println("GrandParent Age is " + age);
		System.out.println("GrandParent Name is " + name);
	}
}

class Parent extends GrandParent{
	
	int age = 50;
	String name = "Parent";
	
	void parentDetails() {
		
		System.out.println("Parent Age is " + age);
		System.out.println("Parent Name is " + name);
	}
}

class Child extends Parent{
	
	int age = 22;
	String name = "Child";
	
	void childDetails() {
		
		System.out.println("Child Age is " + age);
		System.out.println("Child Name is " + name);
	}
	
}

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {

		Child c1 = new Child();
		c1.grandParentDetails();
		c1.parentDetails();
		c1.childDetails();
		
	}

}
