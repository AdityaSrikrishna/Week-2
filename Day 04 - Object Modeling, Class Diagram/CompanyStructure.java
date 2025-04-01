import java.util.ArrayList;
import java.util.List;

public class CompanyStructure{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Aditya", 1211);
        Employee emp2 = new Employee("Alice", 1212);

        Department tech = new Department("Technical");
        Department nontech = new Department("Non Technical");

        Company tcs = new Company("TCS");
        Company capgemini = new Company("Capgemini");

        tech.addEmployee(emp1);
        nontech.addEmployee(emp2);

        tcs.addDepartment(nontech);
        capgemini.addDepartment(tech);

        tech.showDept();
        nontech.showDept();

        tcs.showDetails();
        capgemini.showDetails();
    }
}
class Employee{
    private String name;
    private int id;
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getname(){
        return name;
    }
    public int getid(){
        return id;
    }
}
class Department{
    private String name;
    private List<Employee> employees;
    public Department(String name){
        this.name = name;
        this.employees = new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public String getname(){
        return name;
    }
    public void showDept(){
        System.out.println("Department Name: " + name);
        System.out.println("------------------");
        for(Employee employee : employees){
            System.out.println("Name of Employee: " + employee.getname() + " \nID of employee: " + employee.getid());
        }
        System.out.println();
    }
}
class Company{
    private String name;
    private List<Department> departments;
    public Company(String name){
        this.name = name;
        this.departments = new ArrayList<>();
    }
    public void addDepartment(Department department){
        departments.add(department);
    }
    public void showDetails(){
        System.out.println("Company Name: " + name);
        System.out.println("-------------------");
        for(Department department : departments){
            System.out.println("Department name is: " + department.getname());
        }
    }
}