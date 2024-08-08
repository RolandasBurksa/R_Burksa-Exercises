package section_19;

public class ArrayMagicRunner {

    public static void main(String[] args) {
        ArrayMagic magic = new ArrayMagic();
        int[] numbers = {1,2,3,4,5};

        System.out.println(magic.doesHaveElementGreaterThan(numbers, 3));
        System.out.println(magic.doesHaveElementGreaterThan(numbers, 5));
    }
}
