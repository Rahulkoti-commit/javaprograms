package lab3;

import java.util.Scanner;

public class exp5 {
	 
    public static String removeWhitespace(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String result = removeWhitespace(input);
        
        System.out.println("String without whitespace: " + result);
        
        scanner.close();
    }
}
