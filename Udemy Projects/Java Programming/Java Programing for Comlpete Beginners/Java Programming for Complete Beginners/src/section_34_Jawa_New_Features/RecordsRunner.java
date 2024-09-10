package section_34_Jawa_New_Features;

public class RecordsRunner {

    record Person(String name, String email, String phoneNumber) {}

    public static void main(String[] args) {
        Person person = new Person("Andrius", "andrius@gmail.com", "+370-700-12345");
        Person person1 = new Person("Andrius", "andrius@gmail.com", "+370-700-12345");
        Person person2 = new Person("Andrius2", "andrius@gmail.com", "+370-700-12345");
        System.out.println(person);
        System.out.println(person.equals(person1));
        System.out.println(person.equals(person2));
        System.out.println(person.name());
        System.out.println(person.email());
    }
}
