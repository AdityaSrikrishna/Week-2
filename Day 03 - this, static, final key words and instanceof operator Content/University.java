class University{
    private static String university = "Global University";
    private static int totalStudents = 0;

    private String studentName;
    private final int rollNo;
    private String grade;
    public University(String studentName, int rollNo, String grade){
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.grade = grade;
        totalStudents++;
    }
    public static void gettotalStudents(){
        System.out.println("Total Students are: " + totalStudents);
    }
    public void displayDetails(){
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Roll No: " + rollNo);
        System.out.println("Student Grade: " + grade);
        System.out.println("------------------------");
    }
    public static void main(String[] args) {
        System.out.println("University Name: " + university);
        System.out.println();
        University student1 = new University("Aditya", 1211, "O");
        student1.displayDetails();
        University.gettotalStudents();
    }
}