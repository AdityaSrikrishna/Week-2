class Circle{
    private double radius;
    public Circle(){
        radius = 1;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    void displaydetails(){
        System.out.println("Radius is: " + radius);
    }
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(25);
        circle1.displaydetails();
        circle2.displaydetails();
    }
}