//47. Write a program to display the file which contains the given string in a path.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchInFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string to search for: ");
        String searchString = scanner.nextLine();
        String filename = "input.txt"; // Change to your input file

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Lines containing '" + searchString + "':");
            while ((line = reader.readLine()) != null) {
                if (line.contains(searchString)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}