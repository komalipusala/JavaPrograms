//38. Write a program to accept a file and convert its contents to uppercase.(write in compact way)

import java.io.*;

public class Main5 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null)
                writer.write(line.toUpperCase() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}