package labs_examples.objects_classes_methods.labs.objects;

//     Following the example in CarExample.java, please use Object Composition to model an Airplane class.
//     The Airplane class must be composed of at least 4 other classes (as well as any primitive types you'd like).
//     The Airplane class itself should have a fuel capacity (double) variable, as well as a currentFuelLevel variable.
//     We'll use these a bit later.

class AirplaneLabOutput {

    public static void main(String[] args) {

        Make makeName = new Make("Boeing");
        makeName.setBrandName("Airbus");

        Model modelNumber = new Model(787);
        modelNumber.setModelNumber(380);

        Capacity maxPax = new Capacity(335);
        maxPax.setNumberOfSeats(868);

        Range maxRange = new Range(6900);
        maxRange.setMaxDistance(9755);

        Airplane myAirplane = new Airplane(makeName, modelNumber, maxPax, maxRange, 33340,
                15580, "Delta");
        myAirplane.setAirline("Aerlingus");
        myAirplane.setCurrentFuelLevel(68924);
        myAirplane.setFuelCapacity(84535);

        System.out.println("This new " + myAirplane.make.getBrandName() + " " + myAirplane.model.getModelNumber() +
                ", flown by " + myAirplane.getAirline() + ", carries up to " + myAirplane.capacity.getNumberOfSeats() +
                " passengers and can fly as far as " + myAirplane.range.getMaxDistance() +
                " miles in one trip. The fuel capacity is " + myAirplane.getFuelCapacity() + " gallons, and it currently has "
                + myAirplane.getCurrentFuelLevel() + " gallons of fuel onboard.");

        System.out.println();

        System.out.println(myAirplane.toString());
    }
}

class Make {

    private String brandName;

    public Make(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
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

    private int modelNumber;

    public Model(int modelNumber){
        this.modelNumber = modelNumber;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
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

    private int numberOfSeats;

    public Capacity(int numberOfSeats){
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
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

    private int maxDistance;

    public Range(int maxDistance){
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
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

    private double fuelCapacity;
    private double currentFuelLevel;
    private String airline;

    public Airplane(Make make, Model model, Capacity capacity, Range range, double fuelCapacity,
                    double currentFuelLevel, String airline) {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
        this.range = range;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.airline = airline;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
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