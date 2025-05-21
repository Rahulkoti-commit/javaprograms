package lab3;

import java.util.Scanner;

public class exp7 {
	   public static String truncate(String str, int length) {
	        if (str == null || str.length() <= length) {
	            return str;
	        }
	        return str.substring(0, length) + "...";
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string to truncate: ");
	        String inputStr = scanner.nextLine();
	        
	        System.out.print("Enter max length: ");
	        int maxLength = scanner.nextInt();
	        
	        System.out.println("Truncated String: " + truncate(inputStr, maxLength));
	        
	        scanner.close();
	    }
}
