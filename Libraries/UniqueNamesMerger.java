//40. Write a program to assume names1.txt & names2.txt where we have one name for line & display unique names from both the files in the order they appear.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;

public class UniqueNamesMerger{
    public static void main(String[] args) {
        LinkedHashSet<String> uniqueNames = new LinkedHashSet<>();

        readNamesFromFile("names1.txt", uniqueNames);
        readNamesFromFile("names2.txt", uniqueNames);

        System.out.println("Unique names in the order they appear:");
        uniqueNames.forEach(System.out::println);
    }

    private static void readNamesFromFile(String filename, LinkedHashSet<String> uniqueNames) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String name;
            while ((name = reader.readLine()) != null) {
                uniqueNames.add(name.trim());
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading " + filename + ": " + e.getMessage());
        }
    }
}