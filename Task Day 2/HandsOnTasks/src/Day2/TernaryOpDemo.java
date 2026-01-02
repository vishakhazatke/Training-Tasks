package Day2;

import java.util.Scanner;

public class TernaryOpDemo {

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 Numbers for Ternary operations");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String result = (a > b) ? "a is greater" : "b is greater";
		System.out.println("Result is: " + result);
	} 

}
