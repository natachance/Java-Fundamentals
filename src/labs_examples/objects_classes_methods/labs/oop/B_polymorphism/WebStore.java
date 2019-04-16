package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

import java.util.Scanner;

public interface WebStore {
    public void listItem();
    public void addToCart();
    public void purchaseItem();
    public void removeItem();
}

class StoreController{
    public static void main(String[] args) {
        Item newCustomRug = new CustomRopeRug(1, "blue", "doormat", "12 x 22 inch", "Celtic knot");
        newCustomRug.purchaseItem();
    }
}

class Item implements WebStore{
    int quantity;
    String color;
    String style;
    String size;

    public Item(int quantity, String color, String style, String size) {
        this.quantity = quantity;
        this.color = color;
        this.style = style;
        this.size = size;
    }

    @Override
    public void listItem() {
        System.out.println("Listing item for sale.");
    }

    @Override
    public void addToCart() {
        System.out.println("Adding item to shopping cart.");
    }

    @Override
    public void purchaseItem() {
        System.out.println("Purchasing item.");
    }

    @Override
    public void removeItem() {
        System.out.println("Removing item from store.");
    }
}

class RopeRug extends Item{
    String pattern;

    public RopeRug(int quantity, String color, String style, String size, String pattern) {
        super(quantity, color, style, size);
        this.pattern = pattern;
    }
}

class CustomRopeRug extends RopeRug{
    public CustomRopeRug(int quantity, String color, String style, String size, String pattern) {
        super(quantity, color, style, size, pattern);
    }

    @Override
    public void purchaseItem(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter the thickness of your rope in millimeters, and hit enter.");
        double ropeThickness = scanner1.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter the length of your rope in meters, and hit enter.");
        double ropeLength = scanner2.nextDouble();

        if (ropeLength < 30.0){
            System.out.println("Your rope (" + ropeLength + " meters) is not long enough to make a full rug.");
        } else {
            System.out.println("Please send your rope (" + ropeThickness + " mm, " + ropeLength + " meters) to the following address: 123 A Street.");
        }
    }
}

class Coasters extends Item{
    public Coasters(int quantity, String color, String style, String size) {
        super(4, color, style, "One size only.");
    }
}

class Shirts extends Item{
    String fabric;

    public Shirts(int quantity, String color, String style, String size, String fabric) {
        super(quantity, color, style, size);
        this.fabric = fabric;
    }
}

//    shirts
//      tshirt
//      tank
//      longsleeve
//    mugs
//      ceramic
//      camping
//    coozies
