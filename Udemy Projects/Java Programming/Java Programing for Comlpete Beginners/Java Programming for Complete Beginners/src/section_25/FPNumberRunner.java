package section_25;

import java.util.List;

public class FPNumberRunner {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,6,8,13,3,15);
//        numbers.stream()
//                .forEach(element -> System.out.println(element));

//       int sum = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);

        int sum = numbers.stream().filter(number -> number % 2 == 0).reduce(0,(number1, number2 ) -> number1 + number2);
//        final int sum = getSum(numbers);
        System.out.println("The sum is = " + sum);
    }

//    private static int getSum(List<Integer> numbers) {
//        int sum = 0;
//        for (int number: numbers) {
//            sum +=number;
//        }
//        return sum;
//    }
}
