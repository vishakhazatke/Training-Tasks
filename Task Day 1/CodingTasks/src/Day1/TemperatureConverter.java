package Day1;

import java.util.Scanner;

public class TemperatureConverter {

	static double toFahrenheit(double c) {
		return (c * 9 / 5) + 32;
	}
	
	static double toCelsius(double f) {
		return (f - 32) * 5 / 9;
	}
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press 1 for Celsius to Fahrenheit");
		System.out.println("Press 2 for Fahrenheit to Celsius");
		System.out.println("Enter your choice: ");
		
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Enter Celsius: ");
			double c = sc.nextDouble();
			System.out.println("Fahrenhiet: " + toFahrenheit(c) );
		}
		
		else if(choice == 2) {
			System.out.println("Enter Fahrenhiet: ");
			double f = sc.nextDouble();
			System.out.println("Celsius: " + toCelsius(f) );
		}
		else {
			System.out.println("Invalid choice");
		}
	}
}
