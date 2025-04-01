

class Library{
    public static String libraryName = "Central State Library";
    
    private String Name;
    private String Author;
    private final String ISBN;

    public Library(String Name, String Author, String ISBN){
        this.Name = Name;
        this.Author = Author;
        this.ISBN = ISBN;
    }
    public static void getLibrary(){
        System.out.println(libraryName);
    }
    public void displayDetails(){
        System.out.println("Name of Book: " + Name);
        System.out.println("Name of Author: " + Author);
        System.out.println("ISBN Number: " + ISBN);
        System.out.println("-------------------");
    }
    public static void main(String[] args) {
        Library.getLibrary();
        System.out.println();
        Library book1 = new Library("Sherlock Holmes", "Sir Arthur Conan Doyle", "ISBN12345");
        Library book2 = new Library("Treasure Island", "R.L.Stevenson", "ISBN12346");
        book1.displayDetails();
        book2.displayDetails();
    }
}