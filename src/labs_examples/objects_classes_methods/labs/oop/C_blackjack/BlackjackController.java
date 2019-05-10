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

            //calling method to clear usedCards Array List
            deck.shuffleDeck();

            //calling method to clear each player's cards array that makes up their hand
            player.getHand().clearHand();
            dealer.getHand().clearHand();

            //dealing 2 cards to each "player"
            deck.deal(player);
            deck.deal(dealer);
            deck.deal(player);
            deck.deal(dealer);

            //printing the hands by calling the printHand method from the Player class
            System.out.println();
            System.out.println("You were dealt: ");
            player.printHand(true);
            System.out.println();
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
                            System.out.println();
                            System.out.println("You've gone over 21!");
                            dealer.dealerWin(player, dealer, playerBet);
                            System.out.println("-----------------------------------");
                            playerContinue = false;
                            dealerContinue = false;
                            break;

                        } else {
                            //checks if player wants to increase bet
                            System.out.println("Would you like to add to your bet?");
                            String betResponse = scanner.next();

                            if (betResponse.equalsIgnoreCase("Y")) {
                                System.out.println("How much?");
                                playerBet += scanner.nextInt();

                                //requires lower bet if player bets more than in current pot
                                if (playerBet > player.getPotValue()) {
                                    System.out.println("You have $" + player.getPotValue() +
                                            " to play with currently. Please choose a lower amount.");
                                    int updatedPlayerBet = scanner.nextInt();
                                    playerBet = updatedPlayerBet;
                                } else {
                                    System.out.println("Your total bet is: $" + playerBet + ".");
                                    System.out.println();
                                }
                            } else {
                                System.out.println("Ok, your bet remains: $" + playerBet + ".");
                                System.out.println();
                            }
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
                            System.out.println();
                            System.out.println("The dealer went over 21!");
                            player.playerWin(player, dealer, dealerBet);
                            System.out.println("-----------------------------------");
                            dealerContinue = false;
                            playerContinue = false;
                            break;
                        } else {

                            //compares dealerBet to hand value and follows criteria in dealerBet method to increase bet or not
                            int temp = dealerBet;
                            dealerBet += dealer.dealerBet(dealer.getPotValue());

                            if (temp < dealerBet) {
                                System.out.println("Dealer has raised bet to: $" + dealerBet + ".");
                                System.out.println();
                            } else {
                                System.out.println("Dealer bet remains: $" + dealerBet + ".");
                                System.out.println();
                            }
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
}