package lt.techin.oop;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public Animal() {

    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", numberOfPaws=" + numberOfPaws +
                ", hasFur=" + hasFur +
                '}';
    }

    public String getDescription() {
        String pawWord = ( numberOfPaws == 1) ? "paw" : "paws";
        String furStatus = hasFur ? "a" : "no";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawWord + " and " + furStatus + " fur.";

    }
    public static void main(String[] args) {
        Bird bird = new Bird();
        Dog dog = new Dog();
        System.out.println(bird.getDescription());
        System.out.println(dog.getDescription());
    }

}


