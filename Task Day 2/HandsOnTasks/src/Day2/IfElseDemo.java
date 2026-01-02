package Day2;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age to check eligible for voting or not");
		
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("Eligible for voting");
		}
		else {
			System.out.println("Not eligible for voting");
		}
	}
}
