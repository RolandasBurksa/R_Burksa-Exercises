package section_12;

import java.util.Scanner;

public class MenuRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        int number1 = scanner.nextInt();
        System.out.println("The number you entered is - " + number1);

        System.out.print("Enter Number2: ");
        int number2 = scanner.nextInt();

        System.out.println("Choices Available are ");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Divert");
        System.out.println("4 - Multiply");

        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();

        System.out.println("Your Choices are:");
        System.out.println("Number1 - " + number1);
        System.out.println("Number2 - " + number2);
        System.out.println("Choice - " + choice);

        extracted(choice, number1, number2);
    }

    private static void extracted(int choice, int number1, int number2) {
        if (choice == 1) {
            System.out.println("Your result is: " + (number1 + number2));
        } else if (choice == 2) {
            System.out.println("Your result is: " + (number1 - number2));
        } else {
            System.out.println("Invalid Operation!.");
        }
    }
}
