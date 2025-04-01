class CarRental{
    private String customerName;
    private String carModel;
    private int rentalDays;
    public CarRental(){
        customerName = "Test";
        carModel = "Suzuki";
        rentalDays = 1;
    }
    public CarRental(String customerName, String carModel, int rentalDays){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    public CarRental(CarRental car){
        this.customerName = car.customerName;
        this.carModel = car.carModel;
        this.rentalDays = car.rentalDays;
    }
    public void displaydetails(){
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
    }
    public static void main(String[] args) {
        CarRental car1 = new CarRental("Aditya", "Toyota", 2);
        CarRental car2 = new CarRental();
        car1.displaydetails();
        car2.displaydetails();
    }
}