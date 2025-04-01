public class EmpMan{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 30, 30000);
        Manager emp2 = new Manager("Joe", 35, 50000, 4);
        Developer emp3 = new Developer("Bob", 28, 30000, "Java");
        Intern emp4 = new Intern("Mark", 23, 12000, 3);

        emp1.showDetails();
        emp2.showDetails();
        emp3.showDetails();
        emp4.showDetails();
    }
}
class Employee{
    protected String name;
    protected int age;
    protected double salary;
    public Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public void showDetails(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: Rs." + salary);
        System.out.println("----------------");
    }
}

class Manager extends Employee{
    protected int teamSize;
    public Manager(String name, int age, double salary, int teamSize){
        super(name, age, salary);
        this.teamSize = teamSize;
    }
    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("Team Size: " + teamSize);
        System.out.println("----------------");
    }
}
class Developer extends Employee{
    protected String progLan;
    public Developer(String name, int age, double salary, String progLan){
        super(name, age, salary);
        this.progLan = progLan;
    }
    public void showDetails(){
        super.showDetails();
        System.out.println("Programming Language: " + progLan);
        System.out.println("----------------");
    }
}
class Intern extends Employee{
    protected int duration;
    public Intern(String name, int age, double salary, int duration){
        super(name, age, salary);
        this.duration = duration;
    }
    public void showDetails(){
        super.showDetails();
        System.out.println("Duration (in months): " + duration);
        System.out.println("----------------");
    }
}