package Inheritance.Automobile;

public class SportsCar extends Car {
    private String make;

    public SportsCar() {
    }

    public SportsCar(String licensePlate, String color, int numberOfWheels, int noOfShifts, int speed, boolean statusOfEngine, String carType, int topSpeed, int acceleration, String make) {
        super(licensePlate, color, numberOfWheels, noOfShifts, speed, statusOfEngine, carType, topSpeed, acceleration);
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public void accelerate() {
        this.setSpeed(this.getSpeed() + 100);
    }

    @Override
    public void brake() {
        this.setSpeed(this.getSpeed() - 100);
    }

    @Override
    public String display() {
        return super.display() + " make=" + make;
    }
}
