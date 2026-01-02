package Day2;

import java.util.Scanner;

public class RelationalDemo {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 Numbers for Relational operations");
		int a = sc.nextInt();
		int b = sc.nextInt();


		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
	}
}
