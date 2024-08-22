package section_25;

import java.util.List;

public class Dog {
    String name;
    String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }
    public String toString() {
        return name + " " + says;
    }

    public static void main(String[] args) {
        Dog dogOne = new Dog("Amsius", "Au");
        Dog dogTwo = new Dog("Damsius", "Au-Au");

        System.out.println(dogOne);
        System.out.println(dogTwo);
        System.out.println("___   ***   ___");

        List<Dog> listOfDogs = List.of(dogOne, dogTwo);

        listOfDogs.stream().forEach(element -> System.out.println(element));
        System.out.println("***   ___   ***");
    }
}
