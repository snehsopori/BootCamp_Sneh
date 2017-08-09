package Encapsulation.Car;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Driver {
    Car car = null;

    @Before
    public void init() {
        car = new Car();
    }

    @After
    public void clean() {
        car = null;
    }

    @Test
    public void testStart() {
        car.start();
        assertEquals(0, car.getSpeed());
        assertEquals(true,car.isStatusOfEngine());
    }

    @Test
    public void testAccelerate() {
        car.start();
        int initialSpeed = car.getSpeed();
        car.accelerate();
        int finalSpeed = car.getSpeed();
        assertEquals(10,finalSpeed - initialSpeed);
    }

    @Test
    public void testBrake() {
        car.start();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        int initialSpeed = car.getSpeed();
        car.brake();
        int finalSpeed = car.getSpeed();
        assertEquals(10,initialSpeed - finalSpeed);
    }

    @Test
    public void testStop() {
        assertEquals(0,car.getSpeed());
        assertEquals(false, car.isStatusOfEngine());
    }
}
