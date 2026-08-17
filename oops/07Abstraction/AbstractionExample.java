abstract class Vehicle {

    // abstract method (non-concrete method)
    abstract void start();

    //concrete method
    void stop() {
        System.out.println("Vehicle stopped");
    }
}
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with key.");
    }

}
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with self-start");
    }
}
class AbstractionExample {
    public static void main(String[] args) {

        Car c = new Car();
        c.start();
        c.stop();

        Bike b = new Bike();
        b.start();
        b.stop();

        //can't create object of anstract method 
        //Vehicle v = new Vehicle()  

        //Abstract Class + Runtime Polymorphism
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v1.stop();

        v2.start();
        v2.stop();

    }
}