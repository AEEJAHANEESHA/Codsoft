import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        boolean playAgain = true;
        Scanner scanner = new Scanner(System.in);

        while (playAgain) {
            playGame();
            
            System.out.println("Do you want to play again? Type 'true' for yes, 'false' for no: ");
            playAgain = scanner.nextBoolean();
        }
    }

    private static void playGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNum = random.nextInt(101);
        int attempts = 10;

        System.out.println("-------- Welcome to the Number Guessing Game --------");

        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == randomNum) {
                System.out.println("Congratulations! You guessed the number in " + (11 - attempts) + " attempts.");
                System.out.println("Your score is: " + (attempts - 1) + "/10");
                return;
            } else if (guess < randomNum) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Too high, try again.");
            }

            attempts--;

            if (attempts == 0) {
                System.out.println("Maximum number of attempts reached. Your score: 0");
            }
        }
    }
}

