package Day2;

import java.util.Scanner;

public class UnaryOperationsDemo {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 Numbers for Unary operations");
		int a = sc.nextInt();

		System.out.println("The Pre-increment of this Number is : " + (++a));
		System.out.println("The Post-increment of this Number is : " + (a++));
		System.out.println("The Pre-decrement of this Number is : " + (--a));
		System.out.println("The Negation of this Number is : " + (-a));
		System.out.println("The Positive sign of this Number is : " + (+a));

	}

}
