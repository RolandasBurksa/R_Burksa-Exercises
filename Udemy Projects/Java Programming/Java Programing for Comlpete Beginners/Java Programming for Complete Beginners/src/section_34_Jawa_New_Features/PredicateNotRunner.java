package section_34_Jawa_New_Features;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {

    public static boolean isEven(Integer number){
        return number%2==0;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3,41,53,66,79,80,91);
        Predicate<Integer> evenNumberPredicate = number -> number%2 == 0;
//        numbers.stream().filter(evenNumberPredicate).forEach(System.out::println);

        numbers.stream().filter(evenNumberPredicate.negate()).forEach(System.out::println);

        System.out.println("***   ***");

        numbers.stream().filter(PredicateNotRunner::isEven).forEach(System.out::println);

        System.out.println("***   ***");

        numbers.stream().filter(Predicate.not(PredicateNotRunner::isEven)).forEach(System.out::println);

    }
}
