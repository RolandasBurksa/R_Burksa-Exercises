package section_11;

public class BiNumberRunner {

    public static void main(String[] args) {

        BiNumber numbers = new BiNumber(2,3);

        System.out.println(numbers.add()); // 2+3
        System.out.println(numbers.multiply()); // 2*3

        numbers.doubleValue();

        System.out.println(numbers.getNumber1());  // 2*2
        System.out.println(numbers.getNumber2());  // 3*2
    }

}
