class Person{
    private int height;
    private int weight;
    public Person(){
        height = 150;
        weight = 75;
    }
    public Person(int height, int weight){
        this.height = height;
        this.weight = weight;
    }
    public Person(Person person){
        this.height = person.height;
        this.weight = person.weight;
    }
    public void displaydetails(){
        System.out.println("Height is: " + height);
        System.out.println("Weight is: " + weight);
    }
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person(180, 90);
        Person person3 = new Person(person2);
        person1.displaydetails();
        person2.displaydetails();
    }
}