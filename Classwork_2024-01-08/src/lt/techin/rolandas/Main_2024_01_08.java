package lt.techin.rolandas;

public class Main_2024_01_08 {

    public static void main(String[] args) {

        System.out.println(Math.abs(100));

        Person person = new Person();
        String personData = person.getPersonData();
        System.out.println(personData);
        System.out.println(person.getPersonData("BMW"));
        String carModel = "Toyota";
        System.out.println(person.getPersonData(carModel));
        hello("Jonas");
        hello("Jonas", 34);

    }

    public static void hello() {
        System.out.println("Hello!");
    }

    public static void hello(String name) {
        System.out.println("Hello " + name);
    }

    public static void hello(String name, int age) {
        System.out.println("Hello " + name + " " + age);
    }

    public static int adder(int number1, int number2) {
        return number1 + number2;
    }

    public static String adder(String text1, String text2) {
        return text1 + text2;
    }

    public static double adder(double number1, double number2) {
        return number1 + number2;
    }

}
