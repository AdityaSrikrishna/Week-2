public class Vehicles{
    public static void main(String[] args) {
        Vehicle v = new Vehicle(120, "Petrol");
        Car c = new Car(220, "Diesel", 4);
        Truck t = new Truck(150, "Diesel", 100);
        MotorBike m = new MotorBike(200, "Petrol", false);
        v.showDetails();
        c.showDetails();
        t.showDetails();
        m.showDetails();
    }    
}
class Vehicle{
    protected int maxSpeed;
    protected String fuelType;
    public Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    public void showDetails(){
        System.out.println("Max Speed is: " + maxSpeed + "km/hr");
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("----------------------");
    }
}
class Car extends Vehicle{
    protected int seatCapacity;
    public Car(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    public void showDetails(){
        System.out.println("Type: Car");
        super.showDetails();
        System.out.println("Seat Capacity: " + seatCapacity);
        System.out.println("----------------------");
    }
}
class Truck extends Vehicle{
    protected int loadCapacity;
    public Truck(int maxSpeed, String fuelType, int loadCapacity){
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }
    public void showDetails(){
        System.out.println("Type: Truck");
        super.showDetails();
        System.out.println("Load Capacity: " + loadCapacity);
        System.out.println("----------------------");
    }
}
class MotorBike extends Vehicle{
    protected boolean hasSideseat;
    public MotorBike(int maxSpeed, String fuelType, boolean hasSideseat){
        super(maxSpeed, fuelType);
        this.hasSideseat = hasSideseat;
    }
    public void showDetails(){
        System.out.println("Type: Motor Bike");
        super.showDetails();
        System.out.println("Has side seat: " + (hasSideseat ? "Yes" : "No"));
        System.out.println("----------------------");
    }
}