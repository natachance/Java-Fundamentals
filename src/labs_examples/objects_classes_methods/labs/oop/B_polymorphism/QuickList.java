package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class QuickList {
    WebStore webstore;

    public QuickList(WebStore webstore) {
        this.webstore = webstore;
    }

    public void webstoreMethods(){
        webstore.listItem();
        webstore.addToCart();
        webstore.purchaseItem();
        webstore.removeItem();
        System.out.println("--------------------------");
    }

    public WebStore getWebstore() {
        return webstore;
    }

    public void setWebstore(WebStore webstore) {
        this.webstore = webstore;
    }
}
