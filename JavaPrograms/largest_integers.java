//9.Write a program to create a function that takes a set of integers and returns the largest of integers.

import java.util.Scanner;
public class largest_integers {
    public static int findLargest(int[] numbers){
        int largest = numbers[0];
        for(int i = 1; i< numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args){
        Scanner io = new Scanner(System.in);
        System.out.println("Enter the numbers of integers: ");
        int size = io.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the integers: ");
        for(int i = 0; i < size; i++){
            numbers[i] = io.nextInt();
        }

        int largest = findLargest(numbers);
        System.out.println("The largest number is: " + largest);

        io.close();
    }
}
