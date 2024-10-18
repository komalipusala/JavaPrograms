//11.Write a program to consider command line arguments num, length as inputs (where length is optional) if you won't get that use default number as length.

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide at least one argument for 'num'.");
            return;
        }
        int num = Integer.parseInt(args[0]);

        int length = 5; 
        if (args.length >= 2) {
            length = Integer.parseInt(args[1]);
        }

        System.out.println("Number: " + num);
        System.out.println("Length: " + length);
    }
}