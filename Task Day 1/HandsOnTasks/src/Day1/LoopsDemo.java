package Day1;

public class LoopsDemo {

	public static void main(String[] args) {
		
		System.out.println("For Loop for 1-100 numbers");
		
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		
		System.out.println("While Loop for 1-100 numbers");
		
		int j = 1;
		while(j <= 100) {
			System.out.println(j);
			j++;
		}
		
		System.out.println("Do-while Loop for 1-100 numbers");
		
		int k = 1;
		do {
			System.out.println(k);
			k++;
		}
		while(k <= 100);
	}
}
