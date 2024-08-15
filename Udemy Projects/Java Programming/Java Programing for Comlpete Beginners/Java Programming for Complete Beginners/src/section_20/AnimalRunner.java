package section_20;

interface Bark {
    void bark();
}

class Cat implements Bark {

    @Override
    public void bark() {
        System.out.println("Miau miau...");
    }
}

class Dog implements Bark {

    @Override
    public void bark() {
        System.out.println("Auu auu...");
    }
}

public class AnimalRunner {

    public static void main(String[] args) {
        Bark[] animals = {new Cat(), new Dog()};
        for (Bark object : animals) {
            object.bark();
        }

    }
}
