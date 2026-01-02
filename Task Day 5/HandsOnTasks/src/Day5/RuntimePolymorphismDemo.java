package Day5;

class ParentDemo{
	
	void CarDetails() {
		
		System.out.println("I have Tata Nexon car");
	}
}

class ChildDemo extends ParentDemo{
	
	void CarDetails() {
		
		System.out.println("I have Tata Altroz Car");
	}
	
}
public class RuntimePolymorphismDemo {

	public static void main(String[] args) {

		ParentDemo p1 = new ParentDemo();
		p1.CarDetails();
		
		ParentDemo p2 = new ChildDemo();
		p2.CarDetails();
		
		ChildDemo c1 = new ChildDemo();
		c1.CarDetails();
		
	}

}
