package section_20;

public class StudentRunner {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Vardenis");
        student.setEmail("vardenis@gmail.com");

        Person person = new Person();
        String value = person.toString();
        System.out.println(value);
        System.out.println(person);
    }
}
