public class Publication{
    public static void main(String[] args) {
        Book b = new Book("Sherlock Holmes", 1970);
        Author a = new Author("Sherlock Holmes", 1970, "Sir Arthur Conan Doyle", "He is a very good author");
        b.showDetails();
        System.out.println("----------------------");
        a.showDetails();
    }
}
class Book{
    protected String name;
    protected int pubYear;
    public Book(String name, int pubYear){
        this.name = name;
        this.pubYear = pubYear;
    }
    public void showDetails(){
        System.out.println("Name of book is: " + name);
        System.out.println("Publication Year: " + pubYear);
    }
}
class Author extends Book{
    protected String name1;
    protected String bio;
    public Author(String name, int pubYear, String name1, String bio){
        super(name, pubYear);
        this.name1 = name1;
        this.bio = bio;
    }
    public void showDetails(){
        super.showDetails();
        System.out.println("Author name is: " + name1);
        System.out.println("Bio of Author: " + bio);
    }
}