package section_27;

import java.util.Scanner;

public class TryWithResourcesRunner {

    public static void main(String[] args) {

           try (Scanner scanner = new Scanner(System.in)) {
               int[] numbers = {1, 2, 3, 4, 5};
               int number = numbers[21];
           }

    }
}
