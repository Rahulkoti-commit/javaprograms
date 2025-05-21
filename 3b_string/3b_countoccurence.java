package lab3;

import java.util.Scanner;

public class exp2 {
    public static int countOccurrences(String mainString, String subString) {
        if (mainString == null || subString == null || subString.isEmpty()) {
            return 0;
        }
        
        int count = 0;
        int index = 0;
        
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length(); // Move past the last found occurrence
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        
        System.out.print("Enter the substring to count: ");
        String subString = scanner.nextLine();
        
        int occurrences = countOccurrences(mainString, subString);
        
        System.out.println("The substring '" + subString + "' appears " + occurrences + " times in the main string.");
        
        scanner.close();
    }
}
