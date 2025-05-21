package lab2;
import java.util.Scanner;

public class StringOperationsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. String Creation and Basic Operations
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("\n--- Basic Operations ---");
        System.out.println("Original String: " + input);

        // 2. Length and Character Access
        System.out.println("\n--- Length and Character Access ---");
        System.out.println("Length of string: " + input.length());
        if (input.length() > 0) {
            System.out.println("First character: " + input.charAt(0));
            System.out.println("Last character: " + input.charAt(input.length() - 1));
        }

        // 3. String Comparison
        System.out.print("\nEnter another string to compare: ");
        String compareStr = scanner.nextLine();
        System.out.println("Strings are equal (case-sensitive): " + input.equals(compareStr));
        System.out.println("Strings are equal (ignore case): " + input.equalsIgnoreCase(compareStr));

        // 4. String Searching
        System.out.print("\nEnter a character or substring to search: ");
        String search = scanner.nextLine();
        System.out.println("Contains '" + search + "'? " + input.contains(search));
        System.out.println("Index of '" + search + "': " + input.indexOf(search));

        // 5. Substring Operations
        System.out.println("\n--- Substring Operations ---");
        if (input.length() >= 4) {
            System.out.println("Substring (0 to 4): " + input.substring(0, 4));
        }

        // 6. String Modification
        System.out.println("\n--- String Modification ---");
        String upper = input.toUpperCase();
        String lower = input.toLowerCase();
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Replaced 'a' with '@': " + input.replace('a', '@'));

        // 7. Whitespace Handling
        System.out.println("\n--- Whitespace Handling ---");
        String trimmed = input.trim();
        System.out.println("Trimmed String: '" + trimmed + "'");

        // 8. String Concatenation
        System.out.print("\nEnter string to concatenate: ");
        String concatStr = scanner.nextLine();
        String concatenated = input.concat(" " + concatStr);
        System.out.println("Concatenated String: " + concatenated);

        // 9. String Splitting
        System.out.println("\n--- String Splitting ---");
        String[] words = input.split(" ");
        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }

        // 10. StringBuilder Demo
        System.out.println("\n--- StringBuilder Demo ---");
        StringBuilder sb = new StringBuilder(input);
        sb.append(" [Appended Text]");
        sb.insert(0, "[Start] ");
        sb.replace(0, 7, "[BEGIN]");
        System.out.println("Modified with StringBuilder: " + sb.toString());

        // 11. String Formatting
        System.out.println("\n--- String Formatting ---");
        String name = "Alice";
        int age = 23;
        String formatted = String.format("Name: %s | Age: %d", name, age);
        System.out.println(formatted);

        // 12. Validate Email
        System.out.println("\n--- Email Validation ---");
        System.out.print("Enter email to validate: ");
        String email = scanner.nextLine();
        boolean isValidEmail = email.contains("@") && email.endsWith(".com") && email.startsWith(email.substring(0, email.indexOf('@')));
        System.out.println("Email valid? " + isValidEmail);

        scanner.close();
    }
}

