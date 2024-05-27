package lt.udemy.rolandas.section12;

import java.util.Scanner;

public class SwitchRunnerDay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of the day : ");
        int dayNumber = scanner.nextInt();
//        System.out.println("Your day is - " + dayNumber);

        switch (dayNumber) {
            case 0:
                System.out.println("Your day is - " + dayNumber + " it is sunday");
                break;
            case 1:
                System.out.println("Your day is - " + dayNumber + " it is monday");
                break;
            case 2:
                System.out.println("Your day is - " + dayNumber + " it is tuesday");
                break;
            case 3:
                System.out.println("Your day is - " + dayNumber + " it is wednesday");
                break;
            case 4:
                System.out.println("Your day is - " + dayNumber + " it is thursday");
                break;
            case 5:
                System.out.println("Your day is - " + dayNumber + " it is friday");
                break;
            case 6:
                System.out.println("Your day is - " + dayNumber + " it is saturday");
                break;
            default:
                System.out.println("Your day is - " + dayNumber + " the data your entered is no correct!");

        }


    }
}
