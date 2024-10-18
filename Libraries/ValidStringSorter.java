//46. Write  a program to accept strings until 'end' is given and sort them and write them into Codes.txt and the string must be one/more alphabets followed by one/more digits.(use Regular Expressions)

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidStringSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> validStrings = new ArrayList<>();
        String regex = "^[A-Za-z]+\\d+$"; // One or more alphabets followed by one or more digits

        System.out.println("Enter strings (type 'end' to finish):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) break;

            if (Pattern.matches(regex, input)) {
                validStrings.add(input);
            } else {
                System.out.println("Invalid format. Please enter a valid string.");
            }
        }
        Collections.sort(validStrings);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Codes.txt"))) {
            for (String str : validStrings) {
                writer.write(str);
                writer.newLine();
            }
            System.out.println("Valid strings sorted and written to Codes.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}