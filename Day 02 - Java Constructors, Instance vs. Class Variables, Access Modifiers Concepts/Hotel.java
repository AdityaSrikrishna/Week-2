class Hotel{
    private String guestName;
    private String RoomType;
    private int nights;
    public Hotel(){
        guestName = "Owner";
        RoomType = "AC";
        nights = 2;
    }
    public Hotel(String guestName, String RoomType, int nights){
        this.guestName = guestName;
        this.RoomType = RoomType;
        this.nights = nights;
    }
    public Hotel(Hotel hotel){
        this.guestName = hotel.guestName;
        this.RoomType = hotel.RoomType;
        this.nights = hotel.nights;
    }
    public void displaydetails(){
        System.out.println("Guest Name is: " + guestName);
        System.out.println("Room Type is: " + RoomType);
        System.out.println("Number of nights is: " + nights);
    }
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel();
        Hotel hotel2 = new Hotel("Aditya", "AC", 3);
        Hotel hotel3 = new Hotel(hotel2);
        hotel1.displaydetails();
        hotel2.displaydetails();
        hotel3.displaydetails();
    }
}