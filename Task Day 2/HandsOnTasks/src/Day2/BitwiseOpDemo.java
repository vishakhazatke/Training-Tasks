package Day2;

import java.util.Scanner;

public class BitwiseOpDemo {

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 Numbers for Bitwise operations");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		System.out.println(a << 1);
		System.out.println(a >> 1);
		System.out.println(a >>> 1);
		
		
	}

}
