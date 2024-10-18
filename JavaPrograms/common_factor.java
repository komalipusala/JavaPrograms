//10. Write a program to create a function that takes multiple numbers and displays common factors.
import java.util.Scanner;

public class common_factor {
    public static int commonFactors(int[] num)
    {
        System.out.print("Common factors are: ");
        int min = num[0];
        for(int i = 1; i < num.length; i++){
            if(num[i] < min)
            {
                min = num[i];
            }
        }
        for(int i=1; i<=min; i++)
        {
            boolean cfact = true;
            for(int n : num)
            {
                if(n % i!= 0)
                {
                    cfact = false;
                    break;
                }
            }
            if(cfact == true)
            {
                System.out.print(i+ " ");
            }
        }
        return 1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements ");
        int n = sc.nextInt();
        if(n <= 0)
        {
            System.out.println("Enter the valid number: ");
        }
        else
        {
            int[] arr = new int[n];
            for(int i =0; i <n; i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.println("Elements in the array: ");
            for(int i = 0; i < n; i++)
            {
             System.out.println(arr[i]);
            }
           commonFactors(arr);
        }
        sc.close();
    }
    
}
