package Inheritance.Automobile;

import org.junit.Test;

public class TestInheritance {
    public String testPolymorphism(Automobile automobile) {
        return automobile.display();
    }

    @Test
    public void testAuto() {
        Car car = new Car("XYZ9876", "Black", 4, 6, 50,true, "Sedan", 200, 5);
        Bus bus = new Bus("ABCD1234", "Red", 4, 4,40, false, "School Bus", 50);
        SportsCar sc = new SportsCar("LMN4567", "Yellow", 8, 8,250,true, "F1", 500, 100, "Renault");
        System.out.println(testPolymorphism(car));
        System.out.println(testPolymorphism(bus));
        System.out.println(testPolymorphism(sc));
    }
}
