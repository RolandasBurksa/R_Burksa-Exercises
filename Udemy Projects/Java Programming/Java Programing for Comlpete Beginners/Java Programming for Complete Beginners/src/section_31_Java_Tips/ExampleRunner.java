package section_31_Java_Tips;

class Bird1 {
    private int i;
    private double d;


    public String toString() {
        return "Bird " + d + " / " + d + " Something";
    }
}

public class ExampleRunner {

    public static void main(String[] args) {
        Bird1 b1 = new Bird1();
        Bird1 b2 = new Bird1();
        System.out.println(b1 + " *** " + b2);
    }

}
