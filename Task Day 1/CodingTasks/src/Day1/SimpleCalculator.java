package Day1;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two Numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Enter Operator to perform calculation : +, -, *, / ");
		char op = sc.next().charAt(0);
		
		if(op == '+') {
			
			System.out.println("Addition of two numbers is : " + (num1 + num2));
		}

		else if(op == '-') {
			System.out.println("Substraction of two numbers is : " + (num1 - num2));
		}
		
		else if(op == '*') {
			System.out.println("Multiplication of two numbers is : " + (num1 * num2));
		}
		
		else {
			System.out.println("Division of two numbers is : " + (num1 / num2));
		}
	}
}
