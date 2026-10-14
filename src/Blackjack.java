import java.util.Random;
import java.util.Scanner;

public class Blackjack {
    public static void play(Scanner scanner, Random random) {
        System.out.println("\n--- SIMPLIFIED BLACKJACK ---");
        int playerTotal = random.nextInt(10) + 2 + random.nextInt(10) + 2;
        int dealerTotal = random.nextInt(6) + 12;

        boolean playerTurn = true;
        while (playerTurn) {
            System.out.println("Your current total: " + playerTotal);

            
        }

    }
}