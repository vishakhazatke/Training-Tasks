package Day2;

public class JumpStatementDemo {
	
	public static void showNumber() {
		System.out.println("Returning From ShowNumber");
		return;
	}
	public static void main(String[] args) {
	
		System.out.println("Break Example: ");
		for(int i = 1; i <= 5; i++) {
			if(i == 3) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("Continue Example: ");
		for(int i = 1; i <= 5; i++) {
			if(i == 3) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("Return Example: ");
		showNumber();
		
	}

}
