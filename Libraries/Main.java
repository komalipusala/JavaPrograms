//32. Write a program to accept some numbers from the user until 'O' and display the sum of +ve numbers.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSum = 0;

        System.out.println("Enter integers (or 'O' to finish):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("O")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                if (number > 0) {
                    totalSum += number;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }

        System.out.println("The sum of positive integers is: " + totalSum);
        scanner.close();
    }
}