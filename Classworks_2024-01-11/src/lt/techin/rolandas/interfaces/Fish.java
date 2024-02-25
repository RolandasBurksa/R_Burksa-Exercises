package lt.techin.rolandas.interfaces;

public class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void canMove() {
        System.out.println("Fish can swim");
    }

    @Override
    public void canMakeSound() {

    }
}
