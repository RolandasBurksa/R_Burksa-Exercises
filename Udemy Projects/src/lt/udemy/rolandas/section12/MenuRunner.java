package lt.udemy.rolandas.section12;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        // Scanner(System.in);
        // Type obj = new Type(argument)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number1 : ");
//        Scanner scanner = new Scanner(System.in);
        float number1 = scanner.nextInt();
        System.out.println("The number you entered is - " + number1);

        System.out.print("Enter Number2 : ");
        float number2 = scanner.nextInt();
        System.out.println("The number you entered is - " + number2);
        System.out.println("_________________");

        System.out.println("Add choice : ");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Divide");
        System.out.println("4 - Multiply");

        System.out.print("Enter choice : ");
        int choice = scanner.nextInt();
        System.out.println("The number you entered is - " + choice);

        extracted(choice, number1, number2);

        switch (choice) {
            case 1:
                System.out.println(" Addition result is = " + (number1 + number2));
                break;
            case 2:
                System.out.println(" Subtract result is = " + (number1 - number2));
                break;
            case 3:
                System.out.println(" Divide result is = " + (number1 / number2));
                break;
            case 4:
                System.out.println(" Multiply result is = " + (number1 * number2));
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }


        }

    private static void extracted(int choice, float number1, float number2) {
        if (choice == 1) {
            System.out.println(" Addition result is = " + (number1 + number2));
        } else if (choice == 2) {
            System.out.println(" Subtract result is = " + (number1 - number2));
        } else if (choice == 3) {
//            float i = number1 / number2;
            System.out.println(" Divide result is = " + (number1 / number2));
        } else if (choice == 4) {
            System.out.println(" Multiply result is = " + (number1 * number2));
        } else {
            System.out.println("Invalid operation");
        }
    }

}

