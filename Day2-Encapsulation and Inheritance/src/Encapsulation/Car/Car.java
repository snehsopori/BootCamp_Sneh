package Encapsulation.Car;

public class Car {
    private boolean statusOfEngine;
    private int speed;

    public Car() {
    }

    public Car(boolean statusOfEngine, int speed) {
        this.statusOfEngine = statusOfEngine;
        this.speed = speed;
    }

    public boolean isStatusOfEngine() {
        return statusOfEngine;
    }

    public void setStatusOfEngine(boolean statusOfEngine) {
        this.statusOfEngine = statusOfEngine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate() {
        if(this.statusOfEngine == true) {
            this.speed += 10;
        }
    }

    public void start() {
        this.statusOfEngine = true;
        this.speed = 0;
    }

    public void stop() {
        this.statusOfEngine = false;
        this.speed = 0;
    }

    public void brake() {
        this.speed -= 10;
    }
}
