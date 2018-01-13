import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;

	//For demonstration purposes try: GCD(335352, 1727) = 157

	public class CommonDivisorCalculatorV2 {

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
				
				int larger = Math.max(firstInt, secondInt);
				int smaller = Math.min(firstInt, secondInt);
	
				int remainder = smaller;
				
				while (remainder != 0) {					
						remainder = larger%smaller;
						larger = smaller;
						smaller = remainder;
					}

				 int gcd = Math.max(larger, smaller);
				  
				System.out.println();
				System.out.println("The Greateast Common Divisor of " + number.format(firstInt)
								+ " and " + number.format(secondInt) + " is " + number.format(gcd) + ".");
				System.out.println("("+ number.format(firstInt) + " divided by " +  number.format(gcd) + " equals " + 
								firstInt/gcd + ", and " + number.format(secondInt) + " divided by " 
								+ number.format(gcd) + " equals " + secondInt/gcd + ".)");
				System.out.println();
				System.out.print("Continue? (y/n): ");
				choice = sc.next();					
			}
				sc.close();
				System.out.println("Bye!");
	}
}