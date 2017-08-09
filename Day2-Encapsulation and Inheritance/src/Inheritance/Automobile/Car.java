package Inheritance.Automobile;

public class Car extends Automobile {
    private String carType;
    private int topSpeed;
    private int acceleration;

    public Car() {
    }

    public Car(String licensePlate, String color, int numberOfWheels, int noOfShifts, int speed, boolean statusOfEngine, String carType, int topSpeed, int acceleration) {
        super(licensePlate, color, numberOfWheels, noOfShifts, speed, statusOfEngine);
        this.carType = carType;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    @Override
    public String display() {
        return super.display() + " carType='" + carType + '\'' +
                ", topSpeed=" + topSpeed +
                ", acceleration=" + acceleration;
    }
}
