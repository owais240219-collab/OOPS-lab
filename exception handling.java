package owais;
import java.util.Scanner;

public class exceptionhandling {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the numerator: ");
	        int numerator = scanner.nextInt();
	        System.out.print("Enter the denominator: ");
	        int denominator = scanner.nextInt();	        
	        try {
	            int result = numerator / denominator;  // Division operation	            
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {	           
	            System.out.println("Exception handled: Cannot divide by zero.");
	        }

	        scanner.close();
	    }
	}
