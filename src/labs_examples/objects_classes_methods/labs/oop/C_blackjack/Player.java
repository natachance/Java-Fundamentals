package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class Player {
    private String name;
    private Hand hand = new Hand();
    private int potValue;

    //constructor for player's name
    public Player(String name, int potValue) {
        this.name = name;
        this.potValue = potValue;
    }

    //setter methods for name
    public void setName(String name) {
        this.name = name;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }

    //getter methods for all instance variables in Player class (don't want setters for hand and potValue)
    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public int getPotValue() {
        return potValue;
    }

    //method to print out the player's hand to the console - if the "player" is the dealer, only one card will "show"
    public void printHand(boolean showFullHand){
        if (!showFullHand){
            System.out.println(hand.getCards().get(0).toString()); //gets the card at the index of 0 in the Cards array and prints it
            System.out.println("All other dealer cards are face down.");
            System.out.println();
        } else {
            for(Card c : hand.getCards()){ //prints each card in the hand (visits each card in the hand ArrayList)
                System.out.println(c.toString());
            }
        }
    }

    //method to set dealer bet automatically based on hand value
    public int dealerBet(int potValue){
        int dealerBet = 0;
        while (dealerBet <= potValue) {
            if (hand.getHandValue() >= 19 && hand.getHandValue() <= 21) {
                dealerBet = potValue / 2;
                return dealerBet;
            } else if (hand.getHandValue() >= 14 && hand.getHandValue() <= 18) {
                dealerBet = potValue / 3;
                return dealerBet;
            } else if (hand.getHandValue() >= 9 && hand.getHandValue() <= 13) {
                dealerBet = potValue / 4;
                return dealerBet;
            } else {
                dealerBet = 0;
                return dealerBet;
            }
        }
        return dealerBet;
    }

    public int checkBet(Player player, int playerBet){
        Scanner scanner = new Scanner(System.in);

        while (playerBet > player.getPotValue()) {
            System.out.println("You have $" + player.getPotValue() + " to play with currently. Please choose a lower amount.");
            playerBet = scanner.nextInt();
        }
        return playerBet;
    }

    public int playerBet(Player player) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much would you like to bet?");
        int playerBet = scanner.nextInt();

        //checks whether bet is higher than current pot value, and if so takes in an updated bet
        int updatedPlayerBet = player.checkBet(player, playerBet);

        return updatedPlayerBet;
    }

    public int playerAddToBet(Player player, int playerBet) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to add to your bet?");
        String betResponse = scanner.next();

        if (betResponse.equalsIgnoreCase("Y")) {
            System.out.println("How much?");
            playerBet += scanner.nextInt();

            //requires lower bet if player bets more than in current pot
            player.checkBet(player, playerBet);

            System.out.println("Your total bet is: $" + playerBet + ".");
            System.out.println();
        } else {
            System.out.println("Ok, your bet remains: $" + playerBet + ".");
            System.out.println();
        }
        return playerBet;
    }

    public int dealerAddToBet(Player dealer, int dealerBet) {
        int temp = dealerBet;
        dealerBet += dealer.dealerBet(dealer.getPotValue());

        if (temp < dealerBet) {
            System.out.println("Dealer has raised bet to: $" + dealerBet + ".");
            System.out.println();
        } else {
            System.out.println("Dealer bet remains: $" + dealerBet + ".");
            System.out.println();
        }
        return dealerBet;
    }

    //method to show dealer hand, declare point values for dealer and player, and add player bet to dealer pot when dealer wins
    public void dealerWin(Player player, Player dealer, int playerBet){
        System.out.println();
        System.out.println("Dealer's cards:");
        dealer.printHand(true);
        System.out.println();
        System.out.println("You have " + player.getHand().getHandValue() + " points. The dealer wins the hand with "
                + dealer.getHand().getHandValue() + " points.");
        System.out.println("-----------------------------------");
        System.out.println();

        //add player's bet to dealer's pot
        dealer.setPotValue(dealer.getPotValue() + playerBet);
        player.setPotValue(player.getPotValue() - playerBet);
        System.out.println("The dealer now has $" + dealer.getPotValue() + " and you have $" +
                player.getPotValue() + ".");
        System.out.println("-----------------------------------");
    }

    //method to show dealer hand, declare point values for dealer and player, and add dealer bet to player pot when player wins
    public void playerWin(Player player, Player dealer, int dealerBet){
        System.out.println();
        System.out.println("Dealer's cards:");
        dealer.printHand(true);
        System.out.println();
        System.out.println("The dealer has " + dealer.getHand().getHandValue() + " points. You have " +
                player.getHand().getHandValue() + " points. You win the hand!");
        System.out.println("-----------------------------------");
        System.out.println();

        //add dealer's bet to player's pot
        player.setPotValue(dealerBet + player.getPotValue());
        dealer.setPotValue(dealer.getPotValue() - dealerBet);
        System.out.println("You now have $" + player.getPotValue() + " and the dealer has $" +
                dealer.getPotValue() + ".");
        System.out.println("-----------------------------------");
    }

    public void playerOver21(Player player, Player dealer, int playerBet) {
        System.out.println();
        System.out.println("You've gone over 21!");
        dealer.dealerWin(player, dealer, playerBet);
        System.out.println("-----------------------------------");
    }

    public void dealerOver21(Player player, Player dealer, int dealerBet) {
        System.out.println();
        System.out.println("The dealer went over 21!");
        player.playerWin(player, dealer, dealerBet);
        System.out.println("-----------------------------------");
    }
}
