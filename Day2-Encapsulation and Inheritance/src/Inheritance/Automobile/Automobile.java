package Inheritance.Automobile;

public class Automobile {
    private String licensePlate;
    private String color;
    private int numberOfWheels;
    private int noOfShifts;
    private int speed;
    private boolean statusOfEngine;

    public Automobile() {
    }

    public Automobile(String licensePlate, String color, int numberOfWheels, int noOfShifts, int speed, boolean statusOfEngine) {
        this.licensePlate = licensePlate;
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.noOfShifts = noOfShifts;
        this.speed = speed;
        this.statusOfEngine = statusOfEngine;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNoOfShifts() {
        return noOfShifts;
    }

    public void setNoOfShifts(int noOfShifts) {
        this.noOfShifts = noOfShifts;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStatusOfEngine() {
        return statusOfEngine;
    }

    public void setStatusOfEngine(boolean statusOfEngine) {
        this.statusOfEngine = statusOfEngine;
    }

    public void startEngine() {
        this.statusOfEngine = true;
    }

    public void stopEngine() {
        this.statusOfEngine = false;
        this.speed = 0;
    }

    public void accelerate() {
        this.speed += 5;
    }

    public void brake() {
        this.speed -= 5;
    }

    public String display() {
        return "licensePlate='" + licensePlate + '\'' +
                ", color='" + color + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                ", noOfShifts=" + noOfShifts +
                ", speed=" + speed +
                ", statusOfEngine=" + statusOfEngine;
    }
}
