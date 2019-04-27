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
        CustomRopeRug newCustomRug = new CustomRopeRug(1, "blue", "doormat", "12 x 22 inch",
                "Celtic knot");
        newCustomRug.purchaseItem();
        System.out.println();

        Item newRopeRug = new RopeRug(1, "blue", "doormat", "14 x 28 inch", "waffle weave");
        System.out.println("Listing and selling new rope rug:");
        newRopeRug.listItem();
        newRopeRug.addToCart();
        newRopeRug.purchaseItem();
        System.out.println(newRopeRug);
        System.out.println();

        Item newCustomCoasters = new CustomCoasters(4, "red", "round");
        newCustomCoasters.purchaseItem();
        System.out.println(newCustomCoasters);
        System.out.println();

        Item newCoasters = new Coasters(4, "teal", "square");
        System.out.println("Listing and selling new coasters:");
        newCoasters.listItem();
        newCoasters.addToCart();
        newCoasters.purchaseItem();
        System.out.println(newCoasters);
        System.out.println();

        Item newTshirt = new Tshirt(1, "grey", "cams", "S", "cotton blend");
        newTshirt.purchaseItem();
        System.out.println(newTshirt);
        System.out.println();

        Item newTank = new Tank(2, "red", "mountains", "M", "synthetic blend", "womens");
        newTank.purchaseItem();
        System.out.println(newTank);
        System.out.println();

        Item newCampMug = new CampMug(4, "blue", "logo", "12 oz.", "stainless steel");
        System.out.println(newCampMug);
        System.out.println();

        Item newCoozie = new Coozie(2, "purple", "rope");
        System.out.println("Listing and selling new coozies:");
        newCoozie.listItem();
        newCoozie.addToCart();
        newCoozie.purchaseItem();
        System.out.println(newCoozie);
        System.out.println();

        Item newCustomCoozie = new CustomCoozie(1, "red", "rope");
        System.out.println("Listing and selling custom coozie option:");
        newCustomCoozie.listItem();
        newCustomCoozie.addToCart();
        newCustomCoozie.purchaseItem();
        System.out.println(newCustomCoozie);
        System.out.println();
    }
}

class Item implements WebStore{
    protected int quantity;
    protected String color;
    protected String style;
    protected String size;

    public Item(int quantity, String color, String style, String size) {
        this.quantity = quantity;
        this.color = color;
        this.style = style;
        this.size = size;
    }

    public Item(int quantity, String color, String style) {
        this.quantity = quantity;
        this.color = color;
        this.style = style;
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
    public void purchaseItem() { System.out.println("Purchasing item."); }

    @Override
    public void removeItem() {
        System.out.println("Removing item from store.");
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Item{" +
                "quantity=" + quantity +
                ", color='" + color + '\'' +
                ", style='" + style + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

class RopeRug extends Item{
    protected String pattern;

    public RopeRug(int quantity, String color, String style, String size, String pattern) {
        super(quantity, color, style, size);
        this.pattern = pattern;
    }

    @Override
    public String toString() {
        return "RopeRug{" +
                "quantity=" + quantity +
                ", color='" + color + '\'' +
                ", style='" + style + '\'' +
                ", size='" + size + '\'' +
                ", pattern='" + pattern + '\'' +
                '}';
    }
}

class CustomRopeRug extends RopeRug{
    public CustomRopeRug(int quantity, String color, String style, String size, String pattern) {
        super(quantity, color, style, size, pattern);
    }

    @Override
    public void purchaseItem(){
        Scanner scannerThickness = new Scanner(System.in);
        System.out.println("Please enter the thickness of your rope in millimeters, and hit enter.");
        double ropeThickness = scannerThickness.nextDouble();

        Scanner scannerLength = new Scanner(System.in);
        System.out.println("Please enter the length of your rope in meters, and hit enter.");
        double ropeLength = scannerLength.nextDouble();

        if (ropeLength < 30.0){
            System.out.println("Your rope (" + ropeLength + " meters) is not long enough to make a full rug.");
        } else {
            System.out.println("Please send your rope (" + ropeThickness + " mm, " + ropeLength +
                    " meters) to the following address: 123 A Street.");
        }
    }

    @Override
    public String toString() {
        return  "CustomRopeRug{" +
                "quantity=" + quantity +
                ", color='" + color + '\'' +
                ", style='" + style + '\'' +
                ", size='" + size + '\'' +
                ", pattern='" + pattern + '\'' +
                '}';
    }
}

class Coasters extends Item{
    public Coasters(int quantity, String color, String style) {
        super(quantity, color, style);
        super.setSize("One size only.");
    }

    @Override
    public String toString() {
        return  "Coasters{" +
                "quantity=" + quantity +
                ", color='" + color + '\'' +
                ", style='" + style + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

class CustomCoasters extends Coasters{
    public CustomCoasters(int quantity, String color, String style) {
        super(quantity, color, style);
        super.setSize("One size only.");
    }

    @Override
    public void purchaseItem() {
        Scanner scannerLength = new Scanner(System.in);
        System.out.println("Please enter the length of your rope in inches, and hit enter.");
        double ropeLength = scannerLength.nextDouble();

        if (ropeLength < 42.0) {
            System.out.println("Your rope (" + ropeLength + " inches) is not long enough to make a full set of coasters.");
        } else {
            System.out.println("Please send your rope (" + ropeLength +
                    " centimeters) to the following address: 123 A Street.");
        }
    }

    @Override
    public String toString() {
        return "CustomCoasters{" +
                "quantity=" + quantity +
                ", color='" + color + '\'' +
                ", style='" + style + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

class Shirt extends Item{
    protected String fabric;

    public Shirt(int quantity, String color, String style, String size, String fabric) {
        super(quantity, color, style, size);
        this.fabric = fabric;
    }

    @Override
    public String toString() {
        return  "Shirt{" +
                "quantity=" + quantity +
                ", color='" + color + '\'' +
                ", style='" + style + '\'' +
                ", size='" + size + '\'' +
                ", fabric='" + fabric + '\'' +
                '}';
    }
}

class Tshirt extends Shirt{
    public Tshirt(int quantity, String color, String style, String size, String fabric) {
        super(quantity, color, style, size, fabric);
    }

    @Override
    public String toString() {
        return  "Tshirt{" +
                "quantity=" + quantity +
                ", color='" + color + '\'' +
                ", style='" + style + '\'' +
                ", size='" + size + '\'' +
                ", fabric='" + fabric + '\'' +
                '}';
    }
}

class Tank extends Shirt{
    protected String gender;

    public Tank(int quantity, String color, String style, String size, String fabric, String gender) {
        super(quantity, color, style, size, fabric);
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  "Tank{" +
                "quantity=" + quantity +
                ", color='" + color + '\'' +
                ", style='" + style + '\'' +
                ", size='" + size + '\'' +
                ", fabric='" + fabric + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

class Longsleeve extends Shirt{
    public Longsleeve(int quantity, String color, String style, String size, String fabric) {
        super(quantity, color, style, size, fabric);
    }

    @Override
    public String toString() {
        return  "Longsleeve{" +
                "quantity=" + quantity +
                ", color='" + color + '\'' +
                ", style='" + style + '\'' +
                ", size='" + size + '\'' +
                ", fabric='" + fabric + '\'' +
                '}';
    }
}

class Mug extends Item{
    protected String material;

    public Mug(int quantity, String color, String style, String size, String material) {
        super(quantity, color, style, size);
        this.material = material;
    }

    @Override
    public String toString() {
        return  "Mug{" +
                "quantity=" + quantity +
                ", color='" + color + '\'' +
                ", style='" + style + '\'' +
                ", size='" + size + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}

class DinerMug extends Mug{
    public DinerMug(int quantity, String color, String style, String size, String material) {
        super(quantity, color, style, size, material);
    }

    @Override
    public String toString() {
        return  "DinerMug{" +
                "quantity=" + quantity +
                ", color='" + color + '\'' +
                ", style='" + style + '\'' +
                ", size='" + size + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}

class CampMug extends Mug{
    public CampMug(int quantity, String color, String style, String size, String material) {
        super(quantity, color, style, size, material);
    }

    @Override
    public String toString() {
        return  "CampMug{" +
                "quantity=" + quantity +
                ", color='" + color + '\'' +
                ", style='" + style + '\'' +
                ", size='" + size + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}

class Coozie extends Item{
    public Coozie(int quantity, String color, String style) {
        super(quantity, color, style);
        super.setSize("One size only.");
    }

    @Override
    public String toString() {
        return  "Coozie{" +
                "quantity=" + quantity +
                ", color='" + color + '\'' +
                ", style='" + style + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

class CustomCoozie extends Coozie{
    public CustomCoozie(int quantity, String color, String style) {
        super(quantity, color, style);
        super.setSize("One size only.");
    }

    @Override
    public void purchaseItem(){
        Scanner scannerLength = new Scanner(System.in);
        System.out.println("Please enter the length of your rope in inches, then hit enter.");
        double ropeLength = scannerLength.nextDouble();

        if(ropeLength < 36){
            System.out.println("Your rope (" + ropeLength + " inches) is not long enough to make a coozie.");
        } else {
            System.out.println("Please mail your rope (" + ropeLength + " inches) to the following address: 123 A Street.");
        }
    }

    @Override
    public String toString() {
        return  "CustomCoozie{" +
                "quantity=" + quantity +
                ", color='" + color + '\'' +
                ", style='" + style + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}