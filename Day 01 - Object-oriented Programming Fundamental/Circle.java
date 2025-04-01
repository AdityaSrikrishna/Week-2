class Circle{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double Area(){
        return (Math.PI)*Math.pow(radius, 2);
    }
    public double circum(){
        return 2*Math.PI*radius;
    }
    void display(){
        System.out.println("Radius: " + radius + " Area: " + Area() + " Circumference: " + circum());
    }
    public static void main(String[] Args){
        Circle circle = new Circle(7.5);
        circle.display();
    }
}