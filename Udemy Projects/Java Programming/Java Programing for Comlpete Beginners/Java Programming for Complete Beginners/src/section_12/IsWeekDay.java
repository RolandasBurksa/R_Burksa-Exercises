package section_12;

import java.util.Scanner;

public class IsWeekDay {

    public static void main(String[] args) {

        System.out.print("Enter number o the day: ");
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();

        if ( dayNumber == 1){
            System.out.println("The Day is a Week day");
        } else {
            System.out.println("Input is incorrect!.");
        }
    }
}
