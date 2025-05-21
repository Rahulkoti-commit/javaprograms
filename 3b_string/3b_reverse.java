package lab3;

import java.util.Scanner;

public class exp3 {
 
    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String reversedString = reverseString(input);
        
        System.out.println("Reversed string: " + reversedString);
        
        scanner.close();
    }
}
