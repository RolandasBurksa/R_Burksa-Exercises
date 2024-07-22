package chapter04;

public class DogTestRunner {

    public static void main(String[] args) {
        Dog one = new Dog();
        one.setSize(70);
        Dog two = new Dog();
        two.setSize(8);
        System.out.println("Dog one: " + one.getSize() + ".");
        System.out.println("Dog two: " + two.getSize() + ".");
        one.bark();
        two.bark();
    }
}
