package labs_examples.objects_classes_methods.labs.objects;

public class ObjectAssociationLab {
    public static void main(String[] args) {

        Home myHome = new Home("house");
        Person myPerson = new Person("Ian");
        System.out.println(myPerson.personName + " lives in a " + myHome.homeType + ".");
    }
}

class Home {
    String homeType;

    public Home (String homeType){
        this.homeType = homeType;
    }
}

class Person {
    String personName;

    public Person (String personName){
        this.personName = personName;
    }
}