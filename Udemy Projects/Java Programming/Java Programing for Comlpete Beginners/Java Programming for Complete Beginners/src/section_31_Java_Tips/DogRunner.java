package section_31_Java_Tips;

class Dog {
    int age;
    String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String bark(){
        return "AA";
    }

    public String howl() {
        return "BBB";
    }

    public String yelp() {
        return "CCCC";
    }
}
public class DogRunner {

    public static void main(String[] args) {
        Dog dogA = new Dog(12, "Amsius");
        Dog dogB = new Dog(10, "Bamsius");
        System.out.println(dogA.getName() + " " + dogA.getAge() + " " +  dogA.bark());
        System.out.println(dogA.howl());
        System.out.println(dogA.yelp());
        System.out.println(dogB.getName() + " " + dogB.getAge() + " " +  dogB.bark());

    }
}
