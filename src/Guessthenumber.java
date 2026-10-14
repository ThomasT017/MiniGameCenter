import java.util.Random;
import java.util.Scanner;

public class Guessthenumber {
    public static void play(Scanner scanner, Random random) {
        System.out.println("\n ---Guess the Number!---");
        int targetNumber = random.nextInt(100) + 1;
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("I have picked a number between 1 and 100. Try to guess it!");
    }
}