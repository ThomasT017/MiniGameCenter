import java.util.Scanner;

public class wordle {
    public static void play(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomChoice = (int) (Math.random() * 7);
        String secretWord = "";

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

    System.out.println("Welcome to Wordle");

    while (currentAttempt <= maxAttempts && !hasWon) {
        System.out.println("Attempt" + currentAttempt + "of" + maxAttempts);
        System.out.println("Enter Your Guess!");
        String guess = scanner.next().toUpperCase();

        if(guess.length() != 5) {
            System.out.println("Guess must be exactly 5 letters");
    }

    String feedback = "";

    for (int i = 0; i < 5; i++) {
        String guessLetter = guess.substring(i, i + 1);
        String secretLetter = secretWord.substring(i, i +1);

        if (guessLetter.equals(secretLetter)) {
            feedback = feedback + "O";
        } else {
            feedback = feedback + "X";
        }

    }
    System.out.println("Your Guess: " + guess);
    System.out.println("Feedback: " + feedback);
    

    if (guess.equals(secretWord)) {
        hasWon = true;
        System.out.println("You guessed the word right!");
     } else {
            currentAttempt++;
        }
    }
    if (!hasWon) {
        System.out.println("Game over! the secret word was " + secretWord);
    }
}
}
