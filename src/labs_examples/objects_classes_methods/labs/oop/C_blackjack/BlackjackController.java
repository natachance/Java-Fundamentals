package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackjackController {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BlackjackController game = new BlackjackController(); //the game is a new instance of the BlackjackController class
        Player player = game.initializePlayer();
        Player dealer = new Player("dealer", player.getPotValue());

        game.playBlackjack(player, dealer); //calls playBlackjack method which is below
    }

    private void playBlackjack(Player player, Player dealer) {
        while (player.getPotValue() > 0 && dealer.getPotValue() > 0) {

            //creating a deck variable as a new instance of the Deck class, and dealing 2 cards to each "player"

            Deck deck = new Deck();
            deck.shuffleDeck();
            deck.deal(player);
            deck.deal(dealer);
            deck.deal(player);
            deck.deal(dealer);

            //printing the hands by calling the printHand method from the Player class
            System.out.println("You were dealt: ");
            player.printHand(true);
            System.out.println("And the dealer was dealt: ");
            dealer.printHand(false);

            //taking in first player bet and generating first dealer bet
            int dealerBet = dealer.dealerBet(dealer.getPotValue());
            System.out.println("How much would you like to bet?");
            int playerBet = scanner.nextInt();

            if (playerBet > player.getPotValue()) {
                System.out.println("You have $" + player.getPotValue() + " to play with currently. Please choose a lower amount.");
                int updatedPlayerBet = scanner.nextInt();
                playerBet = updatedPlayerBet;
            }

            System.out.println("You have bet $" + playerBet + " and the dealer has bet $" + dealerBet + ".");


            //checking if either player wants to keep playing
            boolean playerContinue = true;
            boolean dealerContinue = true;

            while (playerContinue || dealerContinue) {

                //checking if player wants another card
                if (playerContinue) {
                    System.out.println("Would you like another card? (Y/N)");
                    String cardResponse = scanner.next();

                    //deals another card if player input Y to scanner, otherwise ends dealing option for player
                    if (cardResponse.equalsIgnoreCase("Y")) {
                        deck.deal(player);
                        player.printHand(true);
                    } else {
                        playerContinue = false;
                    }
                }

                //deals another card to the dealer as long as dealer hand is less than 16, then ends dealing option for dealer
                if (dealerContinue && dealer.getHand().getHandValue() <= 21) {
                    if (dealer.getHand().getHandValue() < 16) {
                        deck.deal(dealer);
                        System.out.println("Dealer took another card.");
                    } else {
                        dealerContinue = false;
                        System.out.println("Dealer did not take another card.");
                    }
                }

                //checks if a hand goes over 21 point value, which ends the game
                while (player.getHand().handOver21()) {
                    System.out.println("You've gone over 21! Game over.");
                    break;
                }

                while (dealer.getHand().handOver21()) {
                    System.out.println("The dealer went over 21! You win the hand!");
                    break;
                }

                //checks if player wants to increase bet
                System.out.println("Would you like to add to your bet?");
                String betResponse = scanner.next();

                if (betResponse.equalsIgnoreCase("Y")) {
                    System.out.println("How much?");
                    playerBet += scanner.nextInt();
                    System.out.println("Your total bet is: $" + playerBet + ".");
                } else {
                    System.out.println("Ok, your bet remains: $" + playerBet + ".");
                }

                //compares dealerBet to hand value and follows criteria in dealerBet method to increase bet or not
                int temp = dealerBet;
                dealerBet += dealer.dealerBet(dealer.getPotValue());

                if (temp < dealerBet) {
                    System.out.println("Dealer has raised bet to: $" + dealerBet + ".");
                } else {
                    System.out.println("Dealer bet remains: $" + dealerBet + ".");
                }
            }

            // determine which person has the highest value hand and wins, if neither went over and neither wants another card
            if (dealer.getHand().getHandValue() > player.getHand().getHandValue()) {
                System.out.println("You have " + player.getHand().getHandValue() + " points. The dealer wins the hand with "
                        + dealer.getHand().getHandValue() + " points.");

                //add player's bet to dealer's pot, check if player pot = 0 and if so, end game
                dealer.setPotValue(dealer.getPotValue() + playerBet);
                player.setPotValue(player.getPotValue() - playerBet);
                if (player.getPotValue() == 0) {
                    System.out.println("You ran out of money! The dealer wins the game!");
                    return;
                } else {
                    System.out.println("The dealer now has $" + dealer.getPotValue() + " and you have $" + player.getPotValue() + ".");
                }
            } else {
                System.out.println("Dealer's cards:");
                dealer.printHand(true);
                System.out.println("The dealer has " + dealer.getHand().getHandValue() + " points. You have " +
                        player.getHand().getHandValue() + " points. You win the hand!");

                //add dealer's bet to player's pot, check if dealer pot = 0 and if so, end game
                player.setPotValue(dealerBet + player.getPotValue());
                dealer.setPotValue(dealer.getPotValue() - dealerBet);
                if (dealer.getPotValue() == 0) {
                    System.out.println("The dealer ran out of money! You win!");
                    return;
                } else {
                    System.out.println("You now have $" + player.getPotValue() + " and the dealer has $" + dealer.getPotValue() + ".");
                }
            }
        }
    }

    private Player initializePlayer() {
        //requesting player to input name
        System.out.println("Welcome to Blackjack. In this game, aces = 1 and face cards = 10.");
        System.out.println("Let's get started! What is your name?");
        String playerName = scanner.next();

        System.out.println("How much money would you like to start with?");
        int potValue = scanner.nextInt();

        //assigning name (input to the scanner) to a variable/new instance of the Player class
        Player player = new Player(playerName, potValue);
        System.out.println("Great, " + playerName + "! You're starting with $" + potValue + ", and so is the dealer. Let's play.");
        return player;
    }
}