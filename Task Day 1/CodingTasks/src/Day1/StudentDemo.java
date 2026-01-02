package Day1;

class Student{
	
	int id;
	String name;
	double marks;
	
	public Student(int id, String name, double marks) {
		//super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	void StudentDetails() {
		System.out.println("ID of student is : " + id );
		System.out.println("Name of student is : " + name );
		System.out.println("Marks of student is : " + marks );
	}
	
}
public class StudentDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Vishakha", 95.5);
		s1.StudentDetails();
	}
}
