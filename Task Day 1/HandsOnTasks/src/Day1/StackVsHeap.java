package Day1;

class Person{
	
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
}
public class StackVsHeap {

	public static void main(String [] args) {
		
		Person p1 = new Person("Vishakha");
		Person p2 = new Person("Zatke");
		Person p3 = new Person("Vishu");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
