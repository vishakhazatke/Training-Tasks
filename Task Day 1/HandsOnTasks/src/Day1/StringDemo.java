package Day1;

public class StringDemo {

	public static void main(String [] args) {
		
		String s1 = "Vishakha";
		String s2 = s1;
		
		s1 = s1 + "Zatke";
		
		System.out.println("String :");
		System.out.println(s1);
		System.out.println(s2);
		
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("Vishakha");
		
		System.out.println("StringBuilder :");
		System.out.println(sb);
	}
}
