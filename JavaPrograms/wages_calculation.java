//4. Write a program to accept the day of a week and the number of hours worked and calculate the wage.
import java.util.Scanner;
public class wages_calculation {
    public static void main(String[] args){
        Scanner io = new Scanner(System.in);
        System.out.println("Enter the day of the week(1 for monday and 7 for sunday: )");
        int day = io.nextInt();
        System.out.println("Enter The number of hours worked: ");
        int hoursworked = io.nextInt();
        int wageperhour = switch(day){
            case 1, 2, 3 -> 200;
            case 4, 5 -> 400;
            case 6 -> 600;
            case 7 -> 800;
            default -> {
                System.out.println("Invalid day! Enter a day between 1 and 7.");
                yield 0;
            }
        };
        double totalwage = wageperhour * hoursworked;
        if(totalwage > 2000){
            double bonus=totalwage *0.1;
            totalwage += bonus;
            System.out.println("there will be a bonus of 10% :"+ totalwage);
        }else{
            System.out.println("There will be no bonus"+ totalwage);
        }
        
io.close();
    }
}
