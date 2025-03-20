package lt.techin;

public class MainDemo {

    public MainDemo() {
        System.out.println("I am constructor!..");
    }

    public static void main(String[] args) {

        System.out.println("I am main...");

        MainDemo mainDemo = new MainDemo();

        int number = 5;
//        number += 3;
//        number -= 4;
//        number *= 6;
//        number /= 2;
        number %= 7;

        System.out.println(number);
    }
}
