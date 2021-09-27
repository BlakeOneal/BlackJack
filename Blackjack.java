/*
Title - How to set decimals to only 2 digits in doubles?
Author - Jesper de Jong
Date - 2/2/20
Description - Code used to format a string to round the double to two decimal places
Code Version - 1.0
Availability - Public
In line 543, source code is from coderanch.com
 */
import java.util.Scanner;
import java.util.Random;
public class Blackjack {
// The following program works as a Blackjack game
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        P1Random randomGen = new P1Random();

        int userSelection = 1;
        int playerHand = 0;
        int dealerHand;
        int playerWins = 0;
        int dealerWins = 0;
        int tieGames = 0;
        int totalGames = 1;
        int dealtCard;

// The game begins at round 1, randomly generating a hand for the player
        System.out.println("START GAME #" + totalGames);

// The following serves as a loop for the userSelection when userSelection is a valid input
        while ((userSelection > 0) && (userSelection < 5)) {
            while (userSelection == 1) {
                dealtCard = randomGen.nextInt(13) + 1;
                // The switch below works to incriment the card value to the player hand
                switch (dealtCard) {
                    case (1):
                        System.out.println("\nYour card is a ACE!");
                        playerHand = playerHand + 1;
                        // Special case for if the player achieves a blackjack, gives player +1 win
                        if (playerHand == 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nBLACKJACK! You win!");
                            playerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Special case for if the player goes over 21, gives dealer +1 win
                        else if (playerHand > 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nYou exceeded 21! You lose.");
                            dealerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Redisplays menu if no special cases are met, could use methods to simplify code
                        else {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\n1. Get another card");
                            System.out.println("2. Hold hand");
                            System.out.println("3. Print statistics");
                            System.out.println("4. Exit");
                            System.out.print("\nChoose an option: ");
                            userSelection = Scanner.nextInt();
                        }
                        break;
                    case (2):
                        System.out.println("\nYour card is a 2!");
                        playerHand = playerHand + 2;
                        // Special case for if the player achieves a blackjack, gives player +1 win
                        if (playerHand == 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nBLACKJACK! You win!");
                            playerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Special case for if the player goes over 21, gives dealer +1 win
                        else if (playerHand > 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nYou exceeded 21! You lose.");
                            dealerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Redisplays menu if no special cases are met, could use methods to simplify code
                        else {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\n1. Get another card");
                            System.out.println("2. Hold hand");
                            System.out.println("3. Print statistics");
                            System.out.println("4. Exit");
                            System.out.print("\nChoose an option: ");
                            userSelection = Scanner.nextInt();
                        }
                        break;
                    case (3):
                        System.out.println("\nYour card is a 3!");
                        playerHand = playerHand + 3;
                        // Special case for if the player achieves a blackjack, gives player +1 win
                        if (playerHand == 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nBLACKJACK! You win!");
                            playerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Special case for if the player goes over 21, gives dealer +1 win
                        else if (playerHand > 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nYou exceeded 21! You lose.");
                            dealerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Redisplays menu if no special cases are met, could use methods to simplify code
                        else {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\n1. Get another card");
                            System.out.println("2. Hold hand");
                            System.out.println("3. Print statistics");
                            System.out.println("4. Exit");
                            System.out.print("\nChoose an option: ");
                            userSelection = Scanner.nextInt();
                        }
                        break;
                    case (4):
                        System.out.println("\nYour card is a 4!");
                        playerHand = playerHand + 4;
                        // Special case for if the player achieves a blackjack, gives player +1 win
                        if (playerHand == 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nBLACKJACK! You win!");
                            playerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Special case for if the player goes over 21, gives dealer +1 win
                        else if (playerHand > 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nYou exceeded 21! You lose.");
                            dealerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Redisplays menu if no special cases are met, could use methods to simplify code
                        else {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("1. Get another card");
                            System.out.println("2. Hold hand");
                            System.out.println("3. Print statistics");
                            System.out.println("4. Exit");
                            System.out.print("\nChoose an option: ");
                            userSelection = Scanner.nextInt();
                        }
                        break;
                    case (5):
                        System.out.println("\nYour card is a 5!");
                        playerHand = playerHand + 5;
                        // Special case for if the player achieves a blackjack, gives player +1 win
                        if (playerHand == 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nBLACKJACK! You win!");
                            playerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Special case for if the player goes over 21, gives dealer +1 win
                        else if (playerHand > 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nYou exceeded 21! You lose.");
                            dealerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Redisplays menu if no special cases are met, could use methods to simplify code
                        else {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\n1. Get another card");
                            System.out.println("2. Hold hand");
                            System.out.println("3. Print statistics");
                            System.out.println("4. Exit");
                            System.out.print("\nChoose an option: ");
                            userSelection = Scanner.nextInt();
                        }
                        break;
                    case (6):
                        System.out.println("\nYour card is a 6!");
                        playerHand = playerHand + 6;
                        // Special case for if the player achieves a blackjack, gives player +1 win
                        if (playerHand == 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nBLACKJACK! You win!");
                            playerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Special case for if the player goes over 21, gives dealer +1 win
                        else if (playerHand > 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nYou exceeded 21! You lose.");
                            dealerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Redisplays menu if no special cases are met, could use methods to simplify code
                        else {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\n1. Get another card");
                            System.out.println("2. Hold hand");
                            System.out.println("3. Print statistics");
                            System.out.println("4. Exit");
                            System.out.print("\nChoose an option: ");
                            userSelection = Scanner.nextInt();
                        }
                        break;
                    case (7):
                        System.out.println("\nYour card is a 7!");
                        playerHand = playerHand + 7;
                        // Special case for if the player achieves a blackjack, gives player +1 win
                        if (playerHand == 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nBLACKJACK! You win!");
                            playerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Special case for if the player goes over 21, gives dealer +1 win
                        else if (playerHand > 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nYou exceeded 21! You lose.");
                            dealerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Redisplays menu if no special cases are met, could use methods to simplify code
                        else {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\n1. Get another card");
                            System.out.println("2. Hold hand");
                            System.out.println("3. Print statistics");
                            System.out.println("4. Exit");
                            System.out.print("\nChoose an option: ");
                            userSelection = Scanner.nextInt();
                        }
                        break;
                    case (8):
                        System.out.println("\nYour card is a 8!");
                        playerHand = playerHand + 8;
                        // Special case for if the player achieves a blackjack, gives player +1 win
                        if (playerHand == 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nBLACKJACK! You win!");
                            playerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Special case for if the player goes over 21, gives dealer +1 win
                        else if (playerHand > 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nYou exceeded 21! You lose.");
                            dealerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Redisplays menu if no special cases are met, could use methods to simplify code
                        else {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\n1. Get another card");
                            System.out.println("2. Hold hand");
                            System.out.println("3. Print statistics");
                            System.out.println("4. Exit");
                            System.out.print("\nChoose an option: ");
                            userSelection = Scanner.nextInt();
                        }
                        break;
                    case (9):
                        System.out.println("\nYour card is a 9!");
                        playerHand = playerHand + 9;
                        // Special case for if the player achieves a blackjack, gives player +1 win
                        if (playerHand == 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nBLACKJACK! You win!");
                            playerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Special case for if the player goes over 21, gives dealer +1 win
                        else if (playerHand > 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nYou exceeded 21! You lose.");
                            dealerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Redisplays menu if no special cases are met, could use methods to simplify code
                        else {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\n1. Get another card");
                            System.out.println("2. Hold hand");
                            System.out.println("3. Print statistics");
                            System.out.println("4. Exit");
                            System.out.print("\nChoose an option: ");
                            userSelection = Scanner.nextInt();
                        }
                        break;
                    case (10):
                        System.out.println("\nYour card is a 10!");
                        playerHand = playerHand + 10;
                        // Special case for if the player achieves a blackjack, gives player +1 win
                        if (playerHand == 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nBLACKJACK! You win!");
                            playerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Special case for if the player goes over 21, gives dealer +1 win
                        else if (playerHand > 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nYou exceeded 21! You lose.");
                            dealerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Redisplays menu if no special cases are met, could use methods to simplify code
                        else {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\n1. Get another card");
                            System.out.println("2. Hold hand");
                            System.out.println("3. Print statistics");
                            System.out.println("4. Exit");
                            System.out.print("\nChoose an option: ");
                            userSelection = Scanner.nextInt();
                        }
                        break;
                    case (11):
                        System.out.println("\nYour card is a JACK!");
                        playerHand = playerHand + 10;
                        // Special case for if the player achieves a blackjack, gives player +1 win
                        if (playerHand == 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nBLACKJACK! You win!");
                            playerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Special case for if the player goes over 21, gives dealer +1 win
                        else if (playerHand > 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nYou exceeded 21! You lose.");
                            dealerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Redisplays menu if no special cases are met, could use methods to simplify code
                        else {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\n1. Get another card");
                            System.out.println("2. Hold hand");
                            System.out.println("3. Print statistics");
                            System.out.println("4. Exit");
                            System.out.print("\nChoose an option: ");
                            userSelection = Scanner.nextInt();
                        }
                        break;
                    case (12):
                        System.out.println("\nYour card is a QUEEN!");
                        playerHand = playerHand + 10;
                        // Special case for if the player achieves a blackjack, gives player +1 win
                        if (playerHand == 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nBLACKJACK! You win!");
                            playerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Special case for if the player goes over 21, gives dealer +1 win
                        else if (playerHand > 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nYou exceeded 21! You lose.");
                            dealerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Redisplays menu if no special cases are met, could use methods to simplify code
                        else {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\n1. Get another card");
                            System.out.println("2. Hold hand");
                            System.out.println("3. Print statistics");
                            System.out.println("4. Exit");
                            System.out.print("\nChoose an option: ");
                            userSelection = Scanner.nextInt();
                        }
                        break;
                    case (13):
                        System.out.println("\nYour card is a KING!");
                        playerHand = playerHand + 10;
                        // Special case for if the player achieves a blackjack, gives player +1 win
                        if (playerHand == 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nBLACKJACK! You win!");
                            playerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Special case for if the player goes over 21, gives dealer +1 win
                        else if (playerHand > 21) {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\nYou exceeded 21! You lose.");
                            dealerWins++;
                            totalGames++;
                            System.out.println("\nSTART GAME #" + totalGames);
                            userSelection = 1;
                            playerHand = 0;
                        }
                        // Redisplays menu if no special cases are met, could use methods to simplify code
                        else {
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println("\n1. Get another card");
                            System.out.println("2. Hold hand");
                            System.out.println("3. Print statistics");
                            System.out.println("4. Exit");
                            System.out.print("\nChoose an option: ");
                            userSelection = Scanner.nextInt();
                            break;
                        }
                }


            }
            // Loop statement for when the user chooses to hold their hand
            while (userSelection == 2) {
                // Dealer hand randomly generated between 16 and 26
                dealerHand = randomGen.nextInt(11) + 16;
                System.out.println("\nDealer's hand: " + dealerHand);
                System.out.println("Your hand is: " + playerHand);
                // Special case for if the Dealer's hand exceeds 21, user automatically wins
                if (dealerHand > 21) {
                    System.out.println("\nYou win!");
                    playerWins++;
                    totalGames++;
                    System.out.println("\nSTART GAME #" + totalGames);
                    playerHand = 0;
                    userSelection = 1;
                }
                // Special case for if there is a tie, tie games increases by 1 and no one wins
                else if (dealerHand == playerHand) {
                    System.out.println("\nIt's a tie! No one wins!");
                    tieGames++;
                    totalGames++;
                    System.out.println("\nSTART GAME #" + totalGames);
                    playerHand = 0;
                    userSelection = 1;
                }
                // Special case for if the player's hand is greater than the dealer's hand, player automatically wins
                else if (playerHand > dealerHand) {
                    System.out.println("\nYou win!");
                    playerWins++;
                    totalGames++;
                    System.out.println("\nSTART GAME #" + totalGames);
                    playerHand = 0;
                    userSelection = 1;
                }
                // Special case for if the dealer's hand is greater than the player's hand, dealer automatically wins
                else if (dealerHand > playerHand) {
                    System.out.println("\nDealer wins!");
                    dealerWins++;
                    totalGames++;
                    System.out.println("\nSTART GAME #" + totalGames);
                    playerHand = 0;
                    userSelection = 1;
                }
            }
            // Loop statement for when the user chooses to display the statistics of the game
            while (userSelection == 3) {
                double winRatio = ((double) playerWins / ((double) totalGames - 1) * 100);
                // Displays int playerWins, dealerWins, and tieGames, calculates the ratio of player wins to total games played
                System.out.println("Number of Player wins: " + playerWins);
                System.out.println("Number of Dealer wins: " + dealerWins);
                System.out.println("Number of tie games: " + tieGames);
                System.out.println("Total # of games played is: " + (totalGames - 1));
                String winningRatio = String.format("%.1f", winRatio);
                System.out.println("Percentage of Player wins: " + winningRatio + "%");
                System.out.println("\n1. Get another card");
                System.out.println("2. Hold hand");
                System.out.println("3. Print statistics");
                System.out.println("4. Exit");
                System.out.print("\nChoose an option: ");
                userSelection = Scanner.nextInt();
            }
            // Loop statement for when the user chooses to exit the game, program exits upon entry
            while (userSelection == 4) {
                System.exit(0);
            }
            // Loop statement for when the user slection is not within the supported values of the menu
            while (userSelection <= 0 || userSelection > 4) {
                System.out.println("Invalid input!");
                System.out.println("Please enter an integer value between 1 and 4.");
                System.out.println("\n1. Get another card");
                System.out.println("2. Hold hand");
                System.out.println("3. Print statistics");
                System.out.println("4. Exit");
                System.out.print("\nChoose an option: ");
                userSelection = Scanner.nextInt();
            }
        }
    }
}