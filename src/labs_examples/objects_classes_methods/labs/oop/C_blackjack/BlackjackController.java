package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackjackController {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BlackjackController game = new BlackjackController(); //the game is a new instance of the BlackjackController class
        Player player = game.initializePlayer();
        Player dealer = new Player("dealer", player.getPotValue());

        game.playBlackjack(player, dealer); //calls playBlackjack method which is below

//        if (player.getPotValue() > 0 && dealer.getPotValue() > 0){
//            game.playBlackjack(player, dealer);
//        } else if (dealer.getPotValue() == 0) {
//            System.out.println("The dealer ran out of money! You win!");
//        } else {
//            System.out.println("You ran out of money. The dealer wins. Game over.");
//        }
    }

    private void playBlackjack(Player player, Player dealer) {

        while (player.getPotValue() > 0 && dealer.getPotValue() > 0) {

            //creating a deck variable as a new instance of the Deck class
            Deck deck = new Deck();

            //calls method to clear usedCards ArrayList and player and dealer's hands
            resetGame(deck, player, dealer);

            //deal two cards each to player and dealer at start of hand
            deck.initialDeal(player, dealer);

            //taking in first player bet and generating first dealer bet
            int dealerBet = dealer.dealerBet(dealer.getPotValue());
            int playerBet = player.playerBet(player);

            System.out.println("You have bet $" + playerBet + " and the dealer has bet $" + dealerBet + ".");
            System.out.println();

            //checking if either player wants to keep playing
            boolean playerContinue = true;
            boolean dealerContinue = true;

            while (playerContinue || dealerContinue) {

                //checking if player wants another card
                while (playerContinue) {
                    System.out.println("Would you like another card? (Y/N)");
                    String cardResponse = scanner.next();
                    System.out.println();

                    //deals another card if player input Y to scanner, otherwise ends dealing option for player
                    if (cardResponse.equalsIgnoreCase("Y")) {
                        deck.deal(player);
                        player.printHand(true);
                        System.out.println();

                        //checks if a hand goes over 21 point value, which ends the game
                        if (player.getHand().handOver21()) {
                            player.playerOver21(player, dealer, playerBet);
                            playerContinue = false;
                            dealerContinue = false;
                            break;
                        } else {
                            //checks if player wants to increase bet
                            player.playerAddToBet(player, playerBet);
                        }
                    } else {
                        playerContinue = false;
                    }
                }

                //deals another card to the dealer as long as dealer hand is less than 16, then ends dealing option for dealer
                while (dealerContinue && dealer.getHand().getHandValue() <= 21) {
                    if (dealer.getHand().getHandValue() < 16) {
                        deck.deal(dealer);
                        System.out.println("Dealer took another card.");
                        System.out.println();

                        //checks if a hand goes over 21 point value, which ends the game
                        if (dealer.getHand().handOver21()) {
                            dealer.dealerOver21(player, dealer, dealerBet);
                            dealerContinue = false;
                            playerContinue = false;
                            break;
                        } else {
                            //compares dealerBet to hand value and follows criteria in dealerBet method to increase bet or not
                            dealer.dealerAddToBet(dealer, dealerBet);
                        }
                    } else {
                        dealerContinue = false;
                        System.out.println("Dealer did not take another card.");
                    }
                }
            }
            // determine which person has the highest value hand and wins
            if (!player.getHand().handOver21() && !dealer.getHand().handOver21()) {
                // if dealer wins
                if (dealer.getHand().getHandValue() > player.getHand().getHandValue()) {
                    dealer.dealerWin(player, dealer, playerBet);
                //if player wins
                } else {
                    player.playerWin(player, dealer, dealerBet);
                }
            }
        }

        checkForBroke(player);
    }

    private Player initializePlayer() {
        //requesting player to input name
        System.out.println("Welcome to Blackjack. In this game, aces = 1, face cards = 10 and ties go to the player!");
        System.out.println("Let's get started! What is your name?");
        String playerName = scanner.next();

        System.out.println("How much money would you like to start with?");
        int potValue = scanner.nextInt();

        //assigning name (input to the scanner) to a variable/new instance of the Player class
        Player player = new Player(playerName, potValue);
        System.out.println();
        System.out.println("Great, " + playerName + "! You're starting with $" + potValue + ", and so is the dealer. Let's play.");
        return player;
    }

    private void resetGame(Deck deck, Player player, Player dealer) {
        //calling method to clear usedCards Array TaskList
        deck.shuffleDeck();

        //calling method to clear each player's cards array that makes up their hand
        player.getHand().clearHand();
        dealer.getHand().clearHand();
    }

    private void checkForBroke(Player player) {
        if (player.getPotValue() == 0) {
            System.out.println("You ran out of money! The dealer wins.");
            System.out.println();
            System.out.println("--------------------GAME OVER--------------------");
            return;
        } else {
            System.out.println("The dealer ran out of money! You win the game!");
            System.out.println();
            System.out.println("------------------GAME OVER-------------------");
            return;
        }
    }
}