package labs_examples.objects_classes_methods.labs.objects;

//     Following the example in CarExample.java, please use Object Composition to model an Airplane class.
//     The Airplane class must be composed of at least 4 other classes (as well as any primitive types you'd like).
//     The Airplane class itself should have a fuel capacity (double) variable, as well as a currentFuelLevel variable.
//     We'll use these a bit later.

class AirplaneLabOutput {

    public static void main(String[] args) {

        Make makeName = new Make("Boeing");
        Model modelNumber = new Model(787);
        Capacity maxPax = new Capacity(335);
        Range maxRange = new Range(6900);
        Airplane myAirplane = new Airplane(makeName, modelNumber, maxPax, maxRange, 33340, 15580, "Delta");

        System.out.println("This new " + myAirplane.make.brandName + " " + myAirplane.model.modelNumber + ", flown by " + myAirplane.airline +
                ", carries up to " + myAirplane.capacity.numberOfSeats + " passengers and can fly as far as " + myAirplane.range.maxDistance +
                " miles in one trip. The fuel capacity is " + myAirplane.fuelCapacity + " gallons, and it currently has "
                + myAirplane.currentFuelLevel + " gallons of fuel onboard.");

        System.out.println();

        System.out.println(myAirplane.toString());
    }
}


class Make {

    String brandName;

    public Make(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "Make{" +
                "brandName='" + brandName + '\'' +
                '}';
    }
}

class Model {

    int modelNumber;

    public Model(int modelNumber){
        this.modelNumber = modelNumber;
    }

    @Override
    public String toString() {
        return "Model{" +
                "modelNumber=" + modelNumber +
                '}';
    }
}

class Capacity {

    int numberOfSeats;

    public Capacity(int numberOfSeats){
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Capacity{" +
                "numberOfSeats=" + numberOfSeats +
                '}';
    }
}

class Range {

    int maxDistance;

    public Range(int maxDistance){
        this.maxDistance = maxDistance;
    }

    @Override
    public String toString() {
        return "Range{" +
                "maxDistance=" + maxDistance +
                '}';
    }
}

class Airplane {

    Make make;
    Model model;
    Capacity capacity;
    Range range;

    double fuelCapacity;
    double currentFuelLevel;
    String airline;

    public Airplane(Make make, Model model, Capacity capacity, Range range, double fuelCapacity, double currentFuelLevel, String airline) {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
        this.range = range;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.airline = airline;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "make=" + make +
                ",\n model=" + model +
                ",\n capacity=" + capacity +
                ",\n range=" + range +
                ",\n fuelCapacity=" + fuelCapacity +
                ",\n currentFuelLevel=" + currentFuelLevel +
                ",\n airline='" + airline + '\'' +
                '}';
    }
}