import java.util.Scanner;

public class wordle {
    public static void play(Scanner scanner) {
        int randomChoice = (int) (Math.random() * 7);
        String secretWord = "";
        //WORD BANK
        if (randomChoice == 0) {
            secretWord = "GLYPH";
        } else if (randomChoice == 1) {
            secretWord = "VIXEN";
        } else if (randomChoice == 2) {
            secretWord = "KNAVE";
        } else if (randomChoice == 3) {
            secretWord = "BREAM";
        } else if (randomChoice == 4) {
            secretWord = "PROXY";
        } else if (randomChoice == 5) {
            secretWord = "SNORT";
        } else if (randomChoice == 6) {
            secretWord = "CLYDE";
        }
    int maxAttempts = 6;
    int currentAttempt = 1;
    boolean hasWon = false;

    System.out.println("<------Welcome to Wordle------>");
    System.out.println("TIP: You can input 'quit' at any time to return to main menu");

    while (currentAttempt <= maxAttempts && !hasWon) {
    
        System.out.println("Attempt " + currentAttempt + " of " + maxAttempts);
        System.out.println("Enter Your Guess!");
        String guess = scanner.next().toUpperCase();

            // Check if the user wants to quit
            if (guess.equals("QUIT")) {
                System.out.println("\nReturning to the main menu...");
                GameUtils.pause();
                return; // Exits the method
            }
    // checks if the word is exactly 5 letters
    if(guess.length() != 5) {
            System.out.println("Guess must be exactly 5 letters");
            GameUtils.pause();
            continue;
    }

    String feedback = "";
    // iterates through 5 loops to give the player 6 chances to guess
    for (int i = 0; i < 5; i++) {
        String guessLetter = guess.substring(i, i + 1);
        String secretLetter = secretWord.substring(i, i +1);

        if (guessLetter.equals(secretLetter)) {
            feedback = feedback + "O";
        } else if (secretWord.contains(guessLetter)) {
            feedback = feedback + "?";
        } else {
            feedback = feedback + "X";
        }

    }
    //results
    System.out.println("Your Guess: " + guess);
    System.out.println("Feedback:   " + feedback);
    
    
    if (guess.equals(secretWord)) {
        hasWon = true;
        System.out.println("You guessed the word right!");
        GameUtils.waitForQuit(scanner);
     } else {
            currentAttempt++;
        }
    }
    if (!hasWon) {
        System.out.println("Game over! the secret word was " + secretWord);
        GameUtils.waitForQuit(scanner);

    }
    
}
}

