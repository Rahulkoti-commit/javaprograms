package lab3;

import java.util.Random;
import java.util.Scanner;

public class exp9 {
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

 Random random = new Random();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < length; i++) {
            result.append(chars.charAt(random.nextInt(chars.length())));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of the random string: ");
        int length = scanner.nextInt();
        
        String randomString = generateRandomString(length);
        
        System.out.println("Generated Random String: " + randomString);
        
        scanner.close();
    }
}
