class Book{
    String title;
    String author;
    double price;
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void details(){
        System.out.println("Book Details:");
        System.out.println("--------------------");
        System.out.println("Name of the book: " + title);
        System.out.println("Author of the book: " + author);
        System.out.println("Price of the book: " + price);
        System.out.println("--------------------");
    } 
    public static void main(String[] args) {
        Book book = new Book("Sherlock Holmes", "Sir Arthur Conan Doyle", 250);
        book.details();
    }
}