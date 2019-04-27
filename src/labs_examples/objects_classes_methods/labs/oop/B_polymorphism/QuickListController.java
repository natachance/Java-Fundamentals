package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class QuickListController {
    public static void main(String[] args) {
        Item mug = new Mug(1, "red", "camp", "12 oz.", "steel");
        Item coasters = new Coasters(4, "blue", "round");
        Item customRug = new CustomRopeRug(1, "teal", "doormat", "14 x 28 inch", "knot weave");

        QuickList example = new QuickList(mug);
        example.webstoreMethods();

        example.setWebstore(coasters);
        example.webstoreMethods();

        example.setWebstore(customRug);
        example.webstoreMethods();
    }
}
