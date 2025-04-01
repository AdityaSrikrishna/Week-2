import java.util.ArrayList;
import java.util.List;

interface Insurable{
    double calculateInsurance();
    String getInsurancedetails();
}
abstract class Vehicle{
    private String vehiclenum;
    private String type;
    private double rentalrate;
    public Vehicle(String vehiclenum, String type, double rentalrate){
        this.vehiclenum = vehiclenum;
        this.type = type;
        this.rentalrate = rentalrate;
    }
    public String getnum(){
        return vehiclenum;
    }
    public String gettype(){
        return type;
    }
    public double getrentalrate(){
        return rentalrate;
    }
    public abstract double calculaterentalcost(int days);
    
}
class Car extends Vehicle implements Insurable{
    private String policyNumber;
    public Car(String vehiclenum, double rentalrate, String policyNumber){
        super(vehiclenum, "Car", rentalrate);
        this.policyNumber = policyNumber;
    }
    public double calculaterentalcost(int days){
        return getrentalrate()*days;
    }
    public double calculateInsurance(){
        return 0.05*getrentalrate();
    }
    public String getInsurancedetails() {
        return "Car Insurance Policy: ****" + policyNumber.substring(policyNumber.length() - 4);
    }
}
class Bike extends Vehicle implements Insurable {
    private String policyNumber;

    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculaterentalcost(int days) {
        return getrentalrate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 0.02 * getrentalrate();
    }

    @Override
    public String getInsurancedetails() {
        return "Bike Insurance Policy: ****" + policyNumber.substring(policyNumber.length() - 4);
    }
}
class Truck extends Vehicle implements Insurable {
    private String policyNumber;

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculaterentalcost(int days) {
        return getrentalrate() * days + 500; // base + surcharge
    }

    @Override
    public double calculateInsurance() {
        return 0.1 * getrentalrate(); // 10% of rentalRate
    }

    @Override
    public String getInsurancedetails() {
        return "Truck Insurance Policy: ****" + policyNumber.substring(policyNumber.length() - 4);
    }
}
public class VehicleDetails{
    public static void main(String[] args) {
        List<Vehicle> vehicle = new ArrayList<>();
        vehicle.add(new Car("CAR123", 1000, "CARPOL123456"));
        vehicle.add(new Bike("BIKE456", 300, "BIKEPOL654321"));
        vehicle.add(new Truck("TRUCK789", 2000, "TRUCKPOL987654"));

        int rentaldays = 5;
        for(Vehicle v : vehicle){
            System.out.println("Vehicle Type: " + v.gettype());
            System.out.println("Vehicle Number: " + v.getnum());
            System.out.println("Rental rate for " + rentaldays + " days is: " + v.calculaterentalcost(rentaldays));
            if(v instanceof Insurable){
                Insurable insurable = (Insurable) v;
                System.out.println("Insurance rate: Rs." + insurable.calculateInsurance());
                System.out.println(insurable.getInsurancedetails());
            }
            System.out.println("-----------------------------");
        }
    }
}