package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards = new ArrayList<>();

    public Hand(){} //default constructor

    //method to get the cards in the hand
    public ArrayList<Card> getCards() {
        return cards;
    }

    //method to get the total value of a hand
    public int getHandValue() {
        int value = 0;
        //looks at each card in the cards (hand) Array List
        for(Card c : cards){
            value += c.getPointValue(); //calls the getter method to get the int pointValue from the card class, adds together
        }
        return value;
    }
}
