class Anim{
    public static void main(String[] args) {
        Animal a = new Animal("Timmy", 3);
        Dog dog = new Dog("Tommy", 5);
        Cat cat = new Cat("Whiskers", 4);
        Bird bird = new Bird("Tweety", 4);
        a.voice();
        dog.voice();
        cat.voice();
        bird.voice();
    }
}
class Animal{
    protected String name;
    protected int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void voice(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    public Dog(String name, int age){
        super(name, age);
    }
    @Override
    public void voice(){
        System.out.println(name + ": says Woof!");
    }
}

class Cat extends Animal{
    public Cat(String name, int age){
        super(name, age);
    }
    @Override
    public void voice(){
        System.out.println(name + ": says Meow!");
    }
}

class Bird extends Animal{
    public Bird(String name, int age){
        super(name, age);
    }
    @Override
    public void voice(){
        System.out.println(name + ": say Tweet!");
    }
}