//42.Create a treeset of strings and sort them by length (use Comparator)

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetByLength {
    public static void main(String[] args) {
        TreeSet<String> sortedSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        // Adding some sample strings
        sortedSet.add("apple");
        sortedSet.add("banana");
        sortedSet.add("kiwi");
        sortedSet.add("cherry");
        sortedSet.add("strawberry");
        sortedSet.add("fig");

        System.out.println("Strings sorted by length:");
        sortedSet.forEach(System.out::println);
    }
}