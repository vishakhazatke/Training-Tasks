package Day5;

final class ParentDemoo{
	
	final void career() {
		
		System.out.println("Doctor");
	}
}

// The final class will not be overridden so we cannot extend it and make a sub class of final class


public class FinalDemo {

	public static void main(String[] args) {

		ParentDemoo p1 = new ParentDemoo();
		p1.career();
	}

}

