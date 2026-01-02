package Day2;

import java.util.Scanner;

public class ArithmeticDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 Numbers for Arithmetic operations");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("The Addition of 2 Numbers is : " + (a + b));
		System.out.println("The Substraction of 2 Numbers is : " + (a - b));
		System.out.println("The Multiplication of 2 Numbers is : " + (a * b));
		System.out.println("The Division of 2 Numbers is : " + (a / b));
		System.out.println("The Modulus of 2 Numbers is : " + (a % b));
	}

}
