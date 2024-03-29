package lt.techin.streams;

import java.util.List;
import java.util.stream.Collectors;

public class CoffeeOrder {
    public static void main(String[] args) {
        List<String> coffees = List.of("Cappuccino", "Americano", "Espresso", "Cortado", "Mocha","Cappuccino", "Flat White","Latte");

        List<String> coffeesEndingInO = coffees.stream()
                .distinct()
                .filter(s -> s.endsWith("o"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(coffeesEndingInO);

    }

}
