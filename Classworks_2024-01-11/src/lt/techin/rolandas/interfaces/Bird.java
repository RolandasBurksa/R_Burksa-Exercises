package lt.techin.rolandas.interfaces;

public class Bird extends  Animal implements CanMakeSound{
    @Override
    public void canMakeSound() {

    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public void canMove() {
        System.out.println("Bird can fly");
    }
}
