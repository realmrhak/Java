import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int max = 100;
        int min = 1;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Welcome to the number guessing game..." );
        System.out.printf("Enter your guess number between %d-%d...\n" , min, max);

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber){
                System.out.println("It's too LOW! Try Again...");
            } else if (guess > randomNumber) {
                System.out.println("It's too HIGH! Try Again...");
            }
            else {
                System.out.println("Correct Guess...The random number was "  + guess + "...");
                System.out.println("The random number & guess is " + guess + "...");
                System.out.println("You done this in " + attempts + " attempts...");
            }
        }while (guess != randomNumber);
        scanner.close();
    }
}
