package section_19;

public class ArrayMagicSecondRunner {

    public static void main(String[] args) {

        ArrayMagicSecond magic = new ArrayMagicSecond();
        int[] numbers = {10,20,20,5, 10};

        System.out.println("Second largest element: " + magic.findSecondLargestElement(numbers));
    }
}
