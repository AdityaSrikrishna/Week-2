import java.util.ArrayList;
import java.util.List;
class Aggregation{
    public static void main(String[] args) {
        Book book1 = new Book("Sherlock Holmes", "Sir Arthur Conan Doyle");
        Book book2 = new Book("Oliver Twist", "Mark Twain");
        Book book3 = new Book("Journey to the centre of the earth", "R.L.Stevenson");

        Library Central = new Library("Central");
        Library Community = new Library("Community");

        Central.addBook(book1);
        Central.addBook(book2);

        Community.addBook(book2);
        Community.addBook(book3);

        Central.showbooks();
        Community.showbooks();
    }
}
class Book{
    private String name;
    private String author;
    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }
    public String getname(){
        return name;
    }
    public String getauthor(){
        return author;
    }
    public void setname(String newname){
        name = newname;
    }
    public String toString(){
        return "\"" + name + "\" by " + author;
    }
}
class Library{
    private String name;
    private List<Book> books;
    public Library(String name){
        this.name = name;
        this.books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void showbooks(){
        System.out.println("Library: " + name);
        if(books.isEmpty()){
            System.out.println("No books in the library");
        }
        else{
            for(Book b: books){
                System.out.println("-" + b);
            }
        }
        System.out.println();
    }
}