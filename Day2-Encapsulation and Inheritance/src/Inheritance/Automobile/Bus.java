package Inheritance.Automobile;

public class Bus extends Automobile {
    private String busType;
    private int loadCarryingCapacity;

    public Bus() {
    }

    public Bus(String licensePlate, String color, int numberOfWheels, int noOfShifts, int speed, boolean statusOfEngine, String busType, int loadCarryingCapacity) {
        super(licensePlate, color, numberOfWheels, noOfShifts, speed, statusOfEngine);
        this.busType = busType;
        this.loadCarryingCapacity = loadCarryingCapacity;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public int getLoadCarryingCapacity() {
        return loadCarryingCapacity;
    }

    public void setLoadCarryingCapacity(int loadCarryingCapacity) {
        this.loadCarryingCapacity = loadCarryingCapacity;
    }

    @Override
    public String display() {
        return super.display() + " busType='" + busType + '\'' +
                ", loadCarryingCapacity=" + loadCarryingCapacity;
    }
}
