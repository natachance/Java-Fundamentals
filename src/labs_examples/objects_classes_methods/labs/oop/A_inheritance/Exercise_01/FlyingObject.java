package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01;

public class FlyingObject {

    public void takeOff(){
        System.out.println("Flying object taking off from runway");
    }
    public void land(){
        System.out.println("Flying object landing on runway");
    }
}

class Plane extends FlyingObject{

}

class HotAirBalloon extends FlyingObject{
    @Override
    public void land() {
        System.out.println("Hot air balloon landing");
    }
    @Override
    public void takeOff(){
        System.out.println("Hot air balloon lifting off ground");
    }
}

class FlightController{
    public static void main(String[] args) {
        FlyingObject plane = new Plane();
        FlyingObject balloon = new HotAirBalloon();

        plane.takeOff();
        plane.land();
        balloon.takeOff();
        balloon.land();
    }
}