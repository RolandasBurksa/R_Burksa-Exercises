import java.util.Scanner;

public class MainMinMax {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter a number to extend, a letter to end: ");

            String input = scanner.nextLine();
            int number = 0;

            try {
                number = Integer.parseInt(input);
                if (number < min){
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            } catch (NumberFormatException e) {
                System.out.println("You entered a letter, the algorithm stops.");
                break;
            }
        }

        // Check if any numbers were entered
        if (min == Integer.MAX_VALUE || max == Integer.MIN_VALUE) {
            System.out.println("No valid numbers were entered.");
        } else {
            System.out.println("The min number = " + min + ", the max number = " + max);
        }

//        System.out.println("The min number = " + min + ", the max number = " + max);

    }
}
