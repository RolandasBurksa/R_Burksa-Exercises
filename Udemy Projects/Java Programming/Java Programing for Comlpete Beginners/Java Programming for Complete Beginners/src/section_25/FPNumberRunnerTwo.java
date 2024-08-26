package section_25;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FPNumberRunnerTwo {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,6,8,13,3,15);

        IntStream.range(1,10).forEach(p -> System.out.print(p + " "));
        System.out.println();

        System.out.println(IntStream.range(1, 11).reduce(0, (n1, n2) -> n1 + n2));
        System.out.println();

        IntStream.range(1,10).map(p -> p * p).forEach(p -> System.out.print(p + " "));
        System.out.println();

        List.of("Apple", "Ant", "Bat").stream().map(e -> e.toLowerCase()).forEach(e -> System.out.print(e + " "));
        System.out.println("**********");

//        List.of("Apple", "Ant", "Bat").stream().map(e -> e.length()).forEach(e -> System.out.print(e + " "));

        Stream.of("Apple", "Ant", "Bat").map(e -> e.length()).forEach(e -> System.out.print(e + " "));
        System.out.println();

        System.out.println( "Max - " + Stream.of(23, 12, 34, 53).max(Integer::compare).get());
        System.out.println(Stream.of(23, 12, 34, 53).min(Integer::compare).get());
        System.out.println("&&&&&&&&&");
        Stream.of(23, 12, 34, 53).filter(e -> e%2 == 1).forEach(e -> System.out.print("  " + e));

        List.of(23, 12, 34, 53, 88, 99).stream().filter(e -> e%2 == 0).collect(Collectors.toList());

        IntStream.range(1,11).map(e -> e * e).boxed().collect(Collectors.toList());

        int[] squares = IntStream.range(1, 10).map(e -> e * e).toArray();

    }

}
