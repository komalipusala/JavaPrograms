//36. File Marks.txt, which have marks separated by comma in different lines.Find the total marks of each line and display them.(Use fault tolerance)

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filename (e.g., Marks.txt): ");
        String filename = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Total marks for each line:");

            while ((line = reader.readLine()) != null) {
                String[] marksStr = line.split(",");
                int totalMarks = 0;

                for (String mark : marksStr) {
                    try {
                        totalMarks += Integer.parseInt(mark.trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid mark found: '" + mark.trim() + "' in line: " + line);
                    }
                }

                System.out.println("Total marks: " + totalMarks);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}