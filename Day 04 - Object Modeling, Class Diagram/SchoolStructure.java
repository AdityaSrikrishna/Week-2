import java.util.ArrayList;
import java.util.List;

public class SchoolStructure{
    public static void main(String[] args) {
        Student1 s1 = new Student1("Aditya");
        Student1 s2 = new Student1("Alice");

        School1 global = new School1("Global School");

        Course1 python = new Course1("Python programming");
        Course1 c = new Course1("C Training");

        global.addStudent(s1);
        global.addStudent(s2);

        s1.addCourse(python);
        s1.addCourse(c);

        s2.addCourse(c);

        python.addStudent(s1);
        python.addStudent(s2);

        c.addStudent(s1);

        s1.showDetails();
        s2.showDetails();

        global.showDetails();

        python.showDetails();
        c.showDetails();
    }
}
class School1{
    private String name;
    private List<Student1> students;
    int total = 0;

    public School1(String name){
        this.name = name;
        this.students = new ArrayList<>();
        total++;
    }
    public String getName(){
        return name;
    }
    public void addStudent(Student1 student){
        students.add(student);
    }
    public void showDetails(){
        System.out.println("School Name: " + name);
        System.out.println("-------------------");
        System.out.println("Students Joined:");
        for(Student1 student : students){
            System.out.println("Student Name: " + student.getName());
        }
    }
    public int getTotal(){
        return total;
    }
}
class Student1{
    private String name;
    private List<Course1> courses;
    public Student1(String name){
        this.name = name;
        this.courses = new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void addCourse(Course1 course){
        courses.add(course);
    }
    public void showDetails(){
        System.out.println("Student Name: " + name);
        System.out.println("-----------------------");
        System.out.println("Courses Joined:");
        for(Course1 course : courses){
            System.out.println("Course Name:" + course.getName());
        }
    }
}
class Course1{
    private String name;
    private List<Student1> students;

    public Course1(String name){
        this.name = name;
        this.students = new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void addStudent(Student1 student){
        students.add(student);
    }
    public void showDetails(){
        System.out.println("Course Name: " + name);
        System.out.println("-------------------");
        System.out.println("Students Joined: ");
        for(Student1 student : students){
            System.out.println("Student Name: " + student.getName());
        }
    }
}
