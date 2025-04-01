interface Reservable{
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
abstract class LibraryItem{
    protected String itemID;
    protected String title;
    protected String author;
    public LibraryItem(String itemID, String title, String author){
        this.itemID = itemID;
        this.title = title;
        this.author = author;
    }
    public abstract int getLoanDuration();
    public String getItemDetails() {
        return "ID: " + itemID + ", Title: " + title + ", Author: " + author;
    }
}
class Book extends LibraryItem implements Reservable{
    private boolean isavailable = true;
    protected String borrowerName;
    public Book(String itemID, String title, String author){
        super(itemID, title, author);
    }
    public int getLoanDuration(){
        return 21;
    }
    public void reserveItem(String borrowerName){
        if(isavailable){
            this.borrowerName = borrowerName;
            isavailable = false;
            System.out.println("This book was borrowed by " + borrowerName);
        }
        else{
            System.out.println("This book was already borrowed.");
        }
    }
    public boolean checkAvailability(){
        return isavailable;
    }
}
class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrowerName;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            this.borrowerName = borrowerName;
            isAvailable = false;
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine is currently not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// DVD class
class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrowerName;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 2 weeks
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            this.borrowerName = borrowerName;
            isAvailable = false;
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD is currently not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
public class LibraryDetails {
    public static void main(String[] args) {
        LibraryItem book = new Book("B001", "The Alchemist", "Paulo Coelho");
        LibraryItem magazine = new Magazine("M001", "National Geographic", "Various");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        LibraryItem[] items = {book, magazine, dvd};
        for(LibraryItem i : items){
            System.out.println("Item Details: " + i.getItemDetails() + "Loan Duration: " + i.getLoanDuration() + " days");
        }
        Reservable reservableBook = (Reservable) book;
        reservableBook.reserveItem("Alice");

        Reservable reservableDvd = (Reservable) dvd;
        reservableDvd.reserveItem("Bob");
    }
}