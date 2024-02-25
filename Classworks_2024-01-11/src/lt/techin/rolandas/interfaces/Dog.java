package lt.techin.rolandas.interfaces;

public class Dog extends Animal implements CanMakeSound {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void canMove() {
        System.out.println("Dog is running...");
    }

    @Override
    public void canMakeSound() {

    }
}
