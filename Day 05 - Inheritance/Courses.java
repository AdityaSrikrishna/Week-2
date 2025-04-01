

public class Courses{
    public static void main(String[] args) {
        PaidOnlineCourse paid = new PaidOnlineCourse("Advanced Java", 40, "Udemy", true, 10, 5);
        paid.showDetails();
    }
}
class Course{
    protected String coursename;
    protected int duration;
    public Course(String coursename, int duration){
        this.coursename = coursename;
        this.duration = duration;
    }
    public void showDetails(){
        System.out.println("Course Name: " + coursename);
        System.out.println("Duration: " + duration);
    }
}
class OnlineCourse extends Course{
    protected String platform;
    protected boolean isRecorded;
    public OnlineCourse(String coursename, int duration, String platform, boolean isRecorded){
        super(coursename, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    public void showDetails(){
        super.showDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorder: " + (isRecorded ? "Yes" : "No"));
    }
}
class PaidOnlineCourse extends OnlineCourse{
    protected double fee;
    protected double discount;
    public PaidOnlineCourse(String coursename, int duration, String platform, boolean isRecorded, double fee, double discount){
        super(coursename, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    public double totalAmount(){
        return (fee - (fee*discount)/100);
    }
    public void showDetails(){
        super.showDetails();
        System.out.println("Course fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final fee after discount $" + totalAmount());
    }
}