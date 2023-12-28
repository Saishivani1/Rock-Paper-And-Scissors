#include <iostream>
#include <cstdlib>
#include <ctime>

// Function to get the computer's choice
int getComputerChoice() {
    srand(time(NULL));
    return rand() % 3 + 1; // Generates a random number between 1 and 3
}

// Function to determine the winner
void determineWinner(int userChoice, int computerChoice) {
    if (userChoice == computerChoice) {
        std::cout << "It's a tie!\n";
    } else if ((userChoice == 1 && computerChoice == 3) ||
               (userChoice == 2 && computerChoice == 1) ||
               (userChoice == 3 && computerChoice == 2)) {
        std::cout << "You win!\n";
    } else {
        std::cout << "Computer wins!\n";
    }
}

int main() {
    int userChoice, computerChoice;

    // Menu for the user to choose Rock, Paper, or Scissors
    std::cout << "Rock, Paper, Scissors Game\n";
    std::cout << "1. Rock\n2. Paper\n3. Scissors\n";
    std::cout << "Enter your choice (1-3): ";
    std::cin >> userChoice;

    // Validate user input
    if (userChoice < 1 || userChoice > 3) {
        std::cout << "Invalid choice. Please enter a number between 1 and 3.\n";
        return 1; // Exit with an error code
    }

    computerChoice = getComputerChoice();

    // Display user and computer choices
    std::cout << "\nYou chose ";
    switch (userChoice) {
        case 1:
            std::cout << "Rock";
            break;
        case 2:
            std::cout << "Paper";
            break;
        case 3:
            std::cout << "Scissors";
            break;
    }

    std::cout << "\nComputer chose ";
    switch (computerChoice) {
        case 1:
            std::cout << "Rock";
            break;
        case 2:
            std::cout << "Paper";
            break;
        case 3:
            std::cout << "Scissors";
            break;
    }

    std::cout << "\n";

    // Determine and display the winner
    determineWinner(userChoice, computerChoice);

    return 0; // Exit successfully
}
