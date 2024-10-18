//45. Write a program to accept a file and replace one (or) more spaces with a single space.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SpaceNormalizer {
    public static void main(String[] args) {
        String inputFile = "input.txt"; // Change to your input file
        String outputFile = "output.txt"; // Output file

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             FileWriter writer = new FileWriter(outputFile)) {
             
            String line;
            while ((line = reader.readLine()) != null) {
                String normalizedLine = line.replaceAll("\\s+", " ");
                writer.write(normalizedLine.trim() + "\n");
            }
            System.out.println("Spaces normalized and written to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}