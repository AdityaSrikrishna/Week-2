class Employee{
    String name;
    int id;
    double salary;
    Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displaydetails(){
        System.out.println("Name: " + name + " ID: " + id + " Salary: " + salary);
    }
    public static void main(String[] args) {
        Employee employee = new Employee("Aditya", 1211, 20000);
        employee.displaydetails();
    }
}