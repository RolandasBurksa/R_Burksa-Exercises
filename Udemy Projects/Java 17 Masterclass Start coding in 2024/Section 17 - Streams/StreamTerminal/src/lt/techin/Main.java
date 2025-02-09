package lt.techin;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

    var result = IntStream
            .iterate(0, i -> i <= 1000, i -> i = i + 3)
            .summaryStatistics();
    System.out.println("Result = " + result);

    }
}
