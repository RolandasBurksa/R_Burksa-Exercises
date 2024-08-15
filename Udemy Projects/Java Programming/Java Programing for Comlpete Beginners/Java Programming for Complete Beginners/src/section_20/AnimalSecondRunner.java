package section_20;

abstract class AnimalSecond {
    abstract void bark();
}

class DogSecond extends AnimalSecond {

    @Override
    void bark() {
        System.out.println("Auu auu...");
    }
}

class CatSecond extends AnimalSecond {

    @Override
    void bark() {
        System.out.println("Miau miau...");
    }
}

public class AnimalSecondRunner {

    public static void main(String[] args) {
        AnimalSecond[] animalSecond = {new DogSecond(), new CatSecond()};
        for (AnimalSecond object : animalSecond) {
            object.bark();
        }
    }
}
