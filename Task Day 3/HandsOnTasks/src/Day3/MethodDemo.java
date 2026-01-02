package Day3;

public class MethodDemo {
	
	void Singing(String name) {
		System.out.println(name + " is singing");
	}

	public static void main(String[] args) {

		MethodDemo m1 = new MethodDemo();
		m1.Singing("Vishakha");
	}
}
