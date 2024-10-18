//48. Assume a txt file customers.txt which contains name & mobile no and you need to display in sorted order of name.(Use regular expression)

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortCustomers {
    public static void main(String[] args) {
        String filename = "customers.txt"; // Change to your input file
        List<String> customers = new ArrayList<>();
        String regex = "^(\\w+)\\s+(\\d{10})$"; // Name followed by a mobile number

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = Pattern.compile(regex).matcher(line);
                if (matcher.find()) {
                    customers.add(matcher.group(1)); // Get the name
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(customers);
        System.out.println("Sorted customer names:");
        customers.forEach(System.out::println);
    }
}