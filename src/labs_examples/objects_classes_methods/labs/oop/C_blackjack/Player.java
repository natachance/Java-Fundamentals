package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    private String name;
    private Hand hand = new Hand();
    private int potValue;

    //constructor for player's name
    public Player(String name, int potValue) {
        this.name = name;
        this.potValue = potValue;
    }

    //setter method for name
    public void setName(String name) {
        this.name = name;
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
        } else {
            for(Card c : hand.getCards()){ //prints each card in the hand (visits each card in the hand ArrayList)
                System.out.println(c.toString());
            }
        }
    }

    //method to set dealer bet automatically based on hand value
    public int dealerBet(int potValue){
        int dealerBet;
        if(hand.getHandValue() >= 19 && hand.getHandValue() <= 21){
            dealerBet = potValue / 2;
            return dealerBet;
        } else if (hand.getHandValue() >= 14 && hand.getHandValue() <= 18){
            dealerBet = potValue / 3;
            return  dealerBet;
        } else if (hand.getHandValue() >= 9 && hand.getHandValue() <= 13){
            dealerBet = potValue / 4;
            return  dealerBet;
        } else {
            dealerBet = potValue / 5;
            return dealerBet;
        }
    }
}
