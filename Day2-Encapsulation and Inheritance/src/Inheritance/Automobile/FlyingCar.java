package Inheritance.Automobile;

public class FlyingCar extends Car {
    private double altitude;
    private int noOfPropellers;
    private String mode;

    public FlyingCar() {
    }

    public FlyingCar(String licensePlate, String color, int numberOfWheels, int noOfShifts, int speed, boolean statusOfEngine, String carType, int topSpeed, int acceleration, double altitude, int noOfPropellers, String mode) {
        super(licensePlate, color, numberOfWheels, noOfShifts, speed, statusOfEngine, carType, topSpeed, acceleration);
        this.altitude = altitude;
        this.noOfPropellers = noOfPropellers;
        this.mode = mode;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public int getNoOfPropellers() {
        return noOfPropellers;
    }

    public void setNoOfPropellers(int noOfPropellers) {
        this.noOfPropellers = noOfPropellers;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void increaseAltitude() {
        this.altitude += 2.5;
    }

    public void decreaseAltitude() {
        this.altitude -= 2.5;
    }

    @Override
    public String display() {
        return super.display() + " altitude=" + altitude +
                ", noOfPropellers=" + noOfPropellers +
                ", mode='" + mode;
    }
}
