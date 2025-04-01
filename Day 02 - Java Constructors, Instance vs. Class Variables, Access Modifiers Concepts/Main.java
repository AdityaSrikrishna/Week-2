class Student{
    public final int rollno;
    protected String name;
    private float CGPA;
    public Student(int rollno, String name, float  CGPA){
        this.rollno = rollno;
        this.name = name;
        this.CGPA = CGPA;
    }
    public float getCGPA(){
        return CGPA;
    }
    public void setCGPA(float newCGPA){
        if(newCGPA >= 0.0 && newCGPA <=10.0){
            CGPA = newCGPA;
        }
        else{
            System.out.println("Invalid CGPA");
        }
    }
    public void displaydetails(){
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}
class PG extends Student{
    private String researchtopic;
    public PG(int rollno, String name, float CGPA, String researchtopic){
        super(rollno, name, CGPA);
        this.researchtopic = researchtopic;
    }
    public void displaydetails(){
        System.out.println("Name is: " + name);
        System.out.println("Research topic is: " + researchtopic);
    }
}
public class Main{
    public static void main(String[] args) {
        Student student = new Student(1211, "Aditya", 9.0f);
        student.displaydetails();
        System.out.println("CGPA: " + student.getCGPA());
        student.setCGPA(9.5f);
        student.displaydetails();
        PG PGstudent = new PG(1212, "Aditya", 9.5f, "Cyber Security");
        PGstudent.displaydetails();
    }
}