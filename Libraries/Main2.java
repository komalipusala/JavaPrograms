//34. Write a program to accept a filename from the user and display how many uppercase, lowercase and digits the file has.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = scanner.nextLine();

        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (char ch : line.toCharArray()) {
                    if (Character.isUpperCase(ch)) {
                        upperCaseCount++;
                    } else if (Character.isLowerCase(ch)) {
                        lowerCaseCount++;
                    } else if (Character.isDigit(ch)) {
                        digitCount++;
                    }
                }
            }
            System.out.println("Uppercase letters: " + upperCaseCount);
            System.out.println("Lowercase letters: " + lowerCaseCount);
            System.out.println("Digits: " + digitCount);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
