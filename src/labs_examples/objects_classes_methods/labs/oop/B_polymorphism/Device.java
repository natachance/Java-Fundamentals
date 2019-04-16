package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public interface Device {
    public void turnOn();
    public void turnOff();
    public void reboot();
    public void wake();
}

class ComputerController {
    public static void main(String[] args) {
        Computer myLaptop = new Laptop("MacBook", "Pro", 2012, "12 inch");
        Computer myDesktop = new Desktop("Dell", "Tower", 2010);

        System.out.println("To wake laptop: ");
        myLaptop.wake();
        System.out.println();
        System.out.println("To wake desktop: ");
        myDesktop.wake();
    }
}

class Computer implements Device {
    @Override
    public void turnOn() {
        System.out.println("Press power button.");
    }

    @Override
    public void turnOff() {
        System.out.println("Select shut down from menu.");
    }

    @Override
    public void reboot() {
        System.out.println("Hold power button for 5 seconds.");
    }

    @Override
    public void wake() {
        System.out.println("Tap space bar.");
    }

    protected String brand;
    protected String model;
    protected int yearManufactured;

    public Computer(String brand, String model, int yearManufactured) {
        this.brand = brand;
        this.model = model;
        this.yearManufactured = yearManufactured;
    }
}

class Desktop extends Computer{
    public Desktop(String brand, String model, int yearManufactured) {
        super(brand, model, yearManufactured);
    }
}

class Laptop extends Computer{
    String size;

    public Laptop(String brand, String model, int yearManufactured, String size) {
        super(brand, model, yearManufactured);
        this.size = size;
    }

    @Override
    public void wake() {
        System.out.println("Open lid.");
    }
}