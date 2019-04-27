package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.ComputerStore;

public class Computer {
    Harddrive hardrive;
    Monitor monitor;
    public void deleteFile(){
        hardrive.deleteFile();
    }
}
