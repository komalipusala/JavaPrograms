//7. Write a program to accept the number and display the number in reverse order.
import java.util.Scanner;
public class Reverse_number {
    public static void main(String[] args){
        Scanner io = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = io.nextInt();
        int reversedNumber = reverse(number);
        System.out.println("The reverse of " + number + " is: "+ reversedNumber );
        io.close();
    }

    public static int reverse(int num){
        int reversed = 0;
        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        return reversed;

    }
}
