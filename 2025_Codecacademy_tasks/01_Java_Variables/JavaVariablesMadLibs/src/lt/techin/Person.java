package lt.techin;

public class Person {

    // state of an object
    int age;
    String name;

    // behavior of an object
    public void set_value() {
        age = 20;
        name = "Robin";
    }
    public void get_value() {
        System.out.println("Age is " + age);
        System.out.println("Name is " + name);
    }

    // main method
    public static void main(String [] args) {
        // creates a new Person object
        Person p = new Person();

        // changes state through behavior
        p.set_value();

        // print the updated values
        p.get_value();

        p.age = 33;
        p.name = "Bob";

        p.get_value();

    }
}
