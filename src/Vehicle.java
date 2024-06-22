public abstract class Vehicle {
    public String make, model;
    public int year;
    public Vehicle (String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public double calculateFuelEfficiency(double milesDriven, double fuelConsumed){
        return milesDriven/fuelConsumed;
    }
}
