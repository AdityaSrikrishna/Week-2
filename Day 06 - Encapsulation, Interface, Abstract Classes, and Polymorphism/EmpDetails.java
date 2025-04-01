import java.util.ArrayList;
import java.util.List;

interface Department{
    void assignDepartment(String department);
    String getdepdetails();
}
abstract class Employee implements Department{
    private int empid;
    private String name;
    private double sal;
    private String department;
    public Employee(int empid, String name, double sal){
        this.empid = empid;
        this.name = name;
        this.sal = sal;
    }
    public int getid(){
        return empid;
    }
    public void setid(int empid){
        this.empid = empid;
    }
    public String getName(){ 
        return name; 
    }
    public void setName(String name){ 
        this.name = name; 
    }
    public double getsal(){
        return sal;
    }
    public void setsal(double sal){
        this.sal = sal;
    }
    public void assignDepartment(String department){
        this.department = department;
    }
    public String getdepdetails(){
        return department;
    }
    public abstract double calculatesal();
    public void displayDetails() {
        System.out.println("ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: $" + sal);
        System.out.println("Department: " + department);
        System.out.println("Final Salary: $" + calculatesal());
        System.out.println("------------------------------");
    }
}
public class EmpDetails{
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        FullTimeEmployee fte1 = new FullTimeEmployee(101, "Alice", 5000);
        fte1.assignDepartment("HR");

        PartTimeEmployee pte1 = new PartTimeEmployee(102, "Bob", 20, 80);
        pte1.assignDepartment("Support");

        employees.add(fte1);
        employees.add(pte1);

        for(Employee emp : employees){
            emp.displayDetails();
        }
    }
}
class FullTimeEmployee extends Employee{
    public FullTimeEmployee(int empid, String name, double sal){
        super(empid, name, sal);
    }
    @Override
    public double calculatesal(){
        return getsal();
    }
}
class PartTimeEmployee extends Employee{
    private int worktime;
    private double hourlyrate;
    public PartTimeEmployee(int empid, String name, int worktime, double hourlyrate){
        super(empid, name, 0);
        this.worktime = worktime;
        this.hourlyrate = hourlyrate;
    }
    public double calculatesal(){
        return worktime*hourlyrate;
    }
}