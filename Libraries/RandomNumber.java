import java.util.Random;
import java.util.Scanner;

public class RandomNumber{
    public static void main(String[] args){
        Random random = new Random();
        int randomNumber = random.nextInt(25) + 1;
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;
        boolean guessedCorrectly = false;

        System.out.println("Guess the exact number 1 and 25. you have" + " attempts");
        for(int i = 0; i < attempts; i++) { 
            System.out.print("Attempt "+(i+1)+ ": enter your guess: ");
            int userGuess = scanner.nextInt();
            if(userGuess < 1 || userGuess > 25){
                System.out.println("Please guess a number within tha range of 1 to 25.");

            }else if(userGuess == randomNumber) {
                guessedCorrectly = true; 
                break;
            }

        
        }
        if(guessedCorrectly) {
            System.out.println("Congratulations! you guessed the number" + randomNumber + "correctly.");

        }else{
            System.out.println("Sorry! you've used all your attempts. the correct number was " + randomNumber + ".");
        }
        scanner.close();
    }
}