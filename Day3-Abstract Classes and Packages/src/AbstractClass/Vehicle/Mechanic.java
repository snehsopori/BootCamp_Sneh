package AbstractClass.Vehicle;
import org.junit.Test;

abstract class Vehicle {
    int vin;
    int speed;
    String name;

    Vehicle() {
    }

    Vehicle(int vin, int speed, String name) {
        this.vin = vin;
        this.speed = speed;
        this.name = name;
    }

    void details() {
        System.out.println("VIN: " + vin);
        System.out.println("Speed: " + speed);
        System.out.println("Name: " + name);
    }

    abstract void drive();

    abstract void inspect();
}

class Bike extends Vehicle {

    Bike() {
    }

    Bike(int id, int speed, String name) {
        super(id, speed, name);
    }

    void drive() {
        System.out.println("Driving the Bike");
    }

    void inspect() {
        System.out.println("Inspecting the Bike");
    }
}

class Car extends Vehicle {

    Car() {
    }

    Car(int id, int speed, String name) {
        super(id, speed, name);
    }

    void drive() {
        System.out.println("Driving the Car");
    }

    void inspect() {
        System.out.println("Inspecting the Car");
    }
}

public class Mechanic {

    @Test
    public void testCar() {
        Car car = new Car(25, 90, "Audi");
        car.details();
        car.drive();
        car.inspect();
    }

    @Test
    public void testBike() {
        Bike bike = new Bike(30, 110, "BMW");
        bike.details();
        bike.drive();
        bike.inspect();
    }
}