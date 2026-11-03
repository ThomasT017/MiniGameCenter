import java.util.Scanner;

public class GameUtils {
    public static void waitForQuit(Scanner scanner) {
        System.out.println("Type 'quit' to return to the main menu:");
        String endChoice = scanner.next();
        while (!endChoice.equalsIgnoreCase("quit")) {
            System.out.print("Invalid input. Type 'quit' to return to the main menu:");
            endChoice = scanner.next();
        }
    }
        public static void pause() {
        try {
            Thread.sleep(1000); // Pause for 1 second
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        }
    }
    


