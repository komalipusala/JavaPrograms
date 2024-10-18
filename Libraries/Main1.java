//33. Write a program to accept names from users until 'END' is given and write them into names.txt as one name for the line.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("komali.txt"))) {
            System.out.println("Enter names (or 'END' to finish):");

            while (true) {
                String name = scanner.nextLine();

                if (name.equalsIgnoreCase("END")) {
                    break;
                }

                writer.write(name);
                writer.newLine();
            }

            System.out.println("Names have been written to names.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}