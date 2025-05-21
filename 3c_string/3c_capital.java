package lab3;

import java.util.Scanner;

public class exp6 {
	  public static String capitalizeWords(String str) {
	        if (str == null || str.isEmpty()) {
	            return str;
	        }
	        
	        String[] words = str.split("\\s+");
	        StringBuilder capitalizedString = new StringBuilder();
	        
	        for (String word : words) {
	            if (!word.isEmpty()) {
	                capitalizedString.append(Character.toUpperCase(word.charAt(0)))
	                                 .append(word.substring(1).toLowerCase())
	                                 .append(" ");
	            }
	        }
	        
	        return capitalizedString.toString().trim();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        String result = capitalizeWords(input);
	        
	        System.out.println("Capitalized String: " + result);
	        
	        scanner.close();
	    }
}
