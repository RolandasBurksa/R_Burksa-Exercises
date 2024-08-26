package section_26;

import java.util.ArrayList;
import java.util.List;

public class FilterOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, -3, 5, 2, -4, 6, 8, 9,11);

        numbers.stream().filter(n -> n%2 !=0).forEach(System.out::println);
    }
}
