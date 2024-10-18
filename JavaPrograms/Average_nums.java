//5. Write a program to accept five numbers from the user and display the average of numbers.
import java.util.Scanner;
public class Average_nums {
    public static void main(String[] args){
        Scanner io = new Scanner(System.in);
        int sum = 0;
        for(int i = 1; i <= 5; i++){
            int num = io.nextInt();
            sum += num;
        }
        System.out.println("The Average sum of numbers: "+String.valueOf(sum/ 5));
io.close();
    }
    
}
