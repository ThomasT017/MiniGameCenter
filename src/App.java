import java.util.Random;
import java.util.Scanner;
public class App {
    public static void playBlackjack(){
        System.out.println("You have switched to blackjack!");
        boolean running = false;

    }
    public static void playGuessTheNumber(){
        System.out.println("You have switched to guess the number!");
        boolean running = false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean running = true;

        System.out.println("========================================");
        System.out.println("   WELCOME TO THE ARCADE GAME MENU!     ");
        System.out.println("========================================");

        while (running) {
            // Display Menu Options
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Play Blackjack (Simplified)");
            System.out.println("2. Play Guess the Number");
            System.out.println("3. Exit");
            System.out.print("Please enter your choice (1-3): ");

            // Validate that the user entered an integer
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();

                // Conditional statements to control the menu flow
                if (choice == 1) {
                    playBlackjack();
                } 
                else if (choice == 2) {
                    playGuessTheNumber();
                } 
                else if (choice == 3) {
                    System.out.println("\nThanks for playing! Goodbye!");
                    running = false; // Breaks the loop and exits
                } 
                else {
                    System.out.println("\n[Invalid Choice] Please enter a number between 1 and 3.");
                }
            } else {
                System.out.println("\n[Invalid Input] Please enter a valid number.");
                scanner.next(); // Clear the invalid input from the scanner buffer
            }
        }
       
            

    }
}