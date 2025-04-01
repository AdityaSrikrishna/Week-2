public class Restautrant{
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon Ramsay", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Alice Johnson", 202, 5);

        System.out.println("--- Chef Info ---");
        chef.performDuties();
        System.out.println();

        System.out.println("--- Waiter Info ---");
        waiter.performDuties();

    }
}
class Person{
    protected String name;
    protected int id;
    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void showDetails(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
interface Worker{
    void performDuties();
}

class Chef extends Person implements Worker{
    protected String specialty;
    public Chef(String name, int id, String specialty){
        super(name, id);
        this.specialty = specialty;
    }
    @Override
    public void performDuties() {
        System.out.println("Chef Duties:");
        super.showDetails();
        System.out.println("Specialty: " + specialty);
        System.out.println("Cooking delicious meals...");
    }
}
class Waiter extends Person implements Worker{
    protected int tabassn;
    public Waiter(String name, int id, int tabassn){
        super(name, id);
        this.tabassn = tabassn;
    }
    @Override
    public void performDuties() {
        System.out.println("Waiter Duties:");
        super.showDetails();
        System.out.println("Tables Assigned: " + tabassn);
        System.out.println("Serving food and attending to customers...");
    }
}