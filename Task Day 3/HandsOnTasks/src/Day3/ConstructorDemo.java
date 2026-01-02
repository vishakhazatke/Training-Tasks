package Day3;

class Student{
	
	int StudentId;
	String name;
	
	Student(){
		System.out.println("In Default Student Constructor");
		
	}
	
	Student(int id, String name){
		this.StudentId = id;
		this.name = name;
	}
	
	void studentDetails(){
		
		System.out.println("The Student ID is : " + StudentId);
		System.out.println("The Student Name is : " + name);

	}
}

public class ConstructorDemo {

	public static void main(String[] args) {

		Student s1 = new Student();
		
		Student s2 = new Student(1, "Vishakha");
		
		s2.studentDetails();
	}

}
