import java.util.Scanner;

public class MainFourth {

    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        while ( i <= 5) {
            System.out.println("Enter number#" + i);

            String input = scanner.nextLine();
            int number = 0;

            try {
                number = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                continue;
            }

            int numberValid = checkNumber(number);
            if (numberValid == -1) {
                System.out.println("The number#" + i + " is out of range (-100 to 100). Please try again.");
                continue; // Retry the same iteration
            }

            System.out.println("The number#" + i + " is " + numberValid);
            sum += numberValid;
            i++;
        }

        System.out.println("The sum of 5 numbers is: " + sum);

    }

    public static int checkNumber(int number) {

        if (number < -100 || number > 100) {
            return -1;
        }
        return number;
    }

}
