import java.util.ArrayList;
import java.util.List;

public class School{
    public static void main(String[] args) {
        Student student = new Student("Aditya");
        student.addSubject(new Subject("Physics", 90));
        student.addSubject(new Subject("Maths", 95));
        GradeCalculator calculator = new GradeCalculator();
        double average = calculator.calculateAverage(student);
        String grade = calculator.getGrade(average);
        System.out.println("Student Name: " + student.getname());
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}
class Subject{
    private String name;
    private int score;
    public Subject(String name, int score){
        this.name = name;
        this.score = score;
    }
    public void getname(){
        System.out.println("Name is: " + name);
    }
    public int getScore(){
        return score;
    }
}
class Student{
    private String name;
    private List<Subject> subjects;
    public Student(String name){
        this.name = name;
        this.subjects = new ArrayList<>();
    }
    public void addSubject(Subject subject){
        subjects.add(subject);
    }
    public String getname(){
        return name;
    }
    public List<Subject> getSubject(){
        return subjects;
    }
}
class GradeCalculator{
    public double calculateAverage(Student student){
        List<Subject> subjects = student.getSubject();
        if(subjects.isEmpty()) return 0.0;
        double total = 0;
        for(Subject subject : subjects){
            total += subject.getScore();
        }
        return total/subjects.size();
    }
    public String getGrade(double average){
        if(average>=90) return "A";
        else if (average>=80) return "B";
        else if(average>=70) return "C";
        else if(average>=60) return "D";
        else return "fail";
    }
}
