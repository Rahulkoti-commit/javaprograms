package lab3;
import java.util.Scanner;
public class exp1 {
	    public static boolean isNullOrEmpty(String str) {
	        return str == null || str.trim().isEmpty();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        if (isNullOrEmpty(input)) {
	            System.out.println("The string is either null or contains only whitespace.");
	        } else {
	            System.out.println("The string is valid: " + input);
	        }
	        
	        scanner.close();
	    }
	

}
