package lab3;

import java.util.Scanner;

public class exp4 {
	  public static boolean isPalindrome(String str) {
	        if (str == null || str.isEmpty()) {
	            return false;
	        }
	        
	        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        
	        int left = 0, right = cleanedStr.length() - 1;
	        while (left < right) {
	            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        if (isPalindrome(input)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }
	        
	        scanner.close();
	    }
	    
}
