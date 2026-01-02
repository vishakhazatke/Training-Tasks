package Day1;

public class PrimitiveVsReference {

	public static void main(String [] args) {
		
		int x = 10;
		int y = x;
		y = 20;
		
		System.out.println("Primitive Types: ");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		int[] arr1 = {1,2,3};
		int[] arr2 = arr1;
		
		arr2[0] = 9;
		
		System.out.println("Reference Types: ");
		System.out.println("arr1[0] = " + arr1[0]);
		System.out.println("arr2[0] = " + arr2[0]);
	}
}
