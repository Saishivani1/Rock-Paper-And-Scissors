import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    // Function to get the computer's choice
    private static int getComputerChoice() {
        Random rand = new Random();
        return rand.nextInt(3) + 1; // Generates a random number between 1 and 3
    }

    // Function to determine the winner
    private static void determineWinner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userChoice, computerChoice;

        // Menu for user to choose Rock, Paper, or Scissors
        System.out.println("Rock, Paper, Scissors Game");
        System.out.println("1. Rock\n2. Paper\n3. Scissors");
        System.out.print("Enter your choice (1-3): ");
        userChoice = scanner.nextInt();

        // Validate user input
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            System.exit(1); // Exit with an error code
        }

        computerChoice = getComputerChoice();

        // Display user and computer choices
        System.out.print("\nYou chose ");
        switch (userChoice) {
            case 1:
                System.out.print("Rock");
                break;
            case 2:
                System.out.print("Paper");
                break;
            case 3:
                System.out.print("Scissors");
                break;
        }

        System.out.print("\nComputer chose ");
        switch (computerChoice) {
            case 1:
                System.out.print("Rock");
                break;
            case 2:
                System.out.print("Paper");
                break;
            case 3:
                System.out.print("Scissors");
                break;
        }

        System.out.println();

        // Determine and display the winner
        determineWinner(userChoice, computerChoice);
    }
}
