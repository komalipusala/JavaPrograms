//39. Write a program to take names from names.txt & display unique names in sorted order.


import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesSorter {
    public static void main(String[] args) {
        String filename = "names.txt";
        Set<String> uniqueNames = new TreeSet<>(); // TreeSet for automatic sorting

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String name;
            while ((name = reader.readLine()) != null) {
                uniqueNames.add(name.trim());
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }

        System.out.println("Unique names in sorted order:");
        uniqueNames.forEach(System.out::println); // Print each unique name
    }
}