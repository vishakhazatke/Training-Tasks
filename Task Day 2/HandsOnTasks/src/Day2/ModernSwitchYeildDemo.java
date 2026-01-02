package Day2;

import java.util.Scanner;

public class ModernSwitchYeildDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number from 1-7 to find which day");
		
		int day = sc.nextInt();
		
		String result = switch (day) {
		
		case 1 ->
			"Monday";
			
		case 2 ->
		    "Tuesday";
			
		case 3 ->
			"Wednesday";
			
		case 4 ->
			"Thursday";
			
		case 5 ->
			"Friday";
			
		case 6 ->
	        "Saturday";
			
		case 7 ->
			"Sunday";
			
		default ->
			"Invalid input";
		};
		System.out.println(result);
	}

}
