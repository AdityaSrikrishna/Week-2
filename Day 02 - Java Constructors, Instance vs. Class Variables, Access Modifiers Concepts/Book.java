public class Book{
    private String name;
    private String author;
    private double price;
    public Book(){
        name = "Newspaper";
        author = "Times Of India";
        price = 15;
    }
    public Book(String name, String author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    void displaydetails(){
        System.out.println("Name of Book: " + name);
        System.out.println("Author of Book: " + author);
        System.out.println("Price of Book: " + price);
    }
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Sherlock Homes", "Sir Arthur Conan Doyle", 250);
        book1.displaydetails();
        book2.displaydetails();
    }
}