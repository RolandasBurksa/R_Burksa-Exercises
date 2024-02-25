package lt.techin.rolandas;

public class Dog extends Animal {

    String color;

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog make sound...");
    }
    public void ShowColor(){
        System.out.println(color);
    }

}
