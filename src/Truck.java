public abstract class Truck extends Vehicle {
    private double milesDriven, fuelConsumed, cargoWeight;
    public Truck (String make, String model, int year, double milesDriven, double fuelConsumed, double cargoWeight) {
        super (make, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
        this.cargoWeight = cargoWeight;
    }
    public double calculateFuelEfficiency(double milesDriven, double fuelConsumed){
        return milesDriven/(fuelConsumed + (cargoWeight * 0.5));
    }
}
