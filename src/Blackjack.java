import java.util.Random;
import java.util.Scanner;

public class Blackjack {
    public static void play(Scanner scanner, Random random) {
        System.out.println("\n--- SIMPLIFIED BLACKJACK ---");
        int playerTotal = random.nextInt(10) + 2;
        int dealerTotal = random.nextInt(6) + 12;
        boolean running = true;

        while (running) {
            System.out.println("Your current total: " + playerTotal);
            System.out.println("Dealer's current total: " + dealerTotal);
            GameUtils.pause();
            System.out.println("\n|HIT|    |STAND|    |QUIT|");

            String choice = scanner.next();
            if (choice.equalsIgnoreCase("hit")) {
                int card = random.nextInt(10) + 2;
                System.out.println("\nYou pulled a " + card + "!");
                GameUtils.pause();
                playerTotal += card;
                if (playerTotal > 21) {
                    System.out.println("You busted! Dealer wins.");
                    GameUtils.waitForQuit(scanner);
                    return;
                }

            } else if (choice.equalsIgnoreCase("stand")) {
                DealerTurn(dealerTotal, playerTotal, random);
                GameUtils.pause();
                GameUtils.waitForQuit(scanner);
                return;
                
            } else if (choice.equalsIgnoreCase("quit")) {
                System.out.println("You quit the game.");
                return;
            } else {
                System.out.println("Please enter hit, stand, or quit.");
                choice = scanner.next();
            }
        }
    }
    
    
    public static void DealerTurn(int dealerTotal, int playerTotal, Random random) {
        while (dealerTotal < 17) {
        
            int card = random.nextInt(10) + 2;
            dealerTotal += card;
            System.out.println("The dealer pulls a " + card + ".");
            GameUtils.pause();
            System.out.println("The dealer's total is " + dealerTotal);
        }

        if (dealerTotal > 21) {
            System.out.println("Dealer busts! You win.");
            return;
            
        } else {
            comparison(dealerTotal, playerTotal);
        
        }
    
    }

    public static void comparison(int dealerTotal, int playerTotal) {
        System.out.println("----------------------");
        System.out.println("Dealer Total: " + dealerTotal);
        System.out.println("Player Total: " + playerTotal);
        GameUtils.pause();
        if (dealerTotal > playerTotal) {
            System.out.println("Dealer Wins!");
            
        } else if (playerTotal > dealerTotal) {
            System.out.println("Player Wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

}
