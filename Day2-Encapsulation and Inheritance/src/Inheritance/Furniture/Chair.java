package Inheritance.Furniture;

public class Chair extends Furniture {
    Chair() {
        this.material = "Wood";
        this.id = 100;
    }

    @Override
    public String toString() {
        return "Chair " + super.toString();
    }
}
