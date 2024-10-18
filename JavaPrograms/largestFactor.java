// 6. Write a program to accept the number and display the largest factor other than the number.
import java.util.Scanner;
public class largestFactor {
    public static void main(String[] args){
        Scanner io = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = io.nextInt();
        System.out.println("The largest factor of " + number + " is: "+ findLargestFactor(number));

io.close();
    }

    public static int findLargestFactor(int num){
        for(int i = num / 2; i >= 1; i--){
            if(num % i == 0){
                return i;
            }
        }
        return 1;
    }
}
