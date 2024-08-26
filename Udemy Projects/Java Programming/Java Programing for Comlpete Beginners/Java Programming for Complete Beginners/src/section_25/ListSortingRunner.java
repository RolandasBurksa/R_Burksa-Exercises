package section_25;

import java.util.List;

public class ListSortingRunner {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(3,5,8,213, 45,4,7, 3, 5);

        numbers.stream().sorted().forEach(element -> System.out.print(element + "  "));
        System.out.println();

        numbers.stream().distinct().sorted().forEach(element -> System.out.print(element + "  "));
        System.out.println();

        numbers.stream().distinct().map(e -> e * e).sorted().forEach(element -> System.out.print(element + " "));
    }
}
