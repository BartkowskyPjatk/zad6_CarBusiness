public abstract class Vehicle {
    private String make, model;
    private int year;
    public Vehicle (String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public abstract double calculateFuelEfficiency(double milesDriven, double fuelConsumed);
}
