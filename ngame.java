import java.util.Scanner;
import java.util.Random;

public class ngame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int userGuess = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        while (userGuess != numberToGuess) {
            userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again:");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again:");
            } else {
                System.out.println("Correct! You've guessed the number in " + numberOfTries + " tries.");
            }
        }

        scanner.close();
    }
}

