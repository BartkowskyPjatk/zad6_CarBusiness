public class Car extends Vehicle{
        private double milesDriven, fuelConsumed;
        public Car (String make, String model, int year, double milesDriven, double fuelConsumed) {
            super (make, model, year);
            this.milesDriven = milesDriven;
            this.fuelConsumed = fuelConsumed;
        }
        public double calculateFuelEfficiency(double milesDriven, double fuelConsumed){
            return milesDriven/fuelConsumed;
        }
    }

