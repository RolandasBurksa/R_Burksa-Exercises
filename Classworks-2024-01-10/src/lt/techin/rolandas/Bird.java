package lt.techin.rolandas;

public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);

    }
    @Override
    public void makeSound() {
        System.out.println("Bird make sound...");
    }
}