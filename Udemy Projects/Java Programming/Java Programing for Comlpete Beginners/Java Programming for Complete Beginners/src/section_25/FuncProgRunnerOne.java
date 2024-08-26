package section_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FuncProgRunnerOne {

    public static void main(String[] args) {

        List.of(23, 45, 67, 12).stream().filter(n -> n % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2));

        List.of(23, 45, 67, 12).stream().filter(n -> n % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2)).orElse(0);


        Optional<Integer> maxEven = List.of(23, 45, 67, 12)
                .stream()
                .filter(n -> n % 2 == 0)  // Filters out only even numbers.
                .max(Integer::compare);  // Finds the maximum even number.

        // Print the result
        if (maxEven.isPresent()) {
            System.out.println("The maximum even number is: " + maxEven.get());
        } else {
            System.out.println("No even numbers found.");
        }


        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Ant", "Bat"));

        printWithFiltering(list);
    }
        public static void printWithFiltering (List<String> list) {
            list.stream()
                    .filter(element -> element.endsWith("at"))
                    .forEach(element -> System.out.println("element - " + element));

        }
}

