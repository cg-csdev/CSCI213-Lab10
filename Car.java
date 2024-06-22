/**
 * Lab 10 Car class
 * @author Christian Garcia
 *
 */
public class Car extends Vehicle {
    
    private int doors;
    private int passengers;

    public Car(String make, String model, String plate, int doors, int passengers) {
        super(make, model, plate);
        this.doors = doors;
        this.passengers = passengers;
    }

    public int getDoors() {
        return this.doors;
    }

    public int getPassengers() {
        return this.passengers;
    }

    @Override
    public String toString() {
        return String.format("%d-door %s %s with license %s.", this.doors, this.getMake(), this.getModel(), this.getPlate());
    }

    @Override
    public boolean equals(Object other) {
        if (!super.equals(other)) {
            return false;
        }

        if (!(other instanceof Car)) {
            return false;
        }

        Car otherCar = (Car) other;

        return this.doors == otherCar.getDoors() && this.passengers == otherCar.getPassengers();
    }

    public Car copy() {
        return new Car(this.getMake(), this.getModel(), this.getPlate(), this.doors, this.passengers);
    }
}
