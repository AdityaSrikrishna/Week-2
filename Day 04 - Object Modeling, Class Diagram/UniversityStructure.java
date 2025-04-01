import java.util.ArrayList;
import java.util.List;

public class UniversityStructure{
    public static void main(String[] args) {
        Faculty a = new Faculty("Aditya");
        Faculty b = new Faculty("Alice");

        University global = new University("Global University");

        global.addFaculty(a);
        global.addFaculty(b);

        global.addDepartment("Computer Science");
        global.addDepartment("Artificial Intelligence");

        global.showInfo();
        System.out.println();
        global.deleteUniversity();
        System.out.println();
        System.out.println("Faculties still exist independently");
        System.out.println("Name: " + a.toString());
        System.out.println("Name: " + b.toString());
    }
}
class Faculty{
    private String name;
    public Faculty(String name){
        this.name = name;
    }
    public String toString(){
        return "Faculty: " + name;
    }
}
class DepartMent{
    private String name;
    public DepartMent(String name){
        this.name = name;
    }
    public String toString(){
        return "Department: " + name;
    }
    public void cleanup(){
        System.out.println("Department " + name + " has been cleaned");
    }
}
class University{
    private String name;
    private List<Faculty> faculties = new ArrayList<>();
    private List<DepartMent> departments = new ArrayList<>();
    
    public University(String name){
        this.name = name;
    }
    public void addDepartment(String department){
        departments.add(new DepartMent(department));
    }
    public void addFaculty(Faculty faculty){
        faculties.add(faculty);
    }
    public void showInfo(){
        System.out.println("University Name: " + name);
        System.out.println("---------------------");
        System.out.println("Departments:");
        for(DepartMent department : departments){
            System.out.println(department.toString());
        }
        System.out.println();
        System.out.println("Faculties:");
        for(Faculty faculty : faculties){
            System.out.println(faculty.toString());
        }
    }
    public void deleteUniversity(){
        System.out.println("Deleting " + name + " ......");
        for(DepartMent d : departments){
            d.cleanup();
        }
        departments.clear();
        faculties.clear();
        System.out.println("University and its departments deleted.");
    }
}