package lt.techin.rolandas.interfaces;

public abstract class Animal {
    private  String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void canMove();
    public abstract void canMakeSound();
}
