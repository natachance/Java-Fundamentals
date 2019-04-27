package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.ComputerStore;

public class ComputerBuilder {
    public static void main(String[] args) {

        PanasonicMonitor monitor1 = new PanasonicMonitor();
        SonyMonitor monitor2 = new SonyMonitor();
        SamsungHardrive harddrive1 = new SamsungHardrive();
        ToshibaHardrive harddrive2 = new ToshibaHardrive();
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();

        computer1.monitor = monitor1;
        computer1.hardrive = harddrive1;
        computer2.monitor = monitor2;
        computer2.hardrive = harddrive2;
    }
}
