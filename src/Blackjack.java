import java.util.Random;
import java.util.Scanner;

public class Blackjack {
    public static void play(Scanner scanner, Random random) {
        System.out.println("\n--- SIMPLIFIED BLACKJACK ---");
        int playerTotal = random.nextInt(10) + 2;
        int dealerTotal = random.nextInt(6) + 12;
        Scanner input = new Scanner(System.in);

        boolean playerTurn = true;
        while (playerTurn) {
            System.out.println("Your current total: " + playerTotal);
            System.out.println("Dealer's current total: " + dealerTotal);
            System.out.println("Do you want to hit or stand?");
            String choice = input.next();
            if (choice.equals("hit")) {
                int card = random.nextInt(10) + 2;
                System.out.println("You pulled a " + card + "!");
                playerTotal += card;
                System.out.println("Your current total: " + playerTotal);
                if (playerTotal > 21) {
                    System.out.println("You busted you friggin loser");
                    break;
                }
            }
            if (choice.equals("Stand")) {
                break;
            }
            else {
                System.out.println("Do you want to hit or stand?");
            }
        }

    }
}