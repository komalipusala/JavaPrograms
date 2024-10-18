import java.util.Scanner;

public class StringNumberSum {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        double total = 0.0;

        System.out.println("Enter five strings containing numbers:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("String " + i + ": ");
            String input = io.nextLine();

            try {
                double number = Double.parseDouble(input);
                total += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. '" + input + "' is not a valid number.");
            }
        }

        System.out.println("Total sum of valid numbers: " + total);
        io.close();
    }
}

