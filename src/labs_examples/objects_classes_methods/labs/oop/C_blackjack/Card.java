package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    private char suit;
    private int faceValue;
    private int pointValue;

    //Card constructor
    public Card(char suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;

        //accounts for face cards by assigning them all values of 10, while maintaining their number identifier
        if (faceValue > 10){
            pointValue = 10;
        } else {
            pointValue = faceValue;
        }
    }

    //getter methods for all instance variables in Card class
    public char getSuit() {
        return suit;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public int getPointValue() {
        return pointValue;
    }

    //toString to be able to print card suit and value (I think I can adjust this to make it print better)
    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", faceValue=" + faceValue +
                ", pointValue=" + pointValue +
                '}';
    }
}
