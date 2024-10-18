//8.Write a program to create an array of 5 elements and store values into it by taking them from the keyboard and display them in reverse order.

import java.util.Scanner;
public class array_of_elements {
    public static void main(String[] args){
        Scanner io = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 elements");
        for(int i = 0; i < 5; i++){
            arr[i] = io.nextInt();
        }
        System.out.println("Array in reverse order: ");
        for(int i = 4; i >= 0; i--){
            System.out.println(arr[i]);
        }
     io.close();
    }
    
}
