import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;

//For demonstration purposes try: GCD(335352, 1727) = 157

public class CommonDivisorCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Greatest Common Divisor");
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(0);
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println();
			
			System.out.print("Enter a positive integer: ");
			int firstInt = sc.nextInt();
			
			System.out.print("Enter a second positive integer: ");
			int secondInt = sc.nextInt();
			
			int first= Math.max(firstInt, secondInt);
			int second = Math.min(firstInt, secondInt);
			
//			while (Math.abs(first-second) > 0) {        ***OR ALTERNATIVELY.....
			while (Math.abs(first-second) != 0) {					
				while (first - second > 0) {
					first -= second;		
				}
				
				//Swap the values for "first" and "second" here....
				int swap1 = first;
				int swap2 = second;
				second = swap1;
				first = swap2;

			}
			 int gcd = Math.min(first, second);
			  
			System.out.println();
			System.out.println("The Greateast Common Divisor of " + number.format(firstInt)
							+ " and " + number.format(secondInt) + " is " + number.format(gcd) + ".");
			System.out.println("(" + number.format(firstInt) + " divided by " +  number.format(gcd) + " equals " + 
					firstInt/gcd + ", and " + number.format(secondInt) + " divided by " 
					+ number.format(gcd) + " equals " + secondInt/gcd + ".)");			
			System.out.println();
			System.out.print("Continue? (y/n): ");
			choice = sc.next();					
		}
			sc.close();
	}

}
