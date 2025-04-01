public class Devices{
    public static void main(String[] args) {
        Device dev = new Device(1211, "Working");
        Thermostat therm = new Thermostat(1211, "Working", 34.6);
        dev.displayInfo();
        System.out.println("-----------------");
        therm.displayInfo();

    }
}
class Device{
    protected int deviceID;
    protected String status;
    public Device(int deviceID, String status){
        this.deviceID = deviceID;
        this.status = status;
    }
    public void displayInfo(){
        System.out.println("Device ID: " + deviceID);
        System.out.println("Device Status: " + status);
    }
}
class Thermostat extends Device{
    protected double temperature;
    public Thermostat(int deviceID, String status, double temperature){
        super(deviceID, status);
        this.temperature = temperature;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Temperature is: " + temperature + "°C");
    }
}